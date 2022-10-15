package com.example.testforhs.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PagedDataResponse<T>(
    val count: Int,
    val next: String,
    val previous: String? = null,
    val results: List<T>
)