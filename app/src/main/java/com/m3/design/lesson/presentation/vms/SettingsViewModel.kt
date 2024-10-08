package com.m3.design.lesson.presentation.vms

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.m3.design.lesson.presentation.utils.params.Colors
import com.m3.design.lesson.presentation.utils.params.Shapes

class SettingsViewModel: ViewModel() {

    var isNightTheme by mutableStateOf(false)
    var containerShapes by mutableStateOf(Shapes.SMALL)
        private set
    var containerColor by mutableStateOf(Colors.PRIMARY_CONTAINER)
        private set




    // Все для создания формы

    var containerValueShapesForSlider by mutableFloatStateOf(0f)
    val changeContainerShapes =  { index: Float ->
        containerShapes = when (index) {
            0f -> { Shapes.EXTRA_SMALL }
            1f -> Shapes.SMALL
            2f -> Shapes.MEDIUM
            3f -> Shapes.LARGE
            4f -> Shapes.EXTRA_LARGE
            else -> Shapes.SMALL
        }
    }
    val setValueContainerValueShapesForSlide = { index: Float ->
        containerValueShapesForSlider = index
    }

    val setContainerShapesText = {
        var res = ""
        res = when (containerShapes) {
            Shapes.SMALL -> "Small"
            Shapes.MEDIUM -> "Medium"
            Shapes.LARGE -> "Large"
            Shapes.EXTRA_SMALL -> "Extra Small"
            Shapes.EXTRA_LARGE -> "Extra Large"
        }
        res
    }





}



