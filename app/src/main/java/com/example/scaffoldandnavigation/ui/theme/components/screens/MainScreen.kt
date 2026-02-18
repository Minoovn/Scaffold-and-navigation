package com.example.scaffoldandnavigation.ui.screens

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.navigation.NavController
import com.example.scaffoldandnavigation.ui.components.MainTopAppBar
import com.example.scaffoldandnavigation.ui.theme.components.MainTopAppBar

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = { MainTopAppBar("My App", navController) }
    ) { padding ->
        Text("Home Screen", Modifier.padding(padding))
    }
}
