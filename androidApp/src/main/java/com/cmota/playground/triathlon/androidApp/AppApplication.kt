package com.cmota.playground.triathlon.androidApp

import android.app.Application
import com.cmota.playground.triathlon.shared.appContext

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        appContext = this
    }
}