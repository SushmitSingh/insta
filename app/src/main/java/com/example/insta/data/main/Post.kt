package com.example.insta.data.main

data class Post(
    val postTitle: String,
    val postDescription: String,
    val postImage: String,
    val user: User
) {
   data class User (
        val userName: String,
        val userImage: String
    )
}
