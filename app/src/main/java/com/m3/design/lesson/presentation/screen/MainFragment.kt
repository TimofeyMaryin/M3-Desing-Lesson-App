package com.m3.design.lesson.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.m3.design.lesson.presentation.utils.params.Colors
import com.m3.design.lesson.presentation.utils.ui.Container
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.utils.ui.createContainer
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun MainFragment(
    navController: NavController,
    viewModel: SettingsViewModel,
) {

    FragmentManager(navController = navController, title = "Главная", viewModel = viewModel) {

        Column(
            modifier = Modifier.fillMaxWidth(.9f)
        ) {
            Container(weight = 1f) {

            }

            DesignContainer(viewModel = viewModel, weight = 1f)
            DesignAnyContainer(viewModel = viewModel, weight = 1f, count = 3)

            Container(weight = 1f) {

            }
        }

    }

}


@Composable
fun ColumnScope.DesignContainer(
    viewModel: SettingsViewModel,
    weight: Float,
    content: @Composable () -> Unit = {}
) {
    Container(weight = weight) {

        Box(
            modifier = Modifier
                .createContainer(viewModel)
                .fillMaxWidth()
                .fillMaxHeight(.9f),
            contentAlignment = Alignment.Center
        ) {
            content()
        }
    }
}


@Composable
fun ColumnScope.DesignAnyContainer(viewModel: SettingsViewModel, weight: Float, count: Int) {

    Container(weight = weight) {
        Row {
            for ( i in 0..<count) {
                Container(weight = 1f) {
                    Box(
                        modifier = Modifier
                            .createContainer(viewModel)
                            .fillMaxWidth(.9f)
                            .fillMaxHeight(.9f),
                    )
                }
            }
        }
    }

}
