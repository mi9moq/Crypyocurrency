package com.mironov.myapplication.untils

import com.mironov.myapplication.data.network.model.CoinInfoDto
import com.mironov.myapplication.data.network.model.CoinResponse
import com.mironov.myapplication.data.network.model.CryptoMap
import com.mironov.myapplication.domain.entity.CoinInfo

object CoinData {

    val coin = CoinInfo (
        market = "market",
        coinName = "name",
        currency = "USD",
        price = 1.0f,
        lastTraded = 1701769790,
        lastUpdate = 1701769790,
        lowDay = 1.0f,
        highDay = 1.0f,
        imageUrl = "https://cryptocompare.comurl",
        priceChange24Hour = "-2.13",
        percentChange24Hour = "-0.31"
    )

    val coinDto = CoinInfoDto (
        market = "market",
        coinName = "name",
        currency = "USD",
        price = 1.0f,
        lastTraded = 1701769790,
        lastUpdate = 1701769790,
        lowDay = 1.0f,
        highDay = 1.0f,
        imageUrl = "url",
        priceChange24Hour = -2.126f,
        percentChange24Hour = -0.313f
    )

    val currency = "USD"
    private val raw = CryptoMap(mapOf(Pair(currency, coinDto)))

    val coinList = listOf(coin)
    val coinDtoList = listOf(coinDto)


    val coinResponse = CoinResponse(listOf(raw))
}