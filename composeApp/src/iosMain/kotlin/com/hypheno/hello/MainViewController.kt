package com.hypheno.hello

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.hypheno.hello.di.initKoin
import com.hypheno.hello.local.createDataStore
import com.hypheno.hello.network.InsultCensorClient
import com.hypheno.hello.network.createHttpClient
import io.ktor.client.engine.darwin.Darwin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App(
        prefs = remember { createDataStore() }
    )
}