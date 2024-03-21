package com.optic.moveon.presentation.screens.home

import android.annotation.SuppressLint
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.optic.moveon.presentation.screens.signUp.components.SignupContent
import com.optic.moveon.presentation.ui.theme.MoveOnTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {

    Scaffold (
        topBar = {},
        content = {SignupContent()},
        bottomBar = {}

    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewHomeScreen() {
    MoveOnTheme {
        Surface(
            color = MaterialTheme.colorScheme.primary
        ) {
            HomeScreen(rememberNavController())
        }
    }
}