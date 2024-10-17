package com.hypheno.hello

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.hypheno.hello.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "ComposeMPHelloWorld",
        ) {
            App(batteryManager = BatteryManager())
        }
    }
}