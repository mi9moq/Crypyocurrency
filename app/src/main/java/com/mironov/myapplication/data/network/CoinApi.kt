package com.mironov.myapplication.data.network

import com.mironov.myapplication.data.network.model.CoinResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CoinApi {

    @GET("top/totalvolfull")
    suspend fun getTopCoins(
        @Query("limit") limit: Int,
        @Query("tsym") currency: String,
    ): CoinResponse
}