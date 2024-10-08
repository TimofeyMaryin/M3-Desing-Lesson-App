package com.m3.design.lesson.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.m3.design.lesson.presentation.utils.ui.FragmentManager
import com.m3.design.lesson.presentation.utils.ui.createContainer
import com.m3.design.lesson.presentation.vms.SettingsViewModel

@Composable
fun MainFragment(
    navController: NavController,
    viewModel: SettingsViewModel,
) {

    FragmentManager(navController = navController) {

        Box(modifier = Modifier.createContainer(viewModel).fillMaxWidth(.9f).height(150.dp))

    }

}