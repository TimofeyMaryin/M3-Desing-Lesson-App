package com.m3.design.lesson.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.m3.design.lesson.R
import com.m3.design.lesson.presentation.navigation.Screen
import com.m3.design.lesson.presentation.utils.params.Colors
import com.m3.design.lesson.presentation.utils.ui.Container
import com.m3.design.lesson.presentation.utils.ui.DisplayText
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.utils.ui.TitleText
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

            DesignContainer(
                viewModel = viewModel,
                weight = 1f,
                onClick = {
                    navController.navigate(Screen.ShowTextScreen.route)
                }
            ) {
                Image(painter = painterResource(id = R.drawable.asset_writer), contentDescription = null, modifier = Modifier
                    .fillMaxSize()
                    .blur(3.dp), contentScale = ContentScale.Crop)
                Box(modifier = Modifier.fillMaxSize().background(Color.White.copy(.3f)))
                Box(
                    modifier = Modifier.fillMaxSize(0.9F),
                    contentAlignment = Alignment.BottomStart
                ) {
                    DisplayText(value = "Текст", viewModel = viewModel)
                }

            }
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
    onClick: () -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    Container(weight = weight) {

        Box(
            modifier = Modifier
                .createContainer(viewModel)
                .fillMaxWidth()
                .fillMaxHeight(.9f)
                .clickable { onClick() },
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
