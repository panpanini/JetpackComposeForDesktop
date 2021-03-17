package ui.screens

import Slide
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp

@Composable
fun PaniniBulletScreen(title: String, items: List<String>, modifier: Modifier = Modifier,) {
    Slide(modifier) {
        Column(modifier = Modifier.fillMaxSize().padding(top = 64.dp, start = 64.dp)) {
            Text(
                text = title,
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.secondary,
                modifier = Modifier.padding(bottom = 64.dp)
            )
            items.forEach { item ->
                Text(
                    text = "● $item",
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.secondary,
                    modifier = Modifier.padding(vertical = 24.dp)
                )
            }
        }
        Box(contentAlignment = Alignment.TopEnd, modifier = modifier.fillMaxSize()) {
            Image(
                bitmap = imageResource("panini_face.png"),
                contentDescription = "panini",
                modifier = Modifier.padding(top = 200.dp, end = 100.dp)
                    .size(250.dp, 250.dp),
            )
        }
    }
}