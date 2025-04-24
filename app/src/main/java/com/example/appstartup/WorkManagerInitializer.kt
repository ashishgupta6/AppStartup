package com.example.appstartup

import BaseInitializer
import android.content.Context
import android.media.VolumeShaper
import android.os.Build
import android.util.Log
import androidx.startup.Initializer
import androidx.work.Configuration
import androidx.work.WorkManager
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


// Initializes WorkManager.
class WorkManagerInitializer : BaseInitializer<Boolean>() {

    override fun create(context: Context): Boolean {
        Log.i("TAG_WorkManagerInitializer", "Before WorkManagerInitializer2")

//        Thread.sleep(3000)

        runBlocking {
            delay(300)
        }
        Log.i("TAG_WorkManagerInitializer", "After WorkManagerInitializer2")
        return true
    }
}