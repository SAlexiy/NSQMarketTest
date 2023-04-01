package com.salexey.nsqmarkettest.ui.elements.imagepager

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun PhotoPager(images: List<Int>) {
    val pagerState = rememberPagerState()

    HorizontalPager(modifier = Modifier
        .wrapContentSize(),
        count = images.size,
        state = pagerState) { page ->

        Column {
            Image(
                painter = painterResource(id = images[page]),
                contentDescription = "Andy Rubin",
                modifier = Modifier.background(color = Color.Red)
            )

            PageIndicator(images.size, page)

        }
    }
}
