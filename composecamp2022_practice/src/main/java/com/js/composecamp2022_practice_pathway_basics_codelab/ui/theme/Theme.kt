package com.js.composecamp2022_practice_pathway_basics_codelab.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.ViewCompat

private val DarkColorScheme = darkColorScheme(
  primary = Purple80,
  secondary = PurpleGrey80,
  tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
  primary = Purple40,
  secondary = PurpleGrey40,
  tertiary = Pink40

)

//private val LightColorPalette = lightColors(
//  primary = gray900,
//  secondary = rust600,
//  background = taupe100,
//  surface = Color.White.copy(alpha = .85f),
//  onPrimary = Color.White,
//  onSecondary = Color.White,
//  onBackground = taupe800,
//  onSurface = gray900.copy(alpha = 0.8f)
//)
//
//private val DarkColorPalette = darkColors(
//  primary = Color.White,
//  secondary = rust300,
//  background = gray900,
//  surface = Color.White.copy(alpha = 0.15f),
//  onPrimary = gray900,
//  onSecondary = gray900,
//  onBackground = taupe100,
//  onSurface = Color.White.copy(alpha = .8f)
//)


@Composable
fun TestProjectTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  // Dynamic color is available on Android 12+
  dynamicColor: Boolean = true,
  content: @Composable () -> Unit
) {
  val colorScheme = when {
    dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
      val context = LocalContext.current
      if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
    }
    darkTheme -> DarkColorScheme
    else -> LightColorScheme
  }
  val view = LocalView.current
  if (!view.isInEditMode) {
    SideEffect {
      (view.context as Activity).window.statusBarColor = colorScheme.primary.toArgb()
      ViewCompat.getWindowInsetsController(view)?.isAppearanceLightStatusBars = darkTheme
    }
  }

  MaterialTheme(
    colorScheme = colorScheme,
    typography = Typography,
    content = content
  )

//  MaterialTheme(
//    colors = colors,
//    typography = typography,
//    shapes = shapes,
//    content = content
//  )

}