package com.mironov.myapplication.domain.usecase

import com.mironov.myapplication.domain.repository.CoinRepository
import com.mironov.myapplication.untils.CoinData
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

class GetCoinListUseCaseTest {

    private val repository: CoinRepository = mock()
    private val useCase = GetCoinListUseCase(repository)
    private val coinList = CoinData.coinList
    private val currency = "USD"

    @Test
    fun `get EXPECT list coins`() = runTest {

        whenever(repository.getList(currency)) doReturn coinList

        val expect = coinList
        val actual = useCase(currency)

        assertEquals(expect,actual)
    }
}