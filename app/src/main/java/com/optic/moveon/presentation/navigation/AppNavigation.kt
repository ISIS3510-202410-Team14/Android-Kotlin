package com.optic.moveon.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.optic.moveon.presentation.screens.login.LoginScreen
import com.optic.moveon.presentation.screens.signUp.SignupScreen


@Composable
fun AppNavigation(navController: NavHostController) {
    
    NavHost(
        navController = navController,
        startDestination = AppScreen.Login.route
    ){
        composable(route = AppScreen.Login.route){
            LoginScreen(navController)
        }

        composable(route = AppScreen.Signup.route){
            SignupScreen()
        }

    }
}