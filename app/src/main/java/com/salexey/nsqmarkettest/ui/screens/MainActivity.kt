package com.salexey.nsqmarkettest.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import com.salexey.nsqmarkettest.ui.screens.scafold.ScaffoldScreen
import com.salexey.nsqmarkettest.ui.theme.NSQMarketTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NSQMarketTestTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    ScaffoldScreen()
                }
            }
        }
    }
}




