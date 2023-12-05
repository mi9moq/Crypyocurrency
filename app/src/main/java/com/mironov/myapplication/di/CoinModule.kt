package com.mironov.myapplication.di

import com.mironov.myapplication.data.datasource.CoinRemoteDataSource
import com.mironov.myapplication.data.datasource.CoinRemoteDataSourceImpl
import com.mironov.myapplication.data.network.CoinApi
import com.mironov.myapplication.data.repository.CoinRepositoryImpl
import com.mironov.myapplication.domain.repository.CoinRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

@Module
interface CoinModule {

    @Binds
    @AppScope
    fun bindCoinRemoteDataSource(impl: CoinRemoteDataSourceImpl): CoinRemoteDataSource

    @Binds
    @AppScope
    fun bindCoinRepository(impl: CoinRepositoryImpl): CoinRepository

    companion object {
        private const val BASE_URL = "https://min-api.cryptocompare.com/data/"

        @Provides
        @AppScope
        fun provideHttpClient(): OkHttpClient =
            OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }).build()

        @Provides
        @AppScope
        fun provideRetrofit(httpClient: OkHttpClient): Retrofit =
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        @Provides
        @AppScope
        fun provideCoinApi(retrofit: Retrofit): CoinApi {
            return retrofit.create()
        }
    }
}