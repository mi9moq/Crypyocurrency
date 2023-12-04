package com.mironov.myapplication.data.network.model

import com.google.gson.annotations.SerializedName

data class CoinResponse (
    @SerializedName("Data")
    val coinsList: List<CryptoMap>
)