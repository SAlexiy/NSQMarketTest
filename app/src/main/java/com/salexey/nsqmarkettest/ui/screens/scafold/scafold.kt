package com.salexey.nsqmarkettest.ui.screens.scafold

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.salexey.nsqmarkettest.ui.screens.navigation.NavGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldScreen(){
    val navController = rememberNavController()

    Scaffold(
        content = { NavGraph(navController) }
    )
}