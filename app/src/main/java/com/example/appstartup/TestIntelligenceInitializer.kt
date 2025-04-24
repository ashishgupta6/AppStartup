package com.example.appstartup

import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class TestIntelligenceInitializer : Initializer<Boolean> {

    override fun create(context: Context):Boolean {
        Log.i("TAG_TestIntelligenceInitializer", "Before TestIntelligenceInitializer")
//        Thread.sleep(10000)

        runBlocking {
            delay(10000)
        }
        Log.i("TAG_TestIntelligenceInitializer", "After TestIntelligenceInitializer")
        return true
    }


    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}