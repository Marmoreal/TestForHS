package com.example.testforhs.data.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MakeupApi(
    val id: Int,
    val name: String,
    val price: Int,
    val image_link: String,
    val description: String,
    val category: String
)
