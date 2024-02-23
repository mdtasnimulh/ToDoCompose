package com.tasnim.chowdhury.todocompose.ui.screens.task

import android.content.Context
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.tasnim.chowdhury.todocompose.data.models.Priority
import com.tasnim.chowdhury.todocompose.data.models.ToDoTask
import com.tasnim.chowdhury.todocompose.ui.viewModel.SharedViewModel
import com.tasnim.chowdhury.todocompose.util.Action

@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
    val title: String = sharedViewModel.title
    val description: String = sharedViewModel.description
    val priority: Priority = sharedViewModel.priority

    val context = LocalContext.current

    BackHandler {
        navigateToListScreen(Action.NO_ACTION)
    }

    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = { action ->
                    if (action == Action.NO_ACTION) {
                        navigateToListScreen(action)
                    } else {
                        if (sharedViewModel.validateFields()) {
                            navigateToListScreen(action)
                        } else {
                            displayToast(context = context)
                        }
                    }
                }
            )
        },
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                TaskContent(
                    title = title,
                    onTitleChange = { newTitle ->
                        sharedViewModel.updateTitle(newTitle)
                    },
                    description = description,
                    onDescriptionChange = { newDescription ->
                        sharedViewModel.updateDescription(newDescription = newDescription)
                    },
                    priority = priority,
                    onPrioritySelected = { newPriority ->
                        sharedViewModel.updatePriority(newPriority = newPriority)
                    }
                )
            }
        }
    )
}

fun displayToast(context: Context) {
    Toast.makeText(context, "Fields can not be empty!", Toast.LENGTH_SHORT).show()
}