package com.example.insta.data.main

data class Story(
    val user: Post.User,
    val viewed: Boolean = false,
    val storyTitle: String,
    val storyDescription: String,
    val storyImage: String
)
