package com.m3.design.lesson.presentation.utils.ui

import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import com.m3.design.lesson.presentation.utils.params.Colors
import com.m3.design.lesson.presentation.utils.params.Shapes
import com.m3.design.lesson.presentation.vms.SettingsViewModel


@Composable fun Modifier.createContainer(viewModel: SettingsViewModel) = this
    .clip(createClip(shapes = viewModel.containerShapes))
    .background(createColor(colors = viewModel.containerColor))


@Composable fun createClip(shapes: Shapes): Shape = when (shapes) {
    Shapes.SMALL -> MaterialTheme.shapes.small
    Shapes.MEDIUM -> MaterialTheme.shapes.medium
    Shapes.LARGE -> MaterialTheme.shapes.large
    Shapes.EXTRA_SMALL -> MaterialTheme.shapes.extraSmall
    Shapes.EXTRA_LARGE -> MaterialTheme.shapes.extraLarge
}

@Composable fun createColor(colors: Colors): Color = when (colors) {
    Colors.PRIMARY -> MaterialTheme.colorScheme.primary
    Colors.ERROR -> MaterialTheme.colorScheme.error
    Colors.SCRIM -> MaterialTheme.colorScheme.scrim
    Colors.ON_PRIMARY -> MaterialTheme.colorScheme.onPrimary
    Colors.SURFACE -> MaterialTheme.colorScheme.surface
    Colors.ON_PRIMARY_CONTAINER -> MaterialTheme.colorScheme.onPrimaryContainer
    Colors.PRIMARY_CONTAINER -> MaterialTheme.colorScheme.primaryContainer
    Colors.TERTIARY -> MaterialTheme.colorScheme.tertiary
    Colors.ON_ERROR_CONTAINER -> MaterialTheme.colorScheme.onErrorContainer
    Colors.ON_ERROR -> MaterialTheme.colorScheme.onError
    Colors.BACKGROUND -> MaterialTheme.colorScheme.background
    Colors.SECONDARY -> MaterialTheme.colorScheme.secondary
    Colors.OUTLINE -> MaterialTheme.colorScheme.outline
    Colors.INVERSE_PRIMARY -> MaterialTheme.colorScheme.inversePrimary
    Colors.ERROR_CONTAINER -> MaterialTheme.colorScheme.errorContainer
    Colors.OUT_LINE_VARIANT -> MaterialTheme.colorScheme.outlineVariant
}