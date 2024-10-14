package com.m3.design.lesson.presentation.navigation

sealed class Screen(val route: String) {

    data object SplashScreen : Screen("splash-screen")
    data object MainScreen : Screen("main-screen")
    data object SettingsScreen : Screen("settings-screen")
    data object TextScreen : Screen("text-screen")
    data object ContainerScreen : Screen("container-screen")

    data object ArticleScreen : Screen("article-screen")
    data object ShowArticleScreen : Screen("show-article-screen")
    data object ShowTextScreen : Screen("show-text-screen")
}

sealed class SettingsScreen (val route: String) {
    data object SettingsShapes: SettingsScreen("settings-shapes")
    data object SettingsText: SettingsScreen("settings-text")
    data object SettingsNightTheme: SettingsScreen("settings-night-theme")
    data object SettingsColors: SettingsScreen("settings-colors")
}