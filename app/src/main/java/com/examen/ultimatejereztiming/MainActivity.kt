package com.examen.ultimatejereztiming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.examen.ultimatejereztiming.ui.navigation.NavGraph
import com.examen.ultimatejereztiming.ui.theme.UltimateJerezTimingTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UltimateJerezTimingTheme {
                NavGraph()
            }
        }
    }
}