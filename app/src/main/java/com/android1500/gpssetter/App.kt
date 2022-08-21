package com.android1500.gpssetter

import android.app.Application
import com.google.android.material.color.DynamicColors
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@Suppress("Unused")
@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        commonInit()
    }

    companion object {
        fun commonInit() {
            if (BuildConfig.DEBUG) {
                Timber.plant(Timber.DebugTree())
            }
        }
    }
}