package com.reyaanr.codvery

import android.os.Bundle
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainLayer()
        }
    }
}

@Preview
@Composable
fun MainLayer() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = (Alignment.CenterHorizontally),
        verticalArrangement = (Arrangement.Center)
    ) {
        App()
    }
}