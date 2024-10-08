package com.m3.design.lesson.presentation.navigation

sealed class Screen(val route: String) {

    data object SplashScreen : Screen("splash-screen")
    data object MainScreen : Screen("main-screen")
    data object SettingsScreen : Screen("settings-screen")
    data object TextScreen : Screen("text-screen")
    data object ContainerScreen : Screen("container-screen")

}