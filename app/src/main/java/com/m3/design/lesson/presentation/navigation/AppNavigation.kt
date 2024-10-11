package com.m3.design.lesson.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.m3.design.lesson.presentation.screen.MainFragment
import com.m3.design.lesson.presentation.screen.SettingsFragment
import com.m3.design.lesson.presentation.screen.settings.SettingsNightThem
import com.m3.design.lesson.presentation.screen.settings.SettingsShapes
import com.m3.design.lesson.presentation.screen.settings.SettingsText
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun AppNavigation(viewModel: SettingsViewModel,) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.MainScreen.route
    ) {

        this.composable(
            route = Screen.SplashScreen.route
        ) {

        }

        this.composable(
            route = Screen.MainScreen.route
        ) {
            MainFragment(navController = navController, viewModel = viewModel)
        }

        this.composable(
            route = Screen.TextScreen.route
        ) {

        }

        this.composable(
            route = Screen.ContainerScreen.route
        ) {

        }

        this.composable(
            route = Screen.SettingsScreen.route
        ) {
            SettingsFragment(navController = navController, viewModel = viewModel)
        }


        this.composable(
            route = SettingsScreen.SettingsShapes.route
        ) {
            SettingsShapes(navController = navController, viewModel = viewModel)
        }

        this.composable(
            route = SettingsScreen.SettingsText.route
        ) {
            SettingsText(navController = navController, viewModel = viewModel)
        }

        this.composable(
            route = SettingsScreen.SettingsNightTheme.route
        ) {
            SettingsNightThem(navController = navController, viewModel = viewModel)
        }
        

    }

}