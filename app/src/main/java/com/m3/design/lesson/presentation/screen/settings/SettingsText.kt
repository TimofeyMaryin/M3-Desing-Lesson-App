package com.m3.design.lesson.presentation.screen.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.m3.design.lesson.presentation.utils.params.TextClass
import com.m3.design.lesson.presentation.utils.ui.Container
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.utils.ui.LabelText
import com.m3.design.lesson.presentation.utils.ui.TitleText
import com.m3.design.lesson.presentation.utils.ui.createColor
import com.m3.design.lesson.presentation.utils.ui.createContainer
import com.m3.design.lesson.presentation.utils.ui.createSettingsProgressBar
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun SettingsText(
    navController: NavController,
    viewModel: SettingsViewModel,
) {


    FragmentManager(navController = navController, title = "Текст", viewModel = viewModel) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                TitleText(
                    value = "Display",
                    viewModel = viewModel
                )
                Spacer(modifier = Modifier.height(20.dp))

                Box(
                    modifier = Modifier.createSettingsProgressBar(viewModel),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        SettingsTextSizeItem(
                            value = "Display",
                            enable = viewModel.textStyle_Display == TextClass.DISPLAY,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Display = TextClass.DISPLAY
                        }

                        SettingsTextSizeItem(
                            value = "Headline",
                            enable = viewModel.textStyle_Display == TextClass.HEADLINE,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Display = TextClass.HEADLINE
                        }

                        SettingsTextSizeItem(
                            value = "Title",
                            enable = viewModel.textStyle_Display == TextClass.TITLE,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Display = TextClass.TITLE
                        }

                        SettingsTextSizeItem(
                            value = "Body",
                            enable = viewModel.textStyle_Display == TextClass.BODY,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Display = TextClass.BODY
                        }

                        SettingsTextSizeItem(
                            value = "Label",
                            enable = viewModel.textStyle_Display == TextClass.LABEL,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Display = TextClass.LABEL
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(50.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                TitleText(
                    value = "Headline",
                    viewModel = viewModel
                )
                Spacer(modifier = Modifier.height(20.dp))

                Box(
                    modifier = Modifier.createSettingsProgressBar(viewModel),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        SettingsTextSizeItem(
                            value = "Display",
                            enable = viewModel.textStyle_Headline == TextClass.DISPLAY,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Headline = TextClass.DISPLAY
                        }

                        SettingsTextSizeItem(
                            value = "Headline",
                            enable = viewModel.textStyle_Headline == TextClass.HEADLINE,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Headline = TextClass.HEADLINE
                        }

                        SettingsTextSizeItem(
                            value = "Title",
                            enable = viewModel.textStyle_Headline == TextClass.TITLE,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Headline = TextClass.TITLE
                        }

                        SettingsTextSizeItem(
                            value = "Body",
                            enable = viewModel.textStyle_Headline == TextClass.BODY,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Headline = TextClass.BODY
                        }

                        SettingsTextSizeItem(
                            value = "Label",
                            enable = viewModel.textStyle_Headline == TextClass.LABEL,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Headline = TextClass.LABEL
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(50.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                TitleText(
                    value = "Title",
                    viewModel = viewModel
                )
                Spacer(modifier = Modifier.height(20.dp))

                Box(
                    modifier = Modifier.createSettingsProgressBar(viewModel),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        SettingsTextSizeItem(
                            value = "Display",
                            enable = viewModel.textStyle_Title == TextClass.DISPLAY,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Title = TextClass.DISPLAY
                        }

                        SettingsTextSizeItem(
                            value = "Headline",
                            enable = viewModel.textStyle_Title == TextClass.HEADLINE,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Title = TextClass.HEADLINE
                        }

                        SettingsTextSizeItem(
                            value = "Title",
                            enable = viewModel.textStyle_Title == TextClass.TITLE,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Title = TextClass.TITLE
                        }

                        SettingsTextSizeItem(
                            value = "Body",
                            enable = viewModel.textStyle_Title == TextClass.BODY,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Title = TextClass.BODY
                        }

                        SettingsTextSizeItem(
                            value = "Label",
                            enable = viewModel.textStyle_Title == TextClass.LABEL,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Title = TextClass.LABEL
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(50.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                TitleText(
                    value = "Body",
                    viewModel = viewModel
                )
                Spacer(modifier = Modifier.height(20.dp))

                Box(
                    modifier = Modifier.createSettingsProgressBar(viewModel),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        SettingsTextSizeItem(
                            value = "Display",
                            enable = viewModel.textStyle_Body == TextClass.DISPLAY,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Body = TextClass.DISPLAY
                        }

                        SettingsTextSizeItem(
                            value = "Headline",
                            enable = viewModel.textStyle_Body == TextClass.HEADLINE,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Body = TextClass.HEADLINE
                        }

                        SettingsTextSizeItem(
                            value = "Title",
                            enable = viewModel.textStyle_Body == TextClass.TITLE,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Body = TextClass.TITLE
                        }

                        SettingsTextSizeItem(
                            value = "Body",
                            enable = viewModel.textStyle_Body == TextClass.BODY,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Body = TextClass.BODY
                        }

                        SettingsTextSizeItem(
                            value = "Label",
                            enable = viewModel.textStyle_Body == TextClass.LABEL,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Body = TextClass.LABEL
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(50.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                TitleText(
                    value = "Label",
                    viewModel = viewModel
                )
                Spacer(modifier = Modifier.height(20.dp))

                Box(
                    modifier = Modifier.createSettingsProgressBar(viewModel),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        SettingsTextSizeItem(
                            value = "Display",
                            enable = viewModel.textStyle_Label == TextClass.DISPLAY,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Label = TextClass.DISPLAY
                        }

                        SettingsTextSizeItem(
                            value = "Headline",
                            enable = viewModel.textStyle_Label == TextClass.HEADLINE,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Label = TextClass.HEADLINE
                        }

                        SettingsTextSizeItem(
                            value = "Title",
                            enable = viewModel.textStyle_Label == TextClass.TITLE,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Label = TextClass.TITLE
                        }

                        SettingsTextSizeItem(
                            value = "Body",
                            enable = viewModel.textStyle_Label == TextClass.BODY,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Label = TextClass.BODY
                        }

                        SettingsTextSizeItem(
                            value = "Label",
                            enable = viewModel.textStyle_Label == TextClass.LABEL,
                            viewModel = viewModel
                        ) {
                            viewModel.textStyle_Label = TextClass.LABEL
                        }
                    }
                }
            }

        }

    }
}

@Composable
private fun ChangeTextSizeItem(
    value: String,
    viewModel: SettingsViewModel,
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        TitleText(
            value = value,
            viewModel = viewModel
        )
        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier.createSettingsProgressBar(viewModel),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                SettingsTextSizeItem(
                    value = "Display",
                    enable = viewModel.textStyle_Display == TextClass.DISPLAY,
                    viewModel = viewModel
                ) {
                    viewModel.textStyle_Display = TextClass.DISPLAY
                }

                SettingsTextSizeItem(
                    value = "Headline",
                    enable = viewModel.textStyle_Display == TextClass.HEADLINE,
                    viewModel = viewModel
                ) {
                    viewModel.textStyle_Display = TextClass.HEADLINE
                }

                SettingsTextSizeItem(
                    value = "Title",
                    enable = viewModel.textStyle_Display == TextClass.TITLE,
                    viewModel = viewModel
                ) {
                    viewModel.textStyle_Display = TextClass.TITLE
                }

                SettingsTextSizeItem(
                    value = "Body",
                    enable = viewModel.textStyle_Display == TextClass.BODY,
                    viewModel = viewModel
                ) {
                    viewModel.textStyle_Display = TextClass.BODY
                }

                SettingsTextSizeItem(
                    value = "Label",
                    enable = viewModel.textStyle_Display == TextClass.LABEL,
                    viewModel = viewModel
                ) {
                    viewModel.textStyle_Display = TextClass.LABEL
                }
            }
        }
    }
}

@Composable
private fun RowScope.SettingsTextSizeItem(
    value: String,
    enable: Boolean,
    viewModel: SettingsViewModel,
    onClick: () -> Unit,
) {
    Container(weight = 1f) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .fillMaxSize(.95f)
                .background(
                    createColor(colors = if (enable) viewModel.containerColor else viewModel.selectedContainerColor)
                )
                .clickable { onClick() },
            contentAlignment = Alignment.Center,
        ) {
            LabelText(value = value, viewModel = viewModel)
        }
    }
}

