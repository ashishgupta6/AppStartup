package com.example.appstartup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appstartup.ui.theme.AppStartupTheme
import com.sign3.intelligence.Sign3Intelligence

class MainActivity : ComponentActivity() {
    val sign3Intelligence = Sign3Intelligence.getInstance(this@MainActivity)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppStartupTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        sign3Intelligence,
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(sign3Intelligence: Sign3Intelligence, name: String, modifier: Modifier = Modifier) {
    Text(
        text = "${sign3Intelligence.getSessionId()}",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppStartupTheme {
//        Greeting("Android")
    }
}