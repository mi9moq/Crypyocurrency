package com.mironov.myapplication.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.mironov.myapplication.di.DaggerAppComponent
import com.mironov.myapplication.presentation.CoinListViewModel
import com.mironov.myapplication.presentation.ViewModelFactory
import com.mironov.myapplication.ui.theme.CrypyocurrencyTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    private val component by lazy {
        DaggerAppComponent.create()
    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[CoinListViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContent {
            CrypyocurrencyTheme {
            }
        }
    }
}