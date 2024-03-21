package com.optic.moveon.presentation.screens.login.components

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
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
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
fun LoginContent(navController: NavHostController){
    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            modifier = Modifier.height(130.dp),
            painter = painterResource(id = R.drawable.logo3),
            contentDescription = "Logo de la aplicación"
        )
        Spacer(modifier = Modifier.height(20.dp))
        CardForm()
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Text(text = "Don't have an account?",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(AppScreen.Signup.route)
                },
                text = "SIGN UP",
                fontSize = 14.sp,
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold
            )
        }

    }
}
@Composable
fun CardForm(){
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
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
                text = "LOGIN",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Please fill the details to continue"
            )
            DefaultTextField(modifier = Modifier.padding(top = 25.dp),
                value = email,
                onValueChange = {email = it},
                label = "E-mail",
                icon = Icons.Default.Email,
                keyboardType = KeyboardType.Email)
            DefaultTextField(modifier = Modifier.padding(top = 25.dp),
                value = password,
                onValueChange = {password = it},
                label = "Password",
                icon = Icons.Default.Lock,
                hideText = true)
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp),
                onClick = {  }
            ) {

                Text(text = "SIGN IN")
            }
            DefaultButton(text = "NEXT TIME",
                onClick = { /*TODO*/ },
                color = MaterialTheme.colorScheme.primary)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MoveOnTheme {
        LoginContent(rememberNavController())
    }
}