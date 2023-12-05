package com.mironov.myapplication.domain.repository

import com.mironov.myapplication.domain.entity.CoinInfo

interface CoinRepository {

    suspend fun getList(): List<CoinInfo>
}