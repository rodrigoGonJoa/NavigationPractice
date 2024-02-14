package com.rodrigo.navigationpractice.ui.presentation.screen3

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.rodrigo.navigationpractice.navigation.NavArg
import com.rodrigo.navigationpractice.navigation.NavItem

private const val LOG = "Screen3Navigation"
@Composable
fun Screen3Navigation(navController: NavController, bundle: Bundle?) {
    val id = bundle?.getString(NavArg.ScreenId.key)
    Screen3(
        toScreen1 = {screenId ->
            navController.navigate(NavItem.Screen1.createNavRoute(screenId))
        },
        toScreen2 = {screenId ->
            navController.navigate(NavItem.Screen2.createNavRoute(screenId))
        },
        screenFromId = id
    )
}