package com.tasnim.chowdhury.todocompose.navigation.destinations

import android.util.Log
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.tasnim.chowdhury.todocompose.ui.screens.list.ListScreen
import com.tasnim.chowdhury.todocompose.ui.viewModel.SharedViewModel
import com.tasnim.chowdhury.todocompose.util.Action
import com.tasnim.chowdhury.todocompose.util.Constants.LIST_ARGUMENT_KEY
import com.tasnim.chowdhury.todocompose.util.Constants.LIST_SCREEN
import com.tasnim.chowdhury.todocompose.util.toAction

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ){ navBackStackEntry ->
        val action = navBackStackEntry.arguments?.getString(LIST_ARGUMENT_KEY).toAction()
        Log.d("ListComposable", action.name)

        var myAction by rememberSaveable { mutableStateOf(Action.NO_ACTION) }
        
        LaunchedEffect(key1 = myAction) {
            if (action != myAction) {
                myAction = action
                sharedViewModel.action.value = action
            }
        }

        val databaseAction by sharedViewModel.action

        ListScreen(
            action = databaseAction,
            navigateToTaskScreen = navigateToTaskScreen,
            sharedViewModel = sharedViewModel
        )
    }
}