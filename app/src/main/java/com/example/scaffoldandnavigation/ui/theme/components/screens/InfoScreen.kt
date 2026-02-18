package com.example.scaffoldandnavigation.ui.screens

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.navigation.NavController
import com.example.scaffoldandnavigation.ui.components.ScreenTopBar

@Composable
fun InfoScreen(navController: NavController) {
    Scaffold(
        topBar = { ScreenTopBar("Info", navController) }
    ) { padding ->
        Text("Info Screen", Modifier.padding(padding))
    }
}
