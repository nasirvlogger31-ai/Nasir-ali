package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Emerald500,
    secondary = AccentGold,
    tertiary = AccentTeal,
    background = Slate900,
    surface = Slate800,
    onPrimary = Color.White,
    onSecondary = Slate900,
    onBackground = Slate50,
    onSurface = Slate50,
    surfaceVariant = Slate700,
    onSurfaceVariant = Slate300,
    outline = Slate500
)

private val LightColorScheme = lightColorScheme(
    primary = Emerald600,
    secondary = AccentGold,
    tertiary = AccentTeal,
    background = Slate50,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Slate900,
    onBackground = Slate900,
    onSurface = Slate900,
    surfaceVariant = Slate300,
    onSurfaceVariant = Slate700,
    outline = Slate500
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Keep Islamic Slate Dark Theme consistent as per prompt instructions, but support basic override if requested
    forceDark: Boolean = true,
    content: @Composable () -> Unit,
) {
    val colorScheme = if (forceDark || darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
