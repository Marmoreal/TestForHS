package com.example.testforhs.di

import com.example.testforhs.data.repositories.MakeupRepositoryImpl
import com.example.testforhs.domain.repositories.MakeupRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindMakeupRepository(makeupRepositoryImpl: MakeupRepositoryImpl): MakeupRepository
}