package com.salexey.nsqmarkettest.ui.elements.imagepager

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun PageIndicator(count: Int, current: Int) {
    Row(modifier = Modifier
        .fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        for (i in 0 until count){

            val color = if (i == current){
                Color.Red
            } else{
                Color.Gray
            }

            Box(modifier = Modifier
                .padding(5.dp)
                .background(color = color, shape = CircleShape)
                .size(10.dp)){

            }
        }
    }
}