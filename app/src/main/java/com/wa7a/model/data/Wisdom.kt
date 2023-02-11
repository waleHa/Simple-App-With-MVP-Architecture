package com.wa7a.model.data

import com.google.gson.annotations.SerializedName

data class Wisdom(
    @SerializedName("q")
    val quote: String,

    @SerializedName("a")
    val author: String,


){
    @SerializedName("h")
    val hyperLink: String? = null
}