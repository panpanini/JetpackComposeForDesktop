import androidx.compose.runtime.Composable
import androidx.compose.ui.res.imageResource

sealed class PresentationSlide {
    @Composable
    abstract operator fun invoke()
}

data class TitleSlide(val title: String, val subtitle: String? = null) : PresentationSlide() {

    @Composable
    override operator fun invoke() {
        TitleScreen(title, subtitle)
    }
}

data class ImageSlide(val title: String, val imageResource: String) : PresentationSlide() {
    @Composable
    override operator fun invoke() {
        ImageScreen(title, imageResource(imageResource))
    }
}

data class BulletSlide(val title: String, val items: List<String>) : PresentationSlide() {
    @Composable
    override operator fun invoke() {
        BulletScreen(title, items)
    }
}