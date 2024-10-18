package com.hypheno.hello

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.hypheno.hello.network.InsultCensorClient
import com.hypheno.hello.ui.CensoredText
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(client: InsultCensorClient) {
    MaterialTheme {
        CensoredText(client)
    }
}
