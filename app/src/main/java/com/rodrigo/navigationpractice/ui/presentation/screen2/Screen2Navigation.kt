package com.rodrigo.navigationpractice.ui.presentation.screen2

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.rodrigo.navigationpractice.navigation.NavArg
import com.rodrigo.navigationpractice.navigation.NavItem

private const val LOG = "Screen2Navigation"
@Composable
fun Screen2Navigation(navController: NavController, bundle: Bundle?) {
    val id = bundle?.getString(NavArg.ScreenId.key)
    Screen2(
        toScreen1 = {screenId -> navController.navigate(NavItem.Screen1.createNavRoute(screenId))},
        toScreen3 = {screenId -> navController.navigate(NavItem.Screen3.createNavRoute(screenId))},
        screenFromId = id
    )
}