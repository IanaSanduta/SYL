package com.example.syl.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = darkBlue,
    primaryVariant = accentColor,
    secondary = lightFont,
    background = darkBack

)

private val LightColorPalette = lightColors(
    primary = accentColor,
    primaryVariant = LightModeDarkBlue,
    secondary = lightFont,
    background = LightBack,
    onBackground = LightBack,

    /* Other default colors to override

    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,

    onSurface = Color.Black,
    */
)

@Composable
fun SYLTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}