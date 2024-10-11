package com.m3.design.lesson.presentation.screen.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.m3.design.lesson.presentation.utils.params.Colors
import com.m3.design.lesson.presentation.utils.ui.BodyText
import com.m3.design.lesson.presentation.utils.ui.ColorSquare
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.utils.ui.HeadlineText
import com.m3.design.lesson.presentation.utils.ui.TitleText
import com.m3.design.lesson.presentation.utils.ui.createContainer
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun SettingsColorFragment(
    navController: NavController,
    viewModel: SettingsViewModel,
) {
    val pagerState = rememberPagerState {
        3
    }

    FragmentManager(
        navController = navController,
        title = "Цвета",
        viewModel = viewModel
    ) {

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize(),
            userScrollEnabled = true,
            pageSpacing = 20.dp

        ) { index ->
            if (index == 0) {
                SettingsColorsItem(
                    title = "Текст",
                    viewModel = viewModel,
                    currentColors = viewModel.textColor,
                ) {
                    viewModel.onChangedTextColor(it)
                }
            }

            if (index == 1) {
                SettingsColorsItem(
                    title = "Фон",
                    viewModel = viewModel,
                    currentColors = viewModel.backgroundColor,
                ) {
                    viewModel.onChangedBackgroundColor(it)
                }
            }

            if (index == 2) {
                SettingsColorsItem(
                    title = "Контейнер",
                    viewModel = viewModel,
                    currentColors = viewModel.containerColor
                ) {
                    viewModel.onChangedContainerColor(it)
                }
            }




        }


    }

}

@Composable
private fun SettingsColorsItem(
    title: String,
    viewModel: SettingsViewModel,
    currentColors: Colors,
    onChangeColor: (Colors) -> Unit
) {

    Box(
        modifier = Modifier
            .createContainer(viewModel)
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(.95f)
        ) {
            HeadlineText(value = title, viewModel = viewModel)
            Spacer(modifier = Modifier.height(20.dp))

            ColorSquare(viewModel = viewModel, currentColors =  currentColors) {
                onChangeColor(it)
            }
        }
    }

}