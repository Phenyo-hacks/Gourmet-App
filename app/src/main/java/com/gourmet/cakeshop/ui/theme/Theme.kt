package com.gourmet.cakeshop.ui.theme


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun GourmetTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = androidx.compose.material3.lightColorScheme(
            primary = PrimaryColor,
            onPrimary = Color.White,
            surface = Surface,
            onSurface = OnSurface,
            background = Background
        ),
        typography = Typography,
        content = content
    )
}