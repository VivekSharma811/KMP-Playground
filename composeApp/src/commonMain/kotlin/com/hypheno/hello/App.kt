package com.hypheno.hello

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.hypheno.hello.ui.CitiesTime
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        CitiesTime()
    }
}
