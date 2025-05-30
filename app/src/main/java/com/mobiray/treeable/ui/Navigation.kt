package com.mobiray.treeable.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mobiray.treeable.feature.treeview.ui.TreeScreen

private sealed class Screen(val route: String) {
    data object TreeView : Screen("treeview")
}

@Composable
fun TreeableAppNavigation(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.TreeView.route
    ) {
        composable(route = Screen.TreeView.route) {
            TreeScreen()
        }
    }
}