package com.salexey.nsqmarkettest.ui.screens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.salexey.nsqmarkettest.ui.screens.splashscreen.SplashScreen
import com.salexey.nsqmarkettest.ui.screens.wallpaperscreen.WallPaperScreen
import com.salexey.nsqmarkettest.ui.screens.webscreen.WebScreen

@Composable
fun NavGraph(navController: NavHostController = rememberNavController(),) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.SPLASH_SCREEN
    ) {
        composable(route = Graph.SPLASH_SCREEN) {
            SplashScreen(navController)
        }

        composable(route = Graph.WALLPAPER_SCREEN) {
            WallPaperScreen(navController)
        }

        composable(route = Graph.WEB_SCREEN) {
            WebScreen(navController)
        }

    }
}

object Graph {
    const val ROOT = "ROOT"

    const val SPLASH_SCREEN = "SPLASH_SCREEN"
    const val WALLPAPER_SCREEN = "WALLPAPER_SCREEN"
    const val WEB_SCREEN = "WEB_SCREEN"
}
