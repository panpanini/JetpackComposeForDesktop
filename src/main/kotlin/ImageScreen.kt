import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp


@Composable
fun ImageScreen(title: String, image: ImageBitmap, contentDescription: String = "", modifier: Modifier = Modifier,) {
    ContentScreen(title, modifier) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth().padding(top = 100.dp)) {
            Image(
                bitmap = image,
                contentDescription = contentDescription
            )
        }
    }
}