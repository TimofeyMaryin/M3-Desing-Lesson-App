package com.m3.design.lesson.presentation.utils.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import com.m3.design.lesson.presentation.navigation.Screen

@Composable
fun FragmentManager(
    navController: NavController,
    content: @Composable () -> Unit,
) {


    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Container(weight = 10f) {
            content()
        }

        BottomBar(navController = navController)
    }


}

@Composable
private fun ColumnScope.BottomBar(
    navController: NavController,
) {
    Container(weight = 1f) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
        ) {
            BottomButton(
                ic = Icons.Default.Home,
                enable = navController.currentDestination?.route == Screen.MainScreen.route
            ) {
                navController.navigate(Screen.MainScreen.route)
            }

            BottomButton(
                ic = Icons.Default.Settings,
                enable = navController.currentDestination?.route == Screen.SettingsScreen.route
            ) {
                navController.navigate(Screen.SettingsScreen.route)
            }

        }
    }
}

@Composable
fun RowScope.BottomButton(
    ic: ImageVector,
    enable: Boolean,
    onClick: () -> Unit
) {
    Container(weight = 1f) {
        IconButton(onClick = { if (!enable) onClick() }) {
            Icon(imageVector = ic, contentDescription = null)
        }
    }
}