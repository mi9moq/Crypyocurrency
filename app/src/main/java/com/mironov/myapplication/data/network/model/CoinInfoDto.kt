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
    val price: String,
    @SerializedName("LASTTRADEID")
    val lastTraded: String,
    @SerializedName("LASTUPDATE")
    val lastUpdate: String,
    @SerializedName("LOWDAY")
    val lowDay: String,
    @SerializedName("HIGHDAY")
    val highDay: String,
    @SerializedName("IMAGEURL")
    val imageUrl: String,
)
