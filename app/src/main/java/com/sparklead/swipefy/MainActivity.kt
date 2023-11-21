package com.sparklead.swipefy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.sparklead.swipefy.app.SwipefyApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwipefyApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SwipefyApp()
}