package com.ejercicio.stunningapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.ejercicio.stunningapp.ui.screens.IntroScreen
import androidx.navigation.compose.composable

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "intro") {
        composable("intro") {
            IntroScreen(
                onGetStartedClick = {
                    navController.navigate("main_app"){
                        popUpTo("intro"){
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}