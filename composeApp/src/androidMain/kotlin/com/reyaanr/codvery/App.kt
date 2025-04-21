package com.reyaanr.codvery

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App() {
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .width(300.dp)
            .height(250.dp)
            .background(color = Color.Gray)
            .padding(horizontal = 15.dp, vertical = 10.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Enter The Code",
            fontSize = 25.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Enter the code that has been sent to the email address nameusr@email.com",
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(25.dp))
        TextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier
                .height(50.dp)
                .width(300.dp)
                .align(Alignment.CenterHorizontally),
            textStyle = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
            ),
            placeholder = { Text("Enter the code") },
            singleLine = true
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Send the code again",
            modifier = Modifier.padding(start = 15.dp),
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { text = "" },
            modifier = Modifier
                .width(300.dp)
                .height(35.dp)
                .align(Alignment.CenterHorizontally),
        ) { Text("Enter") }
    }
}