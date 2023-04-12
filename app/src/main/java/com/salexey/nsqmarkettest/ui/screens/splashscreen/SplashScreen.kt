package com.salexey.nsqmarkettest.ui.screens.splashscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.salexey.nsqmarkettest.ui.screens.navigation.Graph
import org.koin.androidx.compose.koinViewModel

@Composable
fun SplashScreen(
    navController: NavHostController = rememberNavController(),
    viewModel: SplashViewModel = koinViewModel()
) {
    val screenId = viewModel.screenId.value.collectAsState()

    navByScreenId(screenId.value, navController)


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Text("Загружаем данные", color = Color.White, fontSize = 24.sp, fontWeight = FontWeight(500))

    }
}

@Composable
fun navByScreenId(screenId: String,  navController: NavHostController) {

    when(screenId){
        "1" -> {
            LaunchedEffect(Unit) {
                navController.popBackStack()
                navController.navigate(Graph.WALLPAPER_SCREEN)
            }
        }
        "2" -> {
            LaunchedEffect(Unit) {
                navController.popBackStack()
                navController.navigate(Graph.WEB_SCREEN)
            }
        }
    }

}