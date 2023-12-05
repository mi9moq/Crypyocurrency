package com.mironov.myapplication.data.network.model

import com.google.gson.annotations.SerializedName

data class CryptoMap (
    @SerializedName("RAW")
    val map: Map<String, CoinInfoDto>
)