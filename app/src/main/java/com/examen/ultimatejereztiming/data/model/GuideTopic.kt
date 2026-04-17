package com.examen.ultimatejereztiming.data.model

enum class ContentType {
    MARKDOWN,
    IMAGE,
    SCHEDULE,
    NATIVE_TEXT
}

data class GuideTopic(
    val id: String,
    val title: String,
    val assetPath: String = "",
    val type: ContentType,
    val content: String = "",
    val category: String = "Información"
)
