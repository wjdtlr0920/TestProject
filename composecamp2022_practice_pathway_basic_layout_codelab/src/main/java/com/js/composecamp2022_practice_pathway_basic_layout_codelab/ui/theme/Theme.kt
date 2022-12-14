package com.js.composecamp2022_practice_pathway_basic_layout_codelab.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = lightColorScheme(
  primary = gray900,
  secondary = rust600,
  background = taupe100,
  surface = Color.White.copy(alpha = .85f),
  onPrimary = Color.White,
  onSecondary = Color.White,
  onBackground = taupe800,
  onSurface = gray900.copy(alpha = 0.8f)
)

private val DarkColorPalette = darkColorScheme(
  primary = Color.White,
  secondary = rust300,
  background = gray900,
  surface = Color.White.copy(alpha = 0.15f),
  onPrimary = gray900,
  onSecondary = gray900,
  onBackground = taupe100,
  onSurface = Color.White.copy(alpha = .8f)
)

@Composable
fun TestProjectTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
  val colors = if (darkTheme) {
    DarkColorPalette
  } else {
    LightColorPalette
  }

  MaterialTheme(
    colorScheme = colors,
    typography = typography,
    shapes = shapes,
    content = content
  )
}
