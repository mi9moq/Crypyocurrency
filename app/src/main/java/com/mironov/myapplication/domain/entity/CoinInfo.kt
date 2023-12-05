package com.mironov.myapplication.domain.entity

data class CoinInfo(
    val market: String,
    val coinName: String,
    val currency: String,
    val price: String,
    val lastTraded: String,
    val lastUpdate: String,
    val lowDay: String,
    val highDay: String,
    val imageUrl: String,
)