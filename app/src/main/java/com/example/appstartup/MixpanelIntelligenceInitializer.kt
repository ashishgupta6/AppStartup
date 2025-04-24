package com.example.appstartup

import BaseInitializer
import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import com.mixpanel.android.mpmetrics.MixpanelAPI
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class MixpanelIntelligenceInitializer : BaseInitializer<MixpanelAPI>() {

    override fun create(context: Context): MixpanelAPI {
        Log.i("TAG_TestIntelligenceInitializer", "Before MixPanelInitializer2")
//        Thread.sleep(10000)

        runBlocking {
            delay(200)
        }
        val mixpanel = MixpanelAPI.getInstance(context, "dd937bd3d2599d75c1793ffb6b35e8d9", false)
        Log.i("TAG_TestIntelligenceInitializer", "After MixPanelInitializer2")
        return mixpanel
    }
}