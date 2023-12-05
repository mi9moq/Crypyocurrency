package com.mironov.myapplication.di

import dagger.Component

@AppScope
@Component(
    modules = [
        NetworkModule::class,
        DispatcherModule::class,
    ]
)
interface AppComponent {
}