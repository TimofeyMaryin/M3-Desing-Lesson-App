package com.m3.design.lesson.presentation.screen

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.vms.SettingsViewModel
import kotlin.math.roundToInt

@Composable
fun SettingsFragment(
    navController: NavController,
    viewModel: SettingsViewModel,
) {


    var a by remember {
        mutableStateOf(0f)
    }
    FragmentManager(navController = navController) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {

            Box(modifier = Modifier.fillMaxWidth(.9f), contentAlignment = Alignment.CenterStart) {
                Text(text = viewModel.setContainerShapesText.invoke(), )
            }
            Slider(
                value = viewModel.containerValueShapesForSlider,
                onValueChange = {
                    viewModel.setValueContainerValueShapesForSlide(it.roundToInt().toFloat())
                    viewModel.changeContainerShapes(it.roundToInt().toFloat())
                    Log.e("TAG", "SettingsFragment: $it", )
                },
                valueRange = 0f..4f,
                steps = 0,
                modifier = Modifier.fillMaxWidth(.9f)
            )


        }
    }
}