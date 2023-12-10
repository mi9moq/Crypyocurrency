package com.mironov.myapplication.data.network.model

import com.google.gson.annotations.SerializedName

data class CoinInfoDto(
    @SerializedName("CCCAGG")
    val market: String,
    @SerializedName("FROMSYMBOL")
    val coinName: String,
    @SerializedName("TOSYMBOL")
    val currency: String,
    @SerializedName("PRICE")
    val price: Float,
    @SerializedName("LASTTRADEID")
    val lastTraded: Long,
    @SerializedName("LASTUPDATE")
    val lastUpdate: Long,
    @SerializedName("LOWDAY")
    val lowDay: Float,
    @SerializedName("HIGHDAY")
    val highDay: Float,
    @SerializedName("IMAGEURL")
    val imageUrl: String,
    @SerializedName("CHANGE24HOUR")
    val priceChange24Hour: Float,
    @SerializedName("CHANGEPCT24HOUR")
    val percentChange24Hour: Float,
)
