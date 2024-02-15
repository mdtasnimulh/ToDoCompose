package com.tasnim.chowdhury.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.tasnim.chowdhury.todocompose.ui.theme.HighPriorityColor
import com.tasnim.chowdhury.todocompose.ui.theme.LowPriorityColor
import com.tasnim.chowdhury.todocompose.ui.theme.MediumPriorityColor
import com.tasnim.chowdhury.todocompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor),
}