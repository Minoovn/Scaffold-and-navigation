package com.example.scaffoldandnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.scaffoldandnavigation.ui.screens.ScaffoldApp
import com.example.scaffoldandnavigation.ui.theme.ScaffoldandnavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScaffoldandnavigationTheme {
                ScaffoldApp()
            }
        }
    }
}
