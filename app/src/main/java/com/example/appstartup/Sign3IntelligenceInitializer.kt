package com.example.appstartup

import BaseInitializer
import android.content.Context
import android.os.Build
import android.util.Log
import androidx.startup.Initializer
import com.sign3.intelligence.Options
import com.sign3.intelligence.Sign3Intelligence
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class Sign3IntelligenceInitializer : BaseInitializer<Boolean>() {

    override fun create(context: Context):Boolean {
        Log.i("TAG_Sign3IntelligenceInitializer", "Before Sign3IntelligenceInitializer")
//        Log.i("TAG_Sign3IntelligenceInitializer", "Before stopped")
//        if (Sign3Intelligence.stop()) {
//            Log.i("TAG_Sign3IntelligenceInitializer", "After stopped")
//            return false
//        }
        runBlocking {
            delay(10000)
        }
        val options = Options.Builder()
            .setClientId("test_tenant")
            .setClientSecret("secret-295OzNJj9L3nVUWQq56ACCN6f6zUiYGQlN8G7256")
            .setEnvironment(Options.ENV_DEV)
            .build()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {


            Sign3Intelligence.getInstance(context).initAsync(options) {
                Log.i("TAG_AppInstance", "Sign3Intelligence init : $it")
            }

            Log.i("TAG_Sign3IntelligenceInitializer", "After Sign3IntelligenceInitializer")
            return true
        }
        return false
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }


}