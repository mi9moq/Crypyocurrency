package com.mironov.myapplication.data.datasource

import com.mironov.myapplication.data.network.CoinApi
import com.mironov.myapplication.data.network.model.CoinInfoDto
import javax.inject.Inject

class CoinRemoteDataSourceImpl @Inject constructor(
    private val api: CoinApi
) : CoinRemoteDataSource {

    override suspend fun getList(currency: String): List<CoinInfoDto> {
        val response = api.getTopCoins(currency = currency)
        val coinsList = mutableListOf<CoinInfoDto>()
        response.coinsList.forEach { raw ->
            coinsList.add(raw.map.getValue(currency))
        }
        return coinsList
    }
}