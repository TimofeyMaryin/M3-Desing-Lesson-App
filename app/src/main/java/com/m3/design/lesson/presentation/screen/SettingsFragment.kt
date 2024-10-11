package com.m3.design.lesson.presentation.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.m3.design.lesson.presentation.navigation.SettingsScreen
import com.m3.design.lesson.presentation.utils.ui.BodyText
import com.m3.design.lesson.presentation.utils.ui.Container
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.utils.ui.createContainer
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun SettingsFragment(
    navController: NavController,
    viewModel: SettingsViewModel,
) {

    FragmentManager(navController = navController, title = "Настройки", viewModel = viewModel) {


        Box(
            modifier = Modifier
                .createContainer(viewModel)
                .fillMaxWidth()
                .fillMaxHeight(.6f),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                SettingsButton(value = "Текст") {
                    navController.navigate(SettingsScreen.SettingsText.route)
                }

                SettingsButton(value = "Формы") {
                    navController.navigate(SettingsScreen.SettingsShapes.route)
                }

                SettingsButton(value = "Цвета") {
                    navController.navigate(SettingsScreen.SettingsColors.route)
                }

                SettingsButton(value = "Ночной режим") {
                    navController.navigate(SettingsScreen.SettingsNightTheme.route)
                }
            }
        }

        Box(modifier = Modifier.fillMaxSize(.9f), contentAlignment = Alignment.BottomCenter) {
            TextButton(onClick = { viewModel.resetSettings.invoke() }) {
                BodyText(value = "Сбросить настройки", viewModel = viewModel)
            }
        }
        
    }
}


@Composable
private fun ColumnScope.SettingsButton(
    value: String,
    onClick: () -> Unit
) {
    Container(weight = 1f) {
        Box(modifier = Modifier
            .fillMaxSize()
            .clickable { onClick() }, contentAlignment = Alignment.Center) {
            Row(
                modifier = Modifier.fillMaxWidth(.9f),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = value, style = MaterialTheme.typography.titleMedium)
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
            }
        }
    }
}


