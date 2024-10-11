package com.m3.design.lesson.presentation.utils.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.m3.design.lesson.presentation.utils.params.TextClass
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun DisplayText(value: String, viewModel: SettingsViewModel, fontWeight: FontWeight = FontWeight.Normal) {
    _AppText(value = value, style = _setTextStyle(category = viewModel.textStyle_Display), fontWeight = fontWeight)
}

@Composable
fun HeadlineText(value: String, viewModel: SettingsViewModel) {
    _AppText(value = value, style = _setTextStyle(category = viewModel.textStyle_Headline))
}

@Composable
fun TitleText(value: String, viewModel: SettingsViewModel) {
    _AppText(value = value, style = _setTextStyle(category = viewModel.textStyle_Title))
}

@Composable
fun BodyText(value: String, viewModel: SettingsViewModel) {
    _AppText(value = value, style = _setTextStyle(category = viewModel.textStyle_Body))
}

@Composable
fun LabelText(value: String, viewModel: SettingsViewModel) {
    _AppText(value = value, style = _setTextStyle(category = viewModel.textStyle_Label))
}

@Composable
private fun _AppText(value: String, style: TextStyle, fontWeight: FontWeight = FontWeight.Normal) {
    Text(
        text = value,
        style = style,
        fontWeight = fontWeight
    )
}




@Composable
private fun _setTextStyle(category: TextClass) = when (category) {
    TextClass.DISPLAY -> MaterialTheme.typography.displayMedium
    TextClass.HEADLINE -> MaterialTheme.typography.headlineMedium
    TextClass.TITLE -> MaterialTheme.typography.titleMedium
    TextClass.BODY -> MaterialTheme.typography.bodyMedium
    TextClass.LABEL -> MaterialTheme.typography.labelMedium
}