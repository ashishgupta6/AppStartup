package com.example.appstartup

import android.app.Application
import android.util.Log
import androidx.startup.AppInitializer
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class AppInstance: Application() {

    override fun onCreate() {

        Log.e("TAG_APPINSTANCE","started App ")

        runBlocking {
            delay(1000)
        }

        Log.e("TAG_APPINSTANCE","ended App ")

        super.onCreate()
    }
}