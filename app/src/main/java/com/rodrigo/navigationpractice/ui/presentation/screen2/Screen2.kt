package com.rodrigo.navigationpractice.ui.presentation.screen2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

private const val LOG = "Screen2"
@Composable
fun Screen2(
    toScreen1: (String) -> Unit = {},
    toScreen3: (String) -> Unit = {},
    screenFromId: String? = ""
) {
    val screenValue = "FromScreen2"

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen2")
        Spacer(modifier = Modifier.size(8.dp))
        Text(text = "Last Screen: $screenFromId")
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = {toScreen1(screenValue)}) {Text(text = "Screen1")}
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = {toScreen3(screenValue)}) {Text(text = "Screen3")}
    }
}