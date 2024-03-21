package com.optic.moveon.presentation.screens.login

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.optic.moveon.presentation.screens.login.components.LoginContent
import com.optic.moveon.presentation.ui.theme.MoveOnTheme


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LoginScreen(navController: NavHostController) {
    Scaffold(
        topBar = {},
        content = {
            LoginContent()
                  },
        bottomBar = {}
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MoveOnTheme {
        LoginScreen(rememberNavController())
    }
}