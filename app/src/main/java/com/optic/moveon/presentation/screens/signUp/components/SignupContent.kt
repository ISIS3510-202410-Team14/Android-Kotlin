package com.optic.moveon.presentation.screens.signUp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.optic.moveon.R
import com.optic.moveon.presentation.components.DefaultButton
import com.optic.moveon.presentation.components.DefaultTextField
import com.optic.moveon.presentation.navigation.AppScreen
import com.optic.moveon.presentation.ui.theme.MoveOnTheme

@Composable
fun SignupContent(){
    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.height(80.dp))
        Image(
            modifier = Modifier.height(130.dp),
            painter = painterResource(id = R.drawable.user),
            contentDescription = "Logo de la aplicación"
        )
        Spacer(modifier = Modifier.height(10.dp))
        CardForm()
        Spacer(modifier = Modifier.height(20.dp))


    }
}
@Composable
fun CardForm(){
    var username by remember{
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var confirmpassword by remember {
        mutableStateOf("")
    }
    Card(
        modifier = Modifier.padding(start = 40.dp, end = 40.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        )
    ) {

        Column(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            Text(
                modifier = Modifier.padding(top = 20.dp),
                text = "SIGN UP",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Please fill the details to continue"
            )
            DefaultTextField(modifier = Modifier.padding(top = 15.dp),
                value = username,
                onValueChange = {username = it},
                label = "Username",
                icon = Icons.Default.AccountCircle
                )
            DefaultTextField(modifier = Modifier.padding(top = 15.dp),
                value = email,
                onValueChange = {email = it},
                label = "E-mail",
                icon = Icons.Default.Email,
                keyboardType = KeyboardType.Email)
            DefaultTextField(modifier = Modifier.padding(top = 15.dp),
                value = password,
                onValueChange = {password = it},
                label = "Password",
                icon = Icons.Default.Lock,
                hideText = true)
            DefaultTextField(modifier = Modifier.padding(top = 15.dp),
                value = confirmpassword,
                onValueChange = {confirmpassword = it},
                label = "Confirm Password",
                icon = Icons.Outlined.Lock,
                hideText = true)
            Spacer(modifier = Modifier.height(50.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp),
                onClick = {  }
            ) {
                Text(text = "SIGN UP")
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MoveOnTheme {
        SignupContent()
    }
}