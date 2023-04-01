package com.salexey.nsqmarkettest.ui.screens.splashscreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.salexey.nsqmarkettest.ui.screens.navigation.Graph
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.compose.koinViewModel

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(
    navController: NavHostController = rememberNavController(),
    viewModel: SplashViewModel = koinViewModel()
): Unit {
    val scope = rememberCoroutineScope()


    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue),
        contentAlignment = Alignment.Center
    ) {

        Text(viewModel.text)

        /*
        scope.launch {

            delay(1000L)
            navController.popBackStack()
            navController.navigate(Graph.WALLPAPER_SCREEN)
        }*/
    }


}


