package com.hypheno.hello

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.hypheno.hello.di.initKoin
import com.hypheno.hello.local.DATA_STORE_FILE_NAME
import com.hypheno.hello.local.createDataStore
import com.hypheno.hello.network.InsultCensorClient
import com.hypheno.hello.network.createHttpClient
import io.ktor.client.engine.okhttp.OkHttp

fun main() {
    val prefs = createDataStore { DATA_STORE_FILE_NAME }
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "ComposeMPHelloWorld",
        ) {
            App(
                prefs = remember { prefs }
            )
        }
    }
}