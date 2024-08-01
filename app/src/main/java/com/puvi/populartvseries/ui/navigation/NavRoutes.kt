package com.puvi.populartvseries.ui.navigation

import com.puvi.populartvseries.util.Routes

sealed class NavRoutes(val route: String) {
    object TvSeriesScreen : NavRoutes(Routes.TV_SERIES_SCREEN)
    object DetailsScreen : NavRoutes(Routes.DETAILS_SCREEN) {
        fun createRoute(seriesId: String) = "detailsScreen/$seriesId"
    }

}