package com.example.postapp

import com.google.gson.annotations.SerializedName

data class PostItem(
    @SerializedName("userId")
    val userId :String? = "" ,
    @SerializedName("id")
    val id : String ? = "" ,
    @SerializedName("title")
    val title : String? = "",
    @SerializedName("body")
    val body : String? = "" ,

)

