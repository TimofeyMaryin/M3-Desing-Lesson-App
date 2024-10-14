package com.m3.design.lesson.presentation.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.m3.design.lesson.data.model.allArticles
import com.m3.design.lesson.presentation.navigation.Screen
import com.m3.design.lesson.presentation.utils.ui.ArticleItem
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun ArticleFragment(
    navController: NavController,
    viewModel: SettingsViewModel,
) {
    val context = LocalContext.current

    FragmentManager(
        navController = navController,
        title = "Статьи",
        viewModel = viewModel
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            items(allArticles.size) {
                ArticleItem(model = allArticles[it], viewModel = viewModel) {
                    navController.navigate(Screen.ShowArticleScreen.route + "/$it")
                    // Toast.makeText(context, "Yeap", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}