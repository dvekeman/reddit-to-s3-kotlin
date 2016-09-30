package com.upwork

import com.amazonaws.AmazonClientException
import com.amazonaws.AmazonServiceException
import com.amazonaws.auth.profile.ProfileCredentialsProvider
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.model.PutObjectRequest
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.upwork.reddit.RedditStreamWriter
import com.upwork.reddit.model.Child
import org.apache.commons.io.IOUtils
import rx.lang.kotlin.PublishSubject
import rx.subjects.PublishSubject
import java.io.*
import java.net.HttpURLConnection
import java.net.URL
import java.nio.file.Files
import java.text.SimpleDateFormat
import java.util.*

private val REDDIT_URL = "https://www.reddit.com/r/"
private val bucketName = "***ENTER BUCKET NAME***"

// This is the data we parse from a reddit JSON result
data class RedditPost(val id: String = "", val title: String = "", val url: String = "")

/**
 * Fetch a reddit subpost, e.g. Kotlin/top/.json?count=100 and return a JSON file
 * or an empty optional if any exception occurred.
 * TODO: this should be an Either
 */
@Throws(IOException::class)
fun fetch(subpost: String): Optional<File> {
    val url = URL(REDDIT_URL + subpost)
    val httpConn = url.openConnection() as HttpURLConnection
    httpConn.connectTimeout = 60 * 1000
    httpConn.setRequestProperty("User-Agent", "com:upwork:redditfetcher:0.0.1")

    return Optional.of(fetchAttachmentContent(httpConn))
}

/**
 * Get the contents of an HTTP url (e.g. a JSON file)
 */
@Throws(IOException::class)
private fun fetchAttachmentContent(httpConn: HttpURLConnection): File {
    val outFile = Files.createTempFile(UUID.randomUUID().toString(), ".json").toFile()
    httpConn.inputStream.use({ `in` ->

//        val disposition = httpConn.getHeaderField("Content-Disposition")
//        val contentType = httpConn.getContentType()
//        val contentLength = httpConn.getContentLength()
//
//        println("Content-Type = " + contentType)
//        println("Content-Disposition = " + disposition)
//        println("Content-Length = " + contentLength)
        println("Data fetched into " + outFile.getAbsolutePath())

        FileOutputStream(outFile).use({ out -> IOUtils.copy(`in`, out) })
    })
    return outFile
}

/**
 * Map a Reddit Post to a TSV file
 */
@Throws(IOException::class)
fun redditPostToTsv(file: File): Optional<File> {
    val posts = PublishSubject<RedditPost>()

    val outfile: File
    outfile = Files.createTempFile(UUID.randomUUID().toString(), ".txt").toFile()

    println("Writing to file " + outfile.absolutePath)
    BufferedWriter(FileWriter(outfile)).use { writer ->
        val redditTsvStreamWriter = RedditStreamWriter(writer)
        val tsvMapper = { redditPost: RedditPost ->
            String.format("%s\t%s\t%s",
                    redditPost.id,
                    redditPost.title,
                    redditPost.url)
        }
        posts.map({ redditPost -> tsvMapper.invoke(redditPost) })
                .subscribe(
                        { tsvLine: String -> redditTsvStreamWriter.append(tsvLine) },
                        { throwable: Throwable -> throwable.printStackTrace() },
                        { redditTsvStreamWriter.close(true) })

        parseRedditResult(posts, file)
//            val dummies = listOf(
//                    RedditPost("1", "title1", "url1"),
//                    RedditPost("2", "title2", "url2"),
//                    RedditPost("3", "title3", "url3")
//            )
//            dummies.map { it -> posts.onNext(it) }
    }
    return Optional.of(outfile)
}

/**
 * Parse Reddit result JSON from the input file and emit an event each time we found a post
 */
private fun parseRedditResult(redditPosts: PublishSubject<RedditPost>, file: File) {

    val obj: Child = jacksonObjectMapper()
            .readValue(file, Child::class.java)
    val children: List<Any> = obj?.data.additionalProperties.get("children") as List<Any>
    val posts = children
            .map { child ->
                (child as Map<String, Any>)?.get("data") as Map<String, Any>
            }
            .map { childData ->
                RedditPost(
                        childData.getOrElse("id") { "" } as String,
                        childData.getOrElse("type") { "" } as String,
                        childData.getOrElse("url") { "" } as String)
            }

    posts.forEach {
        redditPosts.onNext(it)
    }
}

/**
 * Upload a file to an amazon S3 bucket
 */
//TODO: throw or catch?
//@Throws(AmazonServiceException::class, AmazonClientException::class)
fun uploadToRepository(file: File): Optional<String> {
    val s3client = AmazonS3Client(ProfileCredentialsProvider())
    try {
        println("Uploading a new object to S3 from a file\n")
        val sdf = SimpleDateFormat("ddMMyyyy_hhmmss")
        val date = sdf.format(Date())
        val key = String.format("%s_%s.json", file.name, date)
        val result = s3client.putObject(PutObjectRequest(
                bucketName, key, file))
        return Optional.of(key)
    } catch (ase: AmazonServiceException) {
        println("Caught an AmazonServiceException, which " +
                "means your request made it " +
                "to Amazon S3, but was rejected with an error response" +
                " for some reason.")
        System.out.println("Error Message:    " + ase.message)
        System.out.println("HTTP Status Code: " + ase.getStatusCode())
        System.out.println("AWS Error Code:   " + ase.getErrorCode())
        System.out.println("Error Type:       " + ase.getErrorType())
        System.out.println("Request ID:       " + ase.getRequestId())
    } catch (ace: AmazonClientException) {
        println("Caught an AmazonClientException, which " +
                "means the client encountered " +
                "an internal error while trying to " +
                "communicate with S3, " +
                "such as not being able to access the network.")
        System.out.println("Error Message: " + ace.message)
    }

    return Optional.empty<String>()
}

fun main(args: Array<String>) {
    val uploadResult = fetch("Kotlin/top/.json?count=100")
            .flatMap { file -> redditPostToTsv(file) }
            .flatMap { file -> uploadToRepository(file) }
    uploadResult.ifPresent { it -> println("File $it uploaded into bucket ${com.upwork.bucketName}") }
}

