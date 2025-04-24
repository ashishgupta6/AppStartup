package com.example.appstartup

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
class WorkManagerInitializer : Initializer<Boolean> {
    override fun create(context: Context): Boolean {
        Log.i("TAG_WorkManagerInitializer", "Before WorkManagerInitializer")

//        Thread.sleep(3000)

        runBlocking {
            delay(3000)
        }
        Log.i("TAG_WorkManagerInitializer", "After WorkManagerInitializer")
        return true
    }
    override fun dependencies(): List<Class<out Initializer<*>>> {
        // No dependencies on other libraries.
        return emptyList()
    }
}