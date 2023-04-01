package com.salexey.nsqmarkettest.ui.screens.wallpaperscreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.salexey.nsqmarkettest.consts.WallPapers
import com.salexey.nsqmarkettest.ui.elements.imagepager.PhotoPager

@Composable
fun WallPaperScreen(navController: NavHostController){

    PhotoPager(WallPapers.list)
}


