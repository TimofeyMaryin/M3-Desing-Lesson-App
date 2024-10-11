package com.m3.design.lesson.presentation.utils.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.m3.design.lesson.presentation.utils.params.Colors
import com.m3.design.lesson.presentation.vms.SettingsViewModel


@Composable
fun setColorByType(type: Colors): Color {
    return when (type) {
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
        Colors.UNSPECIFIED -> Color.Unspecified
    }
}

@Composable
fun ColorSquare(
    viewModel: SettingsViewModel,
    currentColors: Colors,
    onChangeColor: (Colors) -> Unit
) {


    Box(
        modifier = Modifier
            .createContainer(viewModel)
            .fillMaxWidth()
            .height(450.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier.fillMaxSize(.9f)
        ) {
            Container(weight = 1f) {
                Row {
                   ColorsItem(
                       value = "PRIMARY",
                       type = Colors.PRIMARY,
                       viewModel = viewModel,
                       selected = currentColors == Colors.PRIMARY,
                   ) {
                       onChangeColor(Colors.PRIMARY)
                   }

                    ColorsItem(
                        value = "ERROR",
                        type = Colors.ERROR,
                        viewModel = viewModel,
                        selected = currentColors == Colors.ERROR,
                    ) {
                        onChangeColor(Colors.ERROR)
                    }

                    ColorsItem(
                        value = "SCRIM",
                        type = Colors.SCRIM,
                        viewModel = viewModel,
                        selected = currentColors == Colors.SCRIM,
                    ) {
                        onChangeColor(Colors.SCRIM)
                    }

                    ColorsItem(
                        value = "ON_PRIMARY",
                        type = Colors.ON_PRIMARY,
                        viewModel = viewModel,
                        selected = currentColors == Colors.ON_PRIMARY,
                    ) {
                        onChangeColor(Colors.ON_PRIMARY)
                    }
                }
            }

            Container(weight = 1f) {
                Row {
                    ColorsItem(
                        value = "SURFACE",
                        type = Colors.SURFACE,
                        viewModel = viewModel,
                        selected = currentColors == Colors.SURFACE,
                    ) {
                        onChangeColor(Colors.SURFACE)
                    }

                    ColorsItem(
                        value = "ON_PRIMARY_CONTAINER",
                        type = Colors.ON_PRIMARY_CONTAINER,
                        viewModel = viewModel,
                        selected = currentColors == Colors.ON_PRIMARY_CONTAINER,
                    ) {
                        onChangeColor(Colors.ON_PRIMARY_CONTAINER)
                    }

                    ColorsItem(
                        value = "PRIMARY_CONTAINER",
                        type = Colors.PRIMARY_CONTAINER,
                        viewModel = viewModel,
                        selected = currentColors == Colors.PRIMARY_CONTAINER,
                    ) {
                        onChangeColor(Colors.PRIMARY_CONTAINER)
                    }

                    ColorsItem(
                        value = "TERTIARY",
                        type = Colors.TERTIARY,
                        viewModel = viewModel,
                        selected = currentColors == Colors.TERTIARY,
                    ) {
                        onChangeColor(Colors.TERTIARY)
                    }
                }
            }

            Container(weight = 1f) {
                Row {
                    ColorsItem(
                        value = "ON_ERROR_CONTAINER",
                        type = Colors.ON_ERROR_CONTAINER,
                        viewModel = viewModel,
                        selected = currentColors == Colors.ON_ERROR_CONTAINER,
                    ) {
                        onChangeColor(Colors.ON_ERROR_CONTAINER)
                    }

                    ColorsItem(
                        value = "ON_ERROR",
                        type = Colors.ON_ERROR,
                        viewModel = viewModel,
                        selected = currentColors == Colors.ON_ERROR,
                    ) {
                        onChangeColor(Colors.ON_ERROR)
                    }

                    ColorsItem(
                        value = "BACKGROUND",
                        type = Colors.BACKGROUND,
                        viewModel = viewModel,
                        selected = currentColors == Colors.BACKGROUND,
                    ) {
                        onChangeColor(Colors.BACKGROUND)
                    }

                    ColorsItem(
                        value = "SECONDARY",
                        type = Colors.SECONDARY,
                        viewModel = viewModel,
                        selected = currentColors == Colors.SECONDARY,
                    ) {
                        onChangeColor(Colors.SECONDARY)
                    }
                }
            }

            Container(weight = 1f) {
                Row {
                    ColorsItem(
                        value = "OUTLINE",
                        type = Colors.OUTLINE,
                        viewModel = viewModel,
                        selected = currentColors == Colors.OUTLINE,
                    ) {
                        onChangeColor(Colors.OUTLINE)
                    }

                    ColorsItem(
                        value = "INVERSE_PRIMARY",
                        type = Colors.INVERSE_PRIMARY,
                        viewModel = viewModel,
                        selected = currentColors == Colors.INVERSE_PRIMARY,
                    ) {
                        onChangeColor(Colors.INVERSE_PRIMARY)
                    }

                    ColorsItem(
                        value = "ERROR_CONTAINER",
                        type = Colors.ERROR_CONTAINER,
                        viewModel = viewModel,
                        selected = currentColors == Colors.ERROR_CONTAINER,
                    ) {
                        onChangeColor(Colors.ERROR_CONTAINER)
                    }

                    ColorsItem(
                        value = "OUT_LINE_VARIANT",
                        type = Colors.OUT_LINE_VARIANT,
                        viewModel = viewModel,
                        selected = currentColors == Colors.OUT_LINE_VARIANT,
                    ) {
                        onChangeColor(Colors.OUT_LINE_VARIANT)
                    }
                }
            }
        }
    }


}



@Composable
private fun RowScope.ColorsItem(
    value: String,
    type: Colors,
    selected: Boolean,
    viewModel: SettingsViewModel,
    onChangeColor: (Colors) -> Unit
) {

    Container(weight = 1f) {
        Box(
            modifier = Modifier
                .clip(createClip(shapes = viewModel.containerShapes))
                .background(
                    if (selected) {
                        createColor(colors = type).copy(.6f)
                    } else {
                        Color.Transparent
                    }
                )
                .fillMaxSize()
                .clickable { onChangeColor(type) },
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .border(2.dp, Color.Black, CircleShape)
                        .size(50.dp)
                        .background(setColorByType(type = type)),
                )
                LabelText(value = value, viewModel = viewModel)
            }
        }
    }

}