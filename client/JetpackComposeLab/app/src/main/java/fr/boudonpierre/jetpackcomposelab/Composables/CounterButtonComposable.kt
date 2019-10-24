package fr.boudonpierre.jetpackcomposelab.Composables

import androidx.compose.Composable
import androidx.ui.material.Button
import fr.boudonpierre.jetpackcomposelab.Models.CounterState

@Composable
fun Counter(state: CounterState) {
    Button(
        text = "I've been clicked ${state.count} times",
        onClick = {
            state.count++
        }
    )
}