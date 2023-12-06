package com.mironov.myapplication.presentation

import com.mironov.myapplication.domain.entity.CoinInfo

sealed interface CoinListUiState {

    object Initial : CoinListUiState

    object Loading : CoinListUiState

    data class Data(val content: List<CoinInfo>) : CoinListUiState

    data class Error(val message: String) : CoinListUiState
}