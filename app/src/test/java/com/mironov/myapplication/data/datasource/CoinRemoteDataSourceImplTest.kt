package com.mironov.myapplication.data.datasource

import com.mironov.myapplication.data.network.CoinApi
import com.mironov.myapplication.untils.CoinData
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class CoinRemoteDataSourceImplTest {

    private val api: CoinApi = mock()
    private val dataSource = CoinRemoteDataSourceImpl(api)
    private val response = CoinData.coinResponse
    private val currency = CoinData.currency
    private val coinDtoList = CoinData.coinDtoList

    @Test
    fun `get list EXPECT coinsDto list`() = runTest {

        whenever(api.getTopCoins(currency = currency)) doReturn response

        val expect = coinDtoList
        val actual = dataSource.getList(currency)

        assertEquals(expect,actual)
    }
}