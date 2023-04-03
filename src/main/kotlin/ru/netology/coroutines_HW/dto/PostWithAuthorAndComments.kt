package ru.netology.coroutines_HW.dto

data class PostWithAuthorAndComments(
    val author: Author,
    val post: Post,
    val comments: List<CommentWithAuthor>,
)
