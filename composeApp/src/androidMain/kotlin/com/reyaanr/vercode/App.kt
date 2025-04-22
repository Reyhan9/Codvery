package com.reyaanr.vercode

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .size(300.dp)
            .background(color = Color.DarkGray)
            .padding(horizontal = 15.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .width(300.dp)
                .height(34.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = stringResource(R.string.app_name),
                color = Color(0xFFF89E00),
                fontSize = 29.sp,
                fontWeight = FontWeight.Medium
            )
            IconButton(
                onClick = {
                    val activity = context as? MainActivity
                    activity?.finish()
                },
                modifier = Modifier
                    .size(25.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_close),
                    contentDescription = "close",
                    modifier = Modifier.size(40.dp)
                )
            }
        }
        Column(
            modifier = Modifier
                .size(230.dp),
                //.background(Color.Black),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_account),
                contentDescription = "accountImage",
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = stringResource(R.string.log_or_sign),
                color = Color.White,
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {},
                modifier = Modifier
                    .width(220.dp)
                    .height(35.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFF89E00))
            ) {
                Text(
                    text = stringResource(R.string.sign)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {},
                modifier = Modifier
                    .width(220.dp)
                    .height(35.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFF89E00))
            ) {
                Text(
                    text = stringResource(R.string.log)
                )
            }
        }
    }
}

@Preview
@Composable
fun VerifyCodeEmail() {
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .size(300.dp)
            .background(color = Color.DarkGray)
            .padding(horizontal = 15.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = stringResource(R.string.enterCode),
            color = Color.White,
            fontSize = 25.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(R.string.desk_email_code),
            color = Color.White,
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(30.dp))
        TextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier
                .height(50.dp)
                .width(300.dp)
                .align(Alignment.CenterHorizontally),
            textStyle = TextStyle(
                color = Color.White,
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
            ),
            placeholder = { Text(stringResource(R.string.enterCode)) },
            singleLine = true
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = stringResource(R.string.send_again),
            modifier = Modifier.padding(start = 15.dp),
            color = Color.White,
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Code via number phone",
            modifier = Modifier.padding(start = 15.dp),
            color = Color.White,
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = { text = "" },
            modifier = Modifier
                .width(300.dp)
                .height(35.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFFF89E00)
            )
        ) { Text(stringResource(R.string.enter)) }
    }
}