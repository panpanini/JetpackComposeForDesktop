import androidx.compose.desktop.Window
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.IntSize
import ui.theme.PresentationTheme

fun main() = Window("Jetpack Compose", IntSize(1920, 1080)) {

    PresentationTheme {
        TitleScreen("Jetpack Compose (for Desktop)", "Kotlin愛好会 Vol. 28") }
}