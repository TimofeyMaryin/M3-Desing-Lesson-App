package com.m3.design.lesson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.m3.design.lesson.presentation.navigation.AppNavigation
import com.m3.design.lesson.presentation.vms.SettingsViewModel
import com.m3.design.lesson.ui.theme.M3DesignLessonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val settingsViewModel by viewModels<SettingsViewModel>()

            M3DesignLessonTheme(
                darkTheme = settingsViewModel.isNightTheme
            ) {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppNavigation(viewModel = settingsViewModel)
                }
            }
        }
    }
}

