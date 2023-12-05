package com.mironov.myapplication.di

import dagger.Component

@AppScope
@Component(
    modules = [
        CoinModule::class,
        DispatcherModule::class,
    ]
)
interface AppComponent {
}