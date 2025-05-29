package com.example.ui_week3.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

@Composable
fun UIWeek3Theme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(), // Giao diện tối (dark mode)
        typography = androidx.compose.material3.Typography(),
        content = content
    )
}
