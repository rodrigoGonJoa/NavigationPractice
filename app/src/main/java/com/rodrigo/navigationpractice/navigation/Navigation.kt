package com.rodrigo.navigationpractice.navigation


import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rodrigo.navigationpractice.ui.presentation.screen1.Screen1Navigation
import com.rodrigo.navigationpractice.ui.presentation.screen2.Screen2Navigation
import com.rodrigo.navigationpractice.ui.presentation.screen3.Screen3Navigation

private const val LOG = "NavigationGraph"

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavItem.Screen1.route,
        enterTransition = {EnterTransition.None},
        exitTransition = {ExitTransition.None}
    ) {
        composable(
            route = NavItem.Screen1.route,
            arguments = NavItem.Screen1.args
        ) {entry -> Screen1Navigation(navController, entry.arguments)}
        composable(
            route = NavItem.Screen2.route,
            arguments = NavItem.Screen2.args
        ) {entry -> Screen2Navigation(navController, entry.arguments)}
        composable(
            route = NavItem.Screen3.route,
            arguments = NavItem.Screen3.args
        ) {entry -> Screen3Navigation(navController, entry.arguments)}
    }
}