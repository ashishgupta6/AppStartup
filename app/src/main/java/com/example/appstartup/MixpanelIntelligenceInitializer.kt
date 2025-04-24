package com.example.appstartup

import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class MixpanelIntelligenceInitializer : Initializer<Boolean> {

    override fun create(context: Context):Boolean {
        Log.i("TAG_MixpanelIntelligenceInitializer", "Before MixpanelIntelligenceInitializer")
//        Thread.sleep(5000)

        runBlocking {
            delay(5000)
        }
        Log.i("TAG_MixpanelIntelligenceInitializer", "After MixpanelIntelligenceInitializer")
        return true
    }


    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}