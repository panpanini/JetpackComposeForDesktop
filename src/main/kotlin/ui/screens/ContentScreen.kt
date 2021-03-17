import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ContentScreen(title: String, modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Slide(modifier) {
        Column(modifier = Modifier.fillMaxSize().padding(top = 64.dp, start = 64.dp)) {
            Text(
                text = title,
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.secondary,
                modifier = Modifier.padding(bottom = 64.dp)
            )
            content()
        }

    }
}