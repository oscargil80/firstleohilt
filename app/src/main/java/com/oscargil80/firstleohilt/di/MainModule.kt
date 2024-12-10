package com.oscargil80.firstleohilt.di

import com.oscargil80.firstleohilt.MiInterface
import com.oscargil80.firstleohilt.MiInterfaceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {



    @Singleton
    @Provides
    fun provideMiInterface():MiInterface{
        return MiInterfaceImpl()
    }

}