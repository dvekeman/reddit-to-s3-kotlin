package reddit2s3

import com.amazonaws.AmazonClientException
import com.amazonaws.AmazonServiceException
import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.model.ObjectMetadata
import com.amazonaws.services.s3.model.PutObjectRequest
import java.nio.charset.Charset

private class S3UploadException(message : String, exception : Exception) : Exception(message, exception)

@Throws(AmazonServiceException::class, AmazonClientException::class)
fun uploadToRepository(s3Client : AmazonS3Client, bucket: String, key: String, tsv : String): String {
    try {
        println("Uploading a new object to S3 from a file\n")

        val bytes = tsv.toByteArray(Charset.defaultCharset())
        val metadata = ObjectMetadata()
        metadata.contentLength = bytes.size.toLong()

        val putObjectRequest = PutObjectRequest(bucket, key, bytes.inputStream(), metadata)
        s3Client.putObject(putObjectRequest)

        return key
    }
    catch (serverException: AmazonServiceException) {
        val message =
            "Caught an AmazonServiceException, which means your request made it to Amazon S3, " +
            "but was rejected with an error response for some reason.\n" +
            "Error Message:    ${serverException.message}\n" +
            "HTTP Status Code: ${serverException.statusCode}\n" +
            "AWS Error Code:   ${serverException.errorCode}\n" +
            "Error Type:       ${serverException.errorType}\n" +
            "Request ID:       ${serverException.requestId}\n"

        throw S3UploadException(message, serverException)
    }
    catch (clientException: AmazonClientException) {
        val message =
            "Caught an AmazonClientException, which means the client encountered " +
            "an internal error while trying to communicate with S3, such as not being " +
            "able to access the network.\n" +
            "Error Message: ${clientException.message}"

        throw S3UploadException(message, clientException)
    }

}