package com.oscargil80.firstleohilt.di

import com.oscargil80.firstleohilt.WordRepository
import com.oscargil80.firstleohilt.WordRepositoryImpl
import com.oscargil80.firstleohilt.database.WordDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object WordModule {

    @Provides
    fun provideWordRepository(wordDao:WordDAO):WordRepository{
        return WordRepositoryImpl(wordDao)
    }
}