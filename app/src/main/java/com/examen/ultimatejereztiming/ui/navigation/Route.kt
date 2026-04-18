package com.examen.ultimatejereztiming.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Route {
    @Serializable
    data object Home : Route()

    @Serializable
    data class Detail(val id: String) : Route()
    @Serializable
    data object Qr : Route()

    @Serializable
    data object Camping : Route()

    @Serializable
    data object Schedule : Route()

    @Serializable
    data class DaySchedule(val id: String) : Route()
}
