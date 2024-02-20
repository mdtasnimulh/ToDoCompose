package com.tasnim.chowdhury.todocompose.ui.screens.list

import androidx.compose.foundation.background
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.tasnim.chowdhury.todocompose.ui.theme.TopAppBarBackgroundColor
import com.tasnim.chowdhury.todocompose.ui.theme.TopAppBarContentColor

@Composable
fun ListAppBar(){
    DefaultListAppBar()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultListAppBar(){
    TopAppBar(
        title = { Text(text = "Tasks", color = MaterialTheme.colorScheme.TopAppBarContentColor)},
        colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.TopAppBarBackgroundColor)
    )
}

@Composable
@Preview(showBackground = true)
private fun DefaultListAppBarPreview(){
    DefaultListAppBar()
}