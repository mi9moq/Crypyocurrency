package com.mironov.myapplication.data.repository

import com.mironov.myapplication.data.converter.CoinConverter
import com.mironov.myapplication.data.datasource.CoinRemoteDataSource
import com.mironov.myapplication.data.network.CoinApi
import com.mironov.myapplication.untils.CoinData
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class CoinRepositoryImplTest {

    private val converter: CoinConverter = mock()
    private val api: CoinApi = mock()
    private val dataSource: CoinRemoteDataSource = mock()

    private val currency = CoinData.currency
    private val coinDtoList = CoinData.coinDtoList
    private val coinList = CoinData.coinList
    private val coin = CoinData.coin
    private val coinDto = CoinData.coinDto
    private val response = CoinData.coinResponse

    @Test
    fun `getList EXPECT coins list`() = runTest {
        val dispatcher = UnconfinedTestDispatcher(testScheduler)
        val repository = CoinRepositoryImpl(dispatcher, dataSource, converter)
        whenever(api.getTopCoins(currency = currency)) doReturn response
        whenever(converter.revert(coinDto)) doReturn coin
        whenever(dataSource.getList(currency)) doReturn coinDtoList

        val expected = coinList
        val actual = repository.getList(currency)

        assertEquals(expected, actual)
    }
}