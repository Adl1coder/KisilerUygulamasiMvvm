package com.example.kisileruygulamasimvvm.di

import com.example.kisileruygulamasimvvm.data.repo.KisilerDaRepository
import com.example.kisileruygulamasimvvm.retrofit.ApiUtils
import com.example.kisileruygulamasimvvm.retrofit.KisilerDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideKisilerDaRepository(kdao: KisilerDao) : KisilerDaRepository{
        return KisilerDaRepository(kdao)
    }

    @Provides
    @Singleton
    fun provideKisilerDao() : KisilerDao{
        return ApiUtils.getKisilerDao()
    }
}