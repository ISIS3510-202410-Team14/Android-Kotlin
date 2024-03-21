package com.optic.moveon.presentation.navigation

sealed class AppScreen(val route: String) {

    object Login: AppScreen(route = "login")
    object Signup: AppScreen(route = "signup")

    object Home: AppScreen(route = "home")
}