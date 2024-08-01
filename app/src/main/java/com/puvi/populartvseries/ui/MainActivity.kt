package com.puvi.populartvseries.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.puvi.populartvseries.ui.navigation.AppNavigation
import com.puvi.populartvseries.ui.theme.PopularTVSeriesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        actionBar?.hide()
        setContent {
            PopularTVSeriesTheme {
                AppNavigation()
            }
        }
    }
}
