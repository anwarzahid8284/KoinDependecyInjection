package com.example.koindepndencyinjection

import android.app.Application
import com.example.koindepndencyinjection.di.appModule
import org.koin.core.context.startKoin

class AppStart:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule)
        }
    }

}