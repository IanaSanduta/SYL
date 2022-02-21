package com.example.syl.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(

    primary = darkBlue,
    primaryVariant = accentColor,
    secondary = lightFont,
    background = darkBack,
    onBackground = LightBack,



)

private val LightColorPalette = lightColors(

    primary = accentColor,
    primaryVariant = LightModeDarkBlue,
    secondary = lightFont,
    background = LightBack,


    /* Other default colors to override

    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,

    onSurface = Color.Black,
    */


)

@Composable
fun SYLTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    MaterialTheme(
        colors =if (darkTheme)
            DarkColorPalette
         else
            LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}