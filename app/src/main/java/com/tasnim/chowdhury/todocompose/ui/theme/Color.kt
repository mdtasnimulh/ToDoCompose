package com.tasnim.chowdhury.todocompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF072D8A)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val Blue500 = Color(0xFF11399C)
val Blue400 = Color(0xFF1A4CC7)

val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)

val LowPriorityColor = Color(0xFF00C980)
val MediumPriorityColor = Color(0xFFFFC114)
val HighPriorityColor = Color(0xFFFF4646)
val NonePriorityColor = MediumGray

val ColorScheme.TaskItemTextColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Color.DarkGray else LightGray

val ColorScheme.TaskItemBackgroundColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Color.White else DarkGray

val ColorScheme.FabBackgroundColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Blue400 else Blue500

val ColorScheme.TopAppBarContentColor: Color
@Composable
get() = if (!isSystemInDarkTheme()) Color.White else LightGray

val ColorScheme.TopAppBarBackgroundColor: Color
    @Composable
    get() = if (!isSystemInDarkTheme()) Blue500 else DarkGray