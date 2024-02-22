package com.tasnim.chowdhury.todocompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.tasnim.chowdhury.todocompose.ui.screens.splash.SplashScreen
import com.tasnim.chowdhury.todocompose.util.Constants.SPLASH_SCREEN

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,
) {
    composable(
        route = SPLASH_SCREEN,
    ){
        SplashScreen(navigateToListScreen = navigateToListScreen)
    }
}