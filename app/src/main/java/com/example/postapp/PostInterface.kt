package com.example.postapp

import retrofit2.Call
import retrofit2.http.GET

interface PostInterface {
    @GET("/posts")
    fun getPosts(): Call<ArrayList<PostItem>>
}