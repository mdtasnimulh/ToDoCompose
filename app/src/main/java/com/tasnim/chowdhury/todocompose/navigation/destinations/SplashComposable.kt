package com.tasnim.chowdhury.todocompose.navigation.destinations

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideOutVertically
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.tasnim.chowdhury.todocompose.ui.screens.splash.SplashScreen
import com.tasnim.chowdhury.todocompose.util.Constants.SPLASH_SCREEN

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,
) {
    composable(
        route = SPLASH_SCREEN,
        exitTransition = {
            slideOutVertically(
                targetOffsetY = { -it },
                animationSpec = tween(durationMillis = 500)
            )
        }
    ){
        SplashScreen(navigateToListScreen = navigateToListScreen)
    }
}