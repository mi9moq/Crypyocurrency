package com.mironov.myapplication.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mironov.myapplication.domain.usecase.GetCoinListUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class CoinListViewModel @Inject constructor(
    private val getCoinListUseCase: GetCoinListUseCase
) : ViewModel() {

    private val _state = MutableStateFlow<CoinListUiState>(CoinListUiState.Initial)
    val state = _state.asStateFlow()

    init {
        loadCoinList()
    }

    private fun loadCoinList() {
        viewModelScope.launch {
            _state.value = CoinListUiState.Loading
            val coinList = getCoinListUseCase("USD")
            _state.value = CoinListUiState.Data(coinList)
        }
    }
}