package com.example.appstartup

import BaseInitializer
import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class TestIntelligenceInitializer : BaseInitializer<Boolean>() {

    override fun create(context: Context): Boolean {
        Log.i("TAG_TestIntelligenceInitializer", "Before TestIntelligenceInitializer2")
//        Thread.sleep(10000)

        runBlocking {
            delay(100)
        }
        Log.i("TAG_TestIntelligenceInitializer", "After TestIntelligenceInitializer2")
        return true
    }
}