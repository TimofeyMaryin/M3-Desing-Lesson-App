package com.m3.design.lesson.presentation.screen.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.m3.design.lesson.presentation.utils.params.Shapes
import com.m3.design.lesson.presentation.utils.ui.Container
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.utils.ui.LabelText
import com.m3.design.lesson.presentation.utils.ui.createColor
import com.m3.design.lesson.presentation.utils.ui.createContainer
import com.m3.design.lesson.presentation.utils.ui.createSettingsProgressBar
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun SettingsShapes(
    navController: NavController,
    viewModel: SettingsViewModel,
) {
    
    
    FragmentManager(
        navController = navController,
        title = "Формы",
        viewModel = viewModel
    ) {
        
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(text = "Выберите подходящую вам форму")
            Spacer(modifier = Modifier.height(30.dp))

            Box(
                modifier = Modifier.createSettingsProgressBar(viewModel),
                contentAlignment = Alignment.Center,
            ) {
                Row(
                    modifier = Modifier.fillMaxSize()
                ) {
                    SettingsShapeItem(
                        value = "Extra Small",
                        enable = viewModel.containerShapes == Shapes.EXTRA_SMALL,
                        viewModel = viewModel
                    ) {
                        viewModel.changeContainerShapes(0f)
                    }

                    SettingsShapeItem(
                        value = "Small",
                        enable = viewModel.containerShapes == Shapes.SMALL,
                        viewModel = viewModel
                    ) {
                        viewModel.changeContainerShapes(1f)
                    }

                    SettingsShapeItem(
                        value = "Medium",
                        enable = viewModel.containerShapes == Shapes.MEDIUM,
                        viewModel = viewModel
                    ) {
                        viewModel.changeContainerShapes(2f)
                    }

                    SettingsShapeItem(
                        value = "Large",
                        enable = viewModel.containerShapes == Shapes.LARGE,
                        viewModel = viewModel
                    ) {
                        viewModel.changeContainerShapes(3f)
                    }

                    SettingsShapeItem(
                        value = "Extra Large",
                        enable = viewModel.containerShapes == Shapes.EXTRA_LARGE,
                        viewModel = viewModel
                    ) {
                        viewModel.changeContainerShapes(4f)
                    }
                }
            }
        }


        Box(modifier = Modifier.createContainer(viewModel).size(150.dp))
    }
    
}

@Composable
fun RowScope.SettingsShapeItem(
    value: String,
    enable: Boolean,
    viewModel: SettingsViewModel,
    onClick: () -> Unit,
) {

    Container(weight = 1f) {
        Column(
            modifier = Modifier
                .fillMaxSize(.95f)
                .clip(CircleShape)
                .clickable { onClick() }
                .background(createColor(colors = if (!enable) viewModel.selectedContainerColor else viewModel.containerColor)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {

            LabelText(
                value = value,
                viewModel = viewModel
            )

        }
    }

}