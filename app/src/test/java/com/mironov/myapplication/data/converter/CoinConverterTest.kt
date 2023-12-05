package com.mironov.myapplication.data.converter

import com.mironov.myapplication.untils.CoinData
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CoinConverterTest {

    private val coin = CoinData.coin
    private val coinDto = CoinData.coinDto
    private val converter = CoinConverter()

    @Test
    fun `revert EXPECT coin`() {

        val expected = coin
        val actual = converter.revert(coinDto)

        assertEquals(expected, actual)
    }
}