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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import org.jetbrains.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun App(navController: NavHostController) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .size(300.dp)
            .background(color = Color.DarkGray)
            .padding(horizontal = 15.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.Top,
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
        Spacer(modifier = Modifier.height(30.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_account),
            contentDescription = "accountImage",
            modifier = Modifier.size(50.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(R.string.log_or_sign),
            fontSize = 15.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { navController.navigate("regapp") },
            modifier = Modifier
                .width(250.dp)
                .height(35.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFF89E00))
        ) {
            Text(
                text = stringResource(R.string.sign)
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { navController.navigate("logapp") },
            modifier = Modifier
                .width(250.dp)
                .height(35.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFF89E00))
        ) {
            Text(
                text = stringResource(R.string.log)
            )
        }

    }
}

@Preview
@Composable
fun AppLog(navController: NavHostController) {
    Column(
        modifier = Modifier
            .size(300.dp)
            .background(color = Color.DarkGray)
            .padding(horizontal = 15.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.Top,
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
                    navController.popBackStack()
                },
                modifier = Modifier
                    .size(25.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_arrow_back),
                    contentDescription = "back",
                    modifier = Modifier.size(20.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        var textEmail by remember { mutableStateOf("") }
        var textPassword by rememberSaveable { mutableStateOf("") }
        OutlinedTextField(
            value = textEmail,
            onValueChange = { textEmail = it },
            placeholder = { Text(
                text = "Email",
                color = Color.White,
            )},
            modifier = Modifier
                .width(250.dp)
                .height(50.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFF89E00),
                unfocusedBorderColor = Color.White,
                textColor = Color.White,
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = textPassword,
            onValueChange = { textPassword = it },
            placeholder = { Text(
                text = "Password",
                color = Color.White,
            )},
            modifier = Modifier
                .width(250.dp)
                .height(50.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFF89E00),
                unfocusedBorderColor = Color.White,
                textColor = Color.White,
            ),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(R.string.forgot_the_password),
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier.padding(end = 140.dp)
        )
        Spacer(modifier = Modifier.height(35.dp))
        Button(
            onClick = { navController.navigate("homeapp") },
            modifier = Modifier
                .width(250.dp)
                .height(35.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFF89E00))
        ) {
            Text(
                text = stringResource(R.string.log)
            )
        }

    }
}

@Preview
@Composable
fun AppReg(navController: NavHostController) {
    Column(
        modifier = Modifier
            .width(300.dp)
            .height(360.dp)
            .background(Color.DarkGray)
            .padding(horizontal = 15.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.Top,
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
                    navController.popBackStack()
                },
                modifier = Modifier
                    .size(25.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_arrow_back),
                    contentDescription = "back",
                    modifier = Modifier.size(20.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        var textEmailNew by remember { mutableStateOf("") }
        var textPassNew by rememberSaveable { mutableStateOf("") }
        var textCode by remember { mutableStateOf("") }
        OutlinedTextField(
            value = textEmailNew,
            onValueChange = { textEmailNew = it },
            placeholder = { Text(
                text = "Email",
                color = Color.White,
            )},
            modifier = Modifier
                .width(250.dp)
                .height(50.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFF89E00),
                unfocusedBorderColor = Color.White,
                textColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = textPassNew,
            onValueChange = { textPassNew = it },
            placeholder = { Text(
                text = "New password",
                color = Color.White
            )},
            modifier = Modifier
                .width(250.dp)
                .height(50.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFF89E00),
                unfocusedBorderColor = Color.White,
                textColor = Color.White
            ),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = textCode,
            onValueChange = { textCode = it },
            placeholder = { Text(
                text = "Code",
                color = Color.White,
            )},
            modifier = Modifier
                .width(250.dp)
                .height(50.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFFF89E00),
                unfocusedBorderColor = Color.White,
                textColor = Color.White
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(R.string.send_code),
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier.padding(end = 190.dp)
        )
        Spacer(modifier = Modifier.height(35.dp))
        Button(
            onClick = { navController.navigate("homeapp") },
            modifier = Modifier
                .width(250.dp)
                .height(35.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFF89E00))
        ) {
            Text(
                text = stringResource(R.string.sign)
            )
        }
    }
}