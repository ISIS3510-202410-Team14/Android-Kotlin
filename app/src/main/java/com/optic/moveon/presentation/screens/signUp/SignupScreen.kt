package com.optic.moveon.presentation.screens.signUp

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.optic.moveon.presentation.components.DefaultTopBar
import com.optic.moveon.presentation.screens.signUp.components.SignupContent
import com.optic.moveon.presentation.ui.theme.MoveOnTheme
import java.lang.reflect.Modifier


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SignupScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
                 DefaultTopBar(
                     title = "Nuevo estudiante",
                     upAvailable = true,
                     navController = navController
                 )
        },
        content = {
            SignupContent()


        },
        bottomBar = {}
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewSignupScreen(){
    MoveOnTheme {
        Surface(
            color = MaterialTheme.colorScheme.primary
        ){
            SignupScreen(rememberNavController())
        }
    }
}