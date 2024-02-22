package com.tasnim.chowdhury.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.tasnim.chowdhury.todocompose.navigation.destinations.listComposable
import com.tasnim.chowdhury.todocompose.navigation.destinations.splashComposable
import com.tasnim.chowdhury.todocompose.navigation.destinations.taskComposable
import com.tasnim.chowdhury.todocompose.ui.viewModel.SharedViewModel
import com.tasnim.chowdhury.todocompose.util.Constants.SPLASH_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = SPLASH_SCREEN
    ) {
        splashComposable(
            navigateToListScreen = screen.splash
        )
        listComposable(
            navigateToTaskScreen = screen.list,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.task,
            sharedViewModel = sharedViewModel,
        )
    }
}