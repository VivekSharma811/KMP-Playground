package com.hypheno.hello

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.hypheno.hello.di.initKoin
import com.hypheno.hello.network.InsultCensorClient
import com.hypheno.hello.network.createHttpClient
import io.ktor.client.engine.okhttp.OkHttp

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "ComposeMPHelloWorld",
        ) {
            App(
                client = remember {
                    InsultCensorClient(createHttpClient(OkHttp.create()))
                }
            )
        }
    }
}