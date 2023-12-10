package com.mironov.myapplication.data.converter

import com.mironov.myapplication.data.network.model.CoinInfoDto
import com.mironov.myapplication.domain.entity.CoinInfo
import java.util.Locale
import javax.inject.Inject

class CoinConverter @Inject constructor() {

    companion object {
        private const val BASE_IMAGE_URL = "https://cryptocompare.com"
    }

    fun revert(from: CoinInfoDto): CoinInfo = CoinInfo(
        market = from.market,
        coinName = from.coinName,
        currency = from.currency,
        price = from.price,
        lastUpdate = from.lastUpdate,
        lastTraded = from.lastTraded,
        lowDay = from.lowDay,
        highDay = from.highDay,
        imageUrl = BASE_IMAGE_URL + from.imageUrl,
        priceChange24Hour = from.priceChange24Hour,
        percentChange24Hour = from.percentChange24Hour,
    )
}