package reddit2s3

import com.fasterxml.jackson.databind.ObjectMapper

fun parseRedditComment(objectMapper : ObjectMapper, json: String) : List<RedditComment> {
    val tree = objectMapper.readTree(json)
    val children = tree.last()?.get("children") ?:
                   tree.last()?.last()?.get("children")

    val comments = children
            ?.map { child ->
                child.get("kind").asText() to child.get("data")
            }
            ?.filter { child -> child.first != "more" }
            ?.map { child ->
                val data = child.second
                val id = data.get("id").asText()
                val body = data.get("body")?.asText() ?: ""
                RedditComment(id, body)
            } ?: return listOf()

    return comments

}