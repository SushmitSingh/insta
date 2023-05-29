package com.example.insta.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.insta.data.main.Post
import com.example.insta.data.main.Story

class MainViewModel : ViewModel() {


    //LiveData for Posts
    val posts = mutableListOf<Post>()

    //LiveData for Stories
    val stories = mutableListOf<Story>()

    init {
        addStories()
        addPosts()
    }

    //Some Pre Added Posts
    private fun addPosts(){}


    //Some Pre Added Story
    private fun addStories() {
        stories.add(
            Story(
                Post.User(
                    "Your Story",
                    "https://images.unsplash.com/photo-1612833609248-4b7b7b0b2b0b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c3Rvcnl8ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80"
                ),
                true,
                "Your Story",
                "Add to your story",
                "https://images.unsplash.com/photo-1612833609248-4b7b7b0b2b0b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8c3Rvcnl8ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80"
            )
        )
        stories.add(
            Story(
                Post.User(
                    "John",
                    "https://i.pinimg.com/originals/0f/6a/0a/0f6a0a0b0b0b0b0b0b0b0b0b0b0b0b0b.jpg"
                ),
                false,
                "John",
                "New to Instagram",
                "https://i.pinimg.com/originals/0f/6a/0a/0f6a0a0b0b0b0b0b0b0b0b0b0b0b0b0b.jpg"
            )
        )
        stories.add(
            Story(
                Post.User(
                    "Jane",
                    "https://i.pinimg.com/originals/0f/6a/0a/0f6a0a0b0b0b0b0b0b0b0b0b0b0b0b0b.jpg"
                ),
                false,
                "Jane",
                "New to Instagram",
                "https://i.pinimg.com/originals/0f/6a/0a/0f6a0a0b0b0b0b0b0b0b0b0b0b0b0b0b.jpg"
            )
        )
        stories.add(
            Story(
                Post.User(
                    "John",
                    "https://i.pinimg.com/originals/0f/6a/0a/0f6a0a0b0b0b0b0b0b0b0b0b0b0b0b0b.jpg"
                ),
                false,
                "John",
                "New to Instagram",
                "https://i.pinimg.com/originals/0f/6a/0a/0f6a0a0b0b0b0b0b0b0b0b0b0b0b0b0b.jpg"
            )
        )

    }

}