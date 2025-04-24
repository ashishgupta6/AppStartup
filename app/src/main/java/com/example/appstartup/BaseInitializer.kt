//package com.example.appstartup
//
//import android.content.Context
//import android.util.Log
//import androidx.startup.Initializer
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.runBlocking
//
////class BaseInitializer : Initializer<T> {
////
////    override fun create(context: Context): T {
////        // Initialization logic here
////    }
////
////    override fun dependencies(): List<Class<out Initializer<*>>> {
////        // Specify any dependencies here
////        return emptyList() // If there are no dependencies
////    }
////}
//
//class BaseInitializer<T : Any>(private val creator: (Context) -> T) : Initializer<T> {
//
//    override fun create(context: Context): T {
//        return creator(context) // Calls the function to create an instance of T
//    }
//
//    override fun dependencies(): List<Class<out Initializer<*>>> {
//        return emptyList() // Add dependencies if needed
//    }
//}
