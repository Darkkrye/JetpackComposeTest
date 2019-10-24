package fr.boudonpierre.jetpackcomposelab.Composables

import androidx.compose.Composable
import androidx.ui.core.dp
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.ExpandedHeight
import androidx.ui.material.Divider
import fr.boudonpierre.jetpackcomposelab.Models.CounterState
import fr.boudonpierre.jetpackcomposelab.States.AppState

@Composable
fun MyScreenContent(appState: AppState = AppState()) {
    Column(modifier = ExpandedHeight, crossAxisAlignment = CrossAxisAlignment.Center) {
        Column(modifier = Flexible(1f), crossAxisAlignment = CrossAxisAlignment.Center) {
            Greeting(name = "World")
            Divider(color = Color.Black)
            Greeting(name = "there")
        }

        Counter(state = appState.counterState)
    }

}