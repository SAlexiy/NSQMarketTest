package com.salexey.nsqmarkettest.ui.screens.splashscreen

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.salexey.nsqmarkettest.ui.screens.navigation.Graph
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.koin.androidx.compose.koinViewModel
import kotlin.coroutines.CoroutineContext

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(
    navController: NavHostController = rememberNavController(),
    viewModel: SplashViewModel = koinViewModel()
): Unit {

    viewModel.downloadFiles()
    val value = viewModel.fileD.value.collectAsState()
    nav(x = value.value, navController)


    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue),
        contentAlignment = Alignment.Center
    ) {


    }
}



@Composable
fun nav(x: Boolean?, navController: NavHostController): Unit {

    if(x != null){
        if(!x){
            LaunchedEffect(Unit) {
                navController.popBackStack()
                navController.navigate(Graph.WEB_SCREEN)
            }
        } else {
            LaunchedEffect(Unit) {
                navController.popBackStack()
                navController.navigate(Graph.WALLPAPER_SCREEN)
            }
        }
    }

}