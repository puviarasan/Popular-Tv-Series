package com.puvi.populartvseries.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.puvi.populartvseries.ui.screens.TvSeriesComposable

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoutes.TvSeriesScreen.route){
        composable(NavRoutes.TvSeriesScreen.route){
            TvSeriesComposable(navController = navController)
        }
    }
}