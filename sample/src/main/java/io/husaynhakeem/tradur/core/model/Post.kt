package io.husaynhakeem.tradur.core.model


data class Post(
        val imageUrl: String = "",
        val username: String = "",
        var description: String = "",
        val publicationDate: String = "")