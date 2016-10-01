package reddit2s3

import com.fasterxml.jackson.databind.ObjectMapper
import java.io.IOException

@Throws(IOException::class)
fun redditCommentToTSV(objectMapper: ObjectMapper, json: String): String {
    val comments = parseRedditComment(objectMapper, json)

    var result = ""
    comments.forEach { comment ->
        val line = listOf(comment.id, comment.body.replace("\n", " ")).joinToString("\t")
        result += line + System.lineSeparator()
    }

    return result;
}