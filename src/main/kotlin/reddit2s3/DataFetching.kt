package reddit2s3

import org.apache.commons.io.IOUtils
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

@Throws(IOException::class)
fun establishConnection(urlString: String, timeout : Int): HttpURLConnection {
    val url = URL(urlString)

    val httpConnection = url.openConnection() as HttpURLConnection
    httpConnection.connectTimeout = timeout
    httpConnection.setRequestProperty("User-Agent", "com:upwork:redditfetcher:0.0.1")

    return httpConnection

}

@Throws(IOException::class)
fun fetchData(httpConnection: HttpURLConnection): String {
    val byteOutputStream = ByteArrayOutputStream()
    httpConnection.inputStream.use { input ->
        byteOutputStream.use { output ->
            IOUtils.copy(input, output)
        }
    }

    return String(byteOutputStream.toByteArray())
}