package com.example.testforhs.data.api

import com.example.testforhs.data.model.MakeupApi
import retrofit2.http.GET

interface MakeupApiService {
    @GET("products")
    suspend fun getMakeup(
    ): List<MakeupApi>
}