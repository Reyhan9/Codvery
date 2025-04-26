package com.reyaanr.vercode

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.setBackgroundDrawableResource(android.R.color.transparent)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        super.onCreate(savedInstanceState)
        setContent {
            MainLayer()
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "regapp") {
        composable("homeapp") { App(navController) }
        composable("logapp") { AppLog(navController) }
        composable("regapp") { AppReg(navController) }
    }
}

@Preview
@Composable
fun MainLayer() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black.copy(0.8f))
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = (Alignment.CenterHorizontally),
        verticalArrangement = (Arrangement.Center)
    ) {
        AppNavigation()
    }
}