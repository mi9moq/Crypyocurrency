package com.mironov.myapplication.data.repository

import com.mironov.myapplication.data.converter.CoinConverter
import com.mironov.myapplication.data.datasource.CoinRemoteDataSource
import com.mironov.myapplication.di.IoDispatcher
import com.mironov.myapplication.domain.entity.CoinInfo
import com.mironov.myapplication.domain.repository.CoinRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    private val dataSource: CoinRemoteDataSource,
    private val converter: CoinConverter,
): CoinRepository {
    override suspend fun getList(currency: String): List<CoinInfo> = withContext(ioDispatcher){
        dataSource.getList(currency).map(converter::revert)
    }
}