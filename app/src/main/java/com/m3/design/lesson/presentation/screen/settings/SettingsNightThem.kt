package com.m3.design.lesson.presentation.screen.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.utils.ui.TitleText
import com.m3.design.lesson.presentation.utils.ui.createSettingsProgressBar
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun SettingsNightThem(
    navController: NavController,
    viewModel: SettingsViewModel,
) {


    FragmentManager(
        navController = navController,
        title = "Ночной режим",
        viewModel = viewModel
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            TitleText(value = "Ночной режим", viewModel = viewModel)
            Spacer(modifier = Modifier.height(50.dp))
            Box(modifier = Modifier.createSettingsProgressBar(viewModel), contentAlignment = Alignment.Center) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    SettingsShapeItem(
                        value = "Включить",
                        enable = viewModel.isNightTheme,
                        viewModel = viewModel
                    ) {
                        viewModel.changeNightThemeValue.invoke(true)
                    }

                    SettingsShapeItem(
                        value = "Выключить",
                        enable = !viewModel.isNightTheme,
                        viewModel = viewModel
                    ) {
                        viewModel.changeNightThemeValue.invoke(false)
                    }
                }
            }
        }
    }
}

