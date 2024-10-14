package com.m3.design.lesson.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.m3.design.lesson.data.model.allArticles
import com.m3.design.lesson.presentation.utils.ui.BodyText
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.utils.ui.HeadlineText
import com.m3.design.lesson.presentation.utils.ui.TitleText
import com.m3.design.lesson.presentation.utils.ui.createContainer
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun ShowArticleFragment(
    navController: NavController,
    viewModel: SettingsViewModel,
    articleIndex: String,
) {
    val article by remember { mutableStateOf(allArticles[articleIndex.toInt()]) }

    FragmentManager(
        navController = navController,
        title = "Статья",
        viewModel = viewModel
    ) {

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {

            item {
                HeadlineText(
                    value = article.title,
                    viewModel = viewModel,
                    fontWeight = FontWeight.Bold
                )
            }

            paddingItem()

            item {
                Box(
                    modifier = Modifier
                        .createContainer(viewModel)
                        .fillMaxWidth()
                        .height(300.dp),
                    contentAlignment = Alignment.Center
                ) {
                    TitleText(
                        value = article.preview,
                        viewModel = viewModel,
                        textAlign = TextAlign.Center
                    )
                }

            }
            paddingItem()

            item {
                BodyText(value = article.article, viewModel = viewModel, textAlign = TextAlign.Start)
            }

            paddingItem()

            item {
                Box(
                    modifier = Modifier
                        .createContainer(viewModel)
                        .fillParentMaxWidth()
                        .height(80.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(.9f)
                    ) {
                        BodyText(value = "Рейтинг", viewModel = viewModel)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Icon(imageVector = Icons.Default.Star, contentDescription = null, modifier = Modifier.size(35.dp), tint = Color.Yellow)
                            Spacer(modifier = Modifier.width(20.dp))

                            BodyText(value = "${article.rating}", viewModel = viewModel)
                        }
                    }

                }

            }
        }

    }


}


private fun LazyListScope.paddingItem() = item {
    Column {
        Spacer(modifier = Modifier.height(50.dp))
        Divider()
        Spacer(modifier = Modifier.height(50.dp))
    }

}