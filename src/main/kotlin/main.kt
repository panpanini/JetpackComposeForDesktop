import androidx.compose.desktop.Window
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.IntSize
import ui.theme.PresentationTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.input.pointer.pointerInput

fun main() = Window("Jetpack Compose@Kotlin愛好会", IntSize(1920, 1080)) {
    MainScreen(slides)
}

@Composable
fun MainScreen(slides: List<PresentationSlide>) {
    val currentSlide = remember { mutableStateOf(0) }
    PresentationTheme {
        Box(modifier = Modifier
            .fillMaxSize()
            .pointerInput(Unit) {
                detectTapGestures(
                    onDoubleTap = {
                        val nextValue = (currentSlide.value - 1).let {
                            if (it >= 0) it else (slides.size - 1)
                        }
                        currentSlide.value = nextValue
                    },
                    onTap = { currentSlide.value = (currentSlide.value + 1) % slides.size }
                )
            }
        ) {
            slides[currentSlide.value]()
        }
    }
}


val slides: List<PresentationSlide> = listOf(
    TitleSlide("(Jetpack) Compose", "Kotlin愛好会 Vol. 28"),
    BulletSlide("About Me",
        listOf(
            "Matthew Vern / Panini",
            "Twitter: @panini_ja Github: panpanini",
            "Mercari, Inc",
            "Android Engineer (US product)",
            "Kotlin愛好会運営メンバー"
        )
    ),
    BulletSlide("Summary",
        listOf(
            "Jetpack Compose: Now in Beta!",
            "Compose for Desktop: Now in Alpha!",
            "Compose uses much of the same technology as Jetpack Compose, means easy to learn",
            "Create UIs for Desktop & Android apps simply and quickly"
        )
    ),
    TitleSlide("What is Jetpack Compose?"),
    BulletSlide("What is Jetpack Compose?",
        listOf(
            "https://developer.android.com/jetpack/compose",
            "> Jetpack Compose is Android’s modern toolkit for building native UI",
            "Recently became Beta, so APIs are finalized",
            "Quick, declarative way to define Android UIs",
            "Conceptually similar to SwiftUI and React"
        )
    ),
    ImageSlide("Jetpack Compose Example", "hello_aikoukai.png"),
    ImageSlide("Jetpack Compose Example", "hello_aikoukai_1.png"),
    ImageSlide("Jetpack Compose Example", "hello_aikoukai_2.png"),
    ImageSlide("Jetpack Compose Example", "hello_aikoukai_3.png"),
    ImageSlide("What is Jetpack Compose?", "what_is_jetpack_compose.png"),
    TitleSlide("What is Compose for Desktop?"),
    BulletSlide(
        "What is Compose for Desktop?",
        listOf(
            "https://www.jetbrains.com/lp/compose/",
            "> Compose for Desktop simplifies and accelerates UI development for desktop applications",
            "> allows extensive UI code sharing between Android and desktop applications.",
            "Recently became Alpha, but built upon Jetpack Compose, so APIs should be stable",
            "Conceptually similar to SwiftUI, React, and Jetpack Compose 😇"
        )
    ),
    ImageSlide("What is Compose for Desktop?", "what_is_compose_for_desktop.png"),
    ImageSlide("What is Compose for Desktop?", "what_is_compose_for_desktop_imports.png"),
    ImageSlide("What is Compose for Desktop?", "replace_androidx.png"),
    BulletSlide(
        "Differences between Compose for Desktop & Jetpack Compose",
        listOf(
            "No @Preview annotation in Compose for Desktop yet",
            "https://github.com/JetBrains/compose-jb/issues/136",
            "Window & AppWindow vs Activity",
            "No LiveData support on Desktop",
            "No Android Architecture Component support (ViewModel, etc)"
        )
    ),
    TitleSlide("Demo"),
    BulletSlide(
        "Summary",
        listOf(
            "Android: https://developer.android.com/jetpack/compose",
            "Desktop: https://www.jetbrains.com/lp/compose/",
        )
    ),
    TitleSlide("Have a nice Kotlin!", "Kotlin愛好会 Vol. 28")
)