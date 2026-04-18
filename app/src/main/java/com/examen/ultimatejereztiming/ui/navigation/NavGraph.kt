package com.examen.ultimatejereztiming.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
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
                },
                onCampingClick = {
                    navController.navigate(Route.Camping)
                },
                onScheduleClick = {
                    navController.navigate(Route.Schedule)
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
        composable<Route.Camping> {
            com.examen.ultimatejereztiming.ui.camping.CampingScreen(
                onTopicClick = { id ->
                    navController.navigate(Route.Detail(id))
                },
                onQrClick = {
                    navController.navigate(Route.Qr)
                },
                onHomeClick = {
                    navController.navigate(Route.Home) {
                        popUpTo(Route.Home) { inclusive = false }
                    }
                },
                onScheduleClick = {
                    navController.navigate(Route.Schedule)
                }
            )
        }
        composable<Route.Schedule> {
            com.examen.ultimatejereztiming.ui.schedule.ScheduleScreen(
                onHomeClick = {
                    navController.navigate(Route.Home) {
                        popUpTo(Route.Home) { inclusive = false }
                    }
                },
                onCampingClick = {
                    navController.navigate(Route.Camping)
                },
                onQrClick = {
                    navController.navigate(Route.Qr)
                },
                onDayClick = { id ->
                    navController.navigate(Route.DaySchedule(id))
                }
            )
        }
        composable<Route.DaySchedule> { backStackEntry ->
            val daySchedule = backStackEntry.toRoute<Route.DaySchedule>()
            com.examen.ultimatejereztiming.ui.schedule.DayScheduleScreen(
                dayId = daySchedule.id,
                onBackClick = {
                    navController.popBackStack()
                },
                onHomeClick = {
                    navController.navigate(Route.Home) {
                        popUpTo(Route.Home) { inclusive = false }
                    }
                },
                onCampingClick = {
                    navController.navigate(Route.Camping)
                },
                onScheduleClick = {
                    navController.navigate(Route.Schedule)
                },
                onQrClick = {
                    navController.navigate(Route.Qr)
                }
            )
        }
    }
}
