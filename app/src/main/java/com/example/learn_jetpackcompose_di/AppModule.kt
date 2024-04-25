package com.example.learn_jetpackcompose_di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Singleton
    @Provides
    @Named("API_URI")
    fun provideWebAPI(): String = "https://api.github.com/"

}