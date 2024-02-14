package com.rodrigo.navigationpractice.ui.presentation.screen1

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.rodrigo.navigationpractice.navigation.NavArg
import com.rodrigo.navigationpractice.navigation.NavItem

private const val LOG = "Screen1Navigation"
@Composable
fun Screen1Navigation(navController: NavController, bundle: Bundle?) {
    val id = bundle?.getString(NavArg.ScreenId.key)
    Screen1(
        toScreen2 = {screenId ->
                navController.navigate(NavItem.Screen2.createNavRoute(screenId))
        },
        toScreen3 = {screenId ->
                navController.navigate(NavItem.Screen3.createNavRoute(screenId))
        },
        screenFromId = id
    )
}