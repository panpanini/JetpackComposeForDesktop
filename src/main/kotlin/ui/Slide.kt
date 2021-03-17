import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp


@Composable
fun Slide(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Surface(modifier = modifier.fillMaxSize()) {
        Box(contentAlignment = Alignment.Center, modifier = modifier.fillMaxSize()) {
            content()
        }

        Box(contentAlignment = Alignment.BottomStart, modifier = modifier.fillMaxSize()) {
            Image(
                bitmap = imageResource("mercari.png"),
                contentDescription = "logo",
                modifier = Modifier.padding(16.dp)
                    .size(250.dp, 55.dp),
            )
        }
    }
}