package com.mironov.myapplication.untils

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
        imageUrl = "url"
    )

    val coinList = listOf(coin)
}