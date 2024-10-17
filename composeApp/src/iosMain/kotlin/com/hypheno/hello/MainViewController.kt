package com.hypheno.hello

import androidx.compose.ui.window.ComposeUIViewController
import com.hypheno.hello.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App(batteryManager = BatteryManager())
}