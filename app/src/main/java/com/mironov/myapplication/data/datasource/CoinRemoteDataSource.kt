package com.mironov.myapplication.data.datasource

import com.mironov.myapplication.data.network.model.CoinInfoDto

interface CoinRemoteDataSource {

    suspend fun getList(currency: String): List<CoinInfoDto>
}