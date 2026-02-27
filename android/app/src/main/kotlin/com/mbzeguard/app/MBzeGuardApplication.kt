package com.mbzeguard.app;

import android.app.Application
import android.content.Context

class MBzeGuardApplication : Application() {
    companion object {
        private lateinit var instance: MBzeGuardApplication
        fun getAppContext(): Context {
            return instance.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}