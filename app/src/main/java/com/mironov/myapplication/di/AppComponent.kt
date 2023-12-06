package com.mironov.myapplication.di

import com.mironov.myapplication.ui.MainActivity
import dagger.Component

@AppScope
@Component(
    modules = [
        CoinModule::class,
        DispatcherModule::class,
    ]
)
interface AppComponent {

    fun inject(activity: MainActivity)
}