package com.example.testforhs.domain.repositories

import androidx.paging.PagingData
import com.example.testforhs.domain.model.Makeup
import kotlinx.coroutines.flow.Flow

interface MakeupRepository {
    suspend fun getMakeup(): List<Makeup>
}