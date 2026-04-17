package com.examen.ultimatejereztiming.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.examen.ultimatejereztiming.ui.home.HomeScreen
import com.examen.ultimatejereztiming.ui.detail.DetailScreen
import com.examen.ultimatejereztiming.ui.qr.QrScreen

@Composable
fun NavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Route.Home
    ) {
        composable<Route.Home> {
            HomeScreen(
                onTopicClick = { id ->
                    navController.navigate(Route.Detail(id))
                },
                onQrClick = {
                    navController.navigate(Route.Qr)
                }
            )
        }
        composable<Route.Detail> {
            DetailScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
        composable<Route.Qr> {
            QrScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}
