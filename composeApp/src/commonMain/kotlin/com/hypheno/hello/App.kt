package com.hypheno.hello

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.hypheno.hello.ui.CensoredText
import com.hypheno.hello.ui.ClickCounter
import com.hypheno.hello.ui.PermissionsHandler
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(
    prefs: DataStore<Preferences>
) {
    MaterialTheme {
        PermissionsHandler()
    }
}
