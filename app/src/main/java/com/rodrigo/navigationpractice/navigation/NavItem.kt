package com.rodrigo.navigationpractice.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class NavItem(
    protected val baseRoute: String,
    private val navArgs: List<NavArg> = emptyList()
) {
    data object Screen1: NavItem("Screen1", listOf(NavArg.ScreenId)){
        fun createNavRoute(screenId: String) = "$baseRoute/$screenId"
    }
    data object Screen2: NavItem("Screen2", listOf(NavArg.ScreenId)){
        fun createNavRoute(screenId: String) = "$baseRoute/$screenId"
    }
    data object Screen3: NavItem("Screen3", listOf(NavArg.ScreenId)){
        fun createNavRoute(screenId: String) = "$baseRoute/$screenId"
    }

    val route = run {
        val argKeys = navArgs.map {"{${it.key}}"}
        listOf(baseRoute)
            .plus(argKeys)
            .joinToString("/")
    }
    val args = navArgs.map {
        navArgument(it.key) {type = it.navType}
    }

    companion object{
        private const val LOG = "NavItem"
    }
}

enum class NavArg(val key: String, val navType: NavType<*>) {
    ScreenId("ScreenId", NavType.StringType)
}