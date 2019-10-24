package fr.boudonpierre.jetpackcomposelab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview
import fr.boudonpierre.jetpackcomposelab.Composables.Greeting
import fr.boudonpierre.jetpackcomposelab.Composables.MyScreenContent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MyScreenContent()
            }
        }
    }
}

@Composable
fun MyApp(child: @Composable() () -> Unit) {
    CustomTheme {
        child()
    }
}

@Preview
@Composable
fun preview() {
    MyApp{
        MyScreenContent()
    }
}