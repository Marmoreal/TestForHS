package com.example.testforhs.data.repositories

import com.example.testforhs.data.api.MakeupApiService
import com.example.testforhs.data.mappers.toMakeup
import com.example.testforhs.domain.model.Makeup
import com.example.testforhs.domain.repositories.MakeupRepository
import javax.inject.Inject

class MakeupRepositoryImpl @Inject constructor(
    private val makeupApiService: MakeupApiService
) : MakeupRepository {
    override suspend fun getMakeup(): List<Makeup> {
        return makeupApiService.getMakeup().map {
            it.toMakeup()
        }
    }
}