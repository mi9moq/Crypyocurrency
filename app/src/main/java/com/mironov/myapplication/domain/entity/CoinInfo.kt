package com.mironov.myapplication.domain.entity

data class CoinInfo(
    val market: String,
    val coinName: String,
    val currency: String,
    val price: Float,
    val lastTraded: Long,
    val lastUpdate: Long,
    val lowDay: Float,
    val highDay: Float,
    val imageUrl: String,
)