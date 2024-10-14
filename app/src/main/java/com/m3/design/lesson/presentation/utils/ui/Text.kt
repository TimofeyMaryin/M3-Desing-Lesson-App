package com.m3.design.lesson.presentation.utils.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.m3.design.lesson.presentation.utils.params.TextClass
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun DisplayText(value: String, viewModel: SettingsViewModel, fontWeight: FontWeight = FontWeight.Normal) {
    _AppText(value = value, style = _setTextStyle(category = viewModel.textStyle_Display), fontWeight = fontWeight, color = setColorByType(type = viewModel.textColor))
}

@Composable
fun HeadlineText(value: String, viewModel: SettingsViewModel, textAlign: TextAlign = TextAlign.Center, fontWeight: FontWeight = FontWeight.Normal, maxLines: Int = Int.MAX_VALUE) {
    _AppText(
        value = value,
        style = _setTextStyle(category = viewModel.textStyle_Headline),
        color = setColorByType(type = viewModel.textColor),
        textAlign = textAlign,
        fontWeight = fontWeight,
        maxLines = maxLines,
    )
}

@Composable
fun TitleText(value: String, viewModel: SettingsViewModel, textAlign: TextAlign = TextAlign.Start) {
    _AppText(value = value, style = _setTextStyle(category = viewModel.textStyle_Title), color = setColorByType(type = viewModel.textColor), textAlign = textAlign)
}

@Composable
fun BodyText(value: String, viewModel: SettingsViewModel, textAlign: TextAlign = TextAlign.Center, fontWeight: FontWeight = FontWeight.Normal, maxLines: Int = Int.MAX_VALUE) {
    _AppText(
        value = value,
        style = _setTextStyle(category = viewModel.textStyle_Body),
        color = setColorByType(type = viewModel.textColor),
        fontWeight = fontWeight,
        textAlign = textAlign,
        maxLines = maxLines
    )
}

@Composable
fun LabelText(value: String, viewModel: SettingsViewModel) {
    _AppText(
        value = value,
        style = _setTextStyle(category = viewModel.textStyle_Label),
        color = setColorByType(type = viewModel.textColor),
    )
}

@Composable
private fun _AppText(
    value: String,
    style: TextStyle,
    fontWeight: FontWeight = FontWeight.Normal,
    color: Color,
    textAlign: TextAlign = TextAlign.Center,
    maxLines: Int = Int.MAX_VALUE,
) {
    Text(
        text = value,
        style = style,
        fontWeight = fontWeight,
        color = color,
        textAlign = textAlign,
        maxLines = maxLines,

        overflow = TextOverflow.Ellipsis,
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