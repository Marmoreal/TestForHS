package com.example.testforhs.domain.usecase

import androidx.paging.PagingData
import com.example.testforhs.domain.model.Makeup
import com.example.testforhs.domain.repositories.MakeupRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMakeupUseCase @Inject constructor(
    private val makeupRepository: MakeupRepository
) {

    suspend operator fun invoke(): List<Makeup> {
        return makeupRepository.getMakeup()
    }
}