package com.m3.design.lesson.presentation.utils.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.m3.design.lesson.R
import com.m3.design.lesson.data.model.ArticleModel
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun ArticleItem(
    model: ArticleModel,
    viewModel: SettingsViewModel,
    onClick: () -> Unit,
) {

    Box(modifier = Modifier.padding(vertical = 10.dp)) {
        Box(
            modifier = Modifier
                .createContainer(viewModel)
                .fillMaxWidth()
                .height(200.dp)
                .clickable { onClick() },
            contentAlignment = Alignment.Center,
        ) {

            Box(modifier = Modifier.fillMaxSize(.9f), contentAlignment = Alignment.CenterEnd) {
                Image(
                    painter = painterResource(id = R.drawable.asset_article),
                    contentDescription = null,
                    modifier = Modifier.fillMaxHeight(.9f),
                    contentScale = ContentScale.FillHeight
                )
            }


            Box(modifier = Modifier.fillMaxSize().background(Color.Black.copy(.1f)))
            Column(
                modifier = Modifier.fillMaxWidth(.8f),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                HeadlineText(
                    value = model.title,
                    viewModel = viewModel,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start,
                    maxLines = 2,
                )

                BodyText(
                    value = model.preview,
                    viewModel = viewModel,
                    textAlign = TextAlign.Start,
                    maxLines = 2,
                )
            }

        }
    }

}