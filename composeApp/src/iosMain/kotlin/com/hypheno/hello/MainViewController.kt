package com.hypheno.hello

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController { App(batteryManager = BatteryManager()) }