package ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors

val colors = lightColors(
    primary = primaryBlue,
    primaryVariant = primaryVariant,
    secondary = secondary
)

@Composable
fun PresentationTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = colors,
        content = content,
        typography = typography
    )
}