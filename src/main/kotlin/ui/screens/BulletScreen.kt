import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun BulletScreen(title: String, items: List<String>, modifier: Modifier = Modifier,) {
    ContentScreen(title, modifier) {
        items.forEach { item ->
            Text(
                text = "● $item",
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.secondary,
                modifier = Modifier.padding(vertical = 24.dp)
            )
        }
    }
}