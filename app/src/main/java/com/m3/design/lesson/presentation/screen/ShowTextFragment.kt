package com.m3.design.lesson.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.m3.design.lesson.data.model.TextModel
import com.m3.design.lesson.data.model.allTextModels
import com.m3.design.lesson.presentation.utils.ui.Container
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.utils.ui.HeadlineText
import com.m3.design.lesson.presentation.utils.ui.LabelText
import com.m3.design.lesson.presentation.utils.ui.createContainer
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun ShowTextFragment(
    navController: NavController,
    viewModel: SettingsViewModel,
) {

    FragmentManager(
        navController = navController,
        title = "Текста",
        viewModel = viewModel
    ) {

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            this.items(allTextModels) {
                TextArticleItem(viewModel = viewModel, model = it )
            }
        }

    }

}


@Composable
private fun TextArticleItem(
    viewModel: SettingsViewModel,
    model: TextModel,
) {
    
    Box(modifier = Modifier.padding(vertical = 10.dp)) {
        Box(
            modifier = Modifier
                .createContainer(viewModel)
                .fillMaxWidth()
                .height(500.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                Container(weight = 2f) {
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(.3f)), contentAlignment = Alignment.CenterStart) {
                        HeadlineText(value = model.title, viewModel = viewModel)
                    }

                }
                Container(weight = 1f) {
                    Divider()
                }

                Container(weight = 6f) {
                    LabelText(value = model.article, viewModel = viewModel)
                }

            }
        }
    }
    
}