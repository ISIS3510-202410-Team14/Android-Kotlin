package com.optic.moveon.presentation.screens.signUp

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SignupScreen() {
    Scaffold(
        topBar = {},
        content = {
                  Text(text = "SignupScreen")

        },
        bottomBar = {}
    )
}