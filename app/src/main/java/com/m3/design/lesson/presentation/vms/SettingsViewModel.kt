package com.m3.design.lesson.presentation.vms

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.m3.design.lesson.presentation.utils.params.Colors
import com.m3.design.lesson.presentation.utils.params.Shapes
import com.m3.design.lesson.presentation.utils.params.TextClass

class SettingsViewModel: ViewModel() {

    var isNightTheme by mutableStateOf(false)
        private set
    var containerShapes by mutableStateOf(Shapes.SMALL)
        private set
    var containerColor by mutableStateOf(Colors.PRIMARY_CONTAINER)
        private set
    var backgroundColor by mutableStateOf(Colors.BACKGROUND)
        private set
    var textColor by mutableStateOf(Colors.UNSPECIFIED)
        private set
    var selectedContainerColor by mutableStateOf(Colors.PRIMARY)
        private set


    // text
    var textStyle_Display by mutableStateOf(TextClass.DISPLAY)
    var textStyle_Headline by mutableStateOf(TextClass.HEADLINE)
    var textStyle_Title by mutableStateOf(TextClass.TITLE)
    var textStyle_Body by mutableStateOf(TextClass.BODY)
    var textStyle_Label by mutableStateOf(TextClass.LABEL)

    val onChangedTextColor = { type: Colors -> textColor = type }
    val onChangedBackgroundColor = { type: Colors -> backgroundColor = type }
    val onChangedContainerColor = { type: Colors -> containerColor = type }
    // end text

    val changeNightThemeValue = { value: Boolean -> isNightTheme = value }

    // Все для создания формы
    var resetSettings = {
        isNightTheme = false
        containerShapes = Shapes.SMALL
        containerColor = Colors.PRIMARY_CONTAINER
        backgroundColor = Colors.BACKGROUND
        textColor = Colors.UNSPECIFIED
        selectedContainerColor = Colors.PRIMARY

        textStyle_Display = TextClass.DISPLAY
        textStyle_Headline = TextClass.HEADLINE
        textStyle_Title = TextClass.TITLE
        textStyle_Body = TextClass.BODY
        textStyle_Label = TextClass.LABEL
    }

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




}



