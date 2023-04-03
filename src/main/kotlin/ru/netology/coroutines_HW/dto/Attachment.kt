package ru.netology.coroutines_HW.dto

data class Attachment(
    val url: String,
    val description: String,
    val type: AttachmentType,
)

enum class AttachmentType {
    VIDEO, IMAGE, STRING
}
