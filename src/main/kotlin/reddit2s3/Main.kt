package reddit2s3

import com.amazonaws.auth.profile.ProfileCredentialsProvider
import com.amazonaws.services.s3.AmazonS3Client
import com.beust.jcommander.JCommander
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

/**
 * (!) Note: Assumes AWS credentials have been setup.
 *           See http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html
 *
 * Example usage:
 *
 * reddit2s3.MainKt -t Kotlin -b reddit2s3
 */
fun main(args: Array<String>) {

    // Parse the command line arguments
    val command = Command()
    JCommander(command, *args)
    // Note: '!!' will cause an NPE if the thread parameter is missing
    // (this is ok for this demo)
    val thread = command.thread!!
    val bucket = command.bucket!!
    val url = sourceUrl(thread)

    val objectMapper = ObjectMapper().registerKotlinModule()

    // Fetch the data from reddit
    val json = fetchRedditData(sourceUrl(thread))
    // And convert to TSV
    val tsv = redditCommentToTSV(objectMapper, json)

    // Finally upload the TSV to Amazon S3
    uploadToS3(bucket, tsv)

    println("Stored comments from $url in S3 bucket $bucket")
}

fun fetchRedditData(targetUrl: String): String {
    val connection = establishConnection(targetUrl, 60 * 1000)
    return fetchData(connection)
}

fun sourceUrl(thread: String) : String {
    return "https://www.reddit.com/r/$thread/comments/.json"
}

fun uploadToS3(bucket: String, tsv: String){
    val s3Client = AmazonS3Client(ProfileCredentialsProvider())
    uploadToRepository(s3Client, bucket, "reddit.tsv", tsv)
}