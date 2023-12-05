package com.mironov.myapplication.domain.usecase

import com.mironov.myapplication.domain.repository.CoinRepository
import javax.inject.Inject

class GetCoinListUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    suspend operator fun invoke() = repository.getList()
}