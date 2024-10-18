package com.hypheno.hello.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

private const val COUNTER = "counter"

@Composable
fun ClickCounter(
    prefs: DataStore<Preferences>,
    modifier: Modifier = Modifier
) {
    val counter by prefs
        .data
        .map {
            val counterKey = intPreferencesKey(COUNTER)
            it[counterKey] ?: 0
        }
        .collectAsState(0)
    val scope = rememberCoroutineScope()
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = counter.toString(),
            textAlign = TextAlign.Center,
            fontSize = 50.sp
        )
        Button(onClick = {
            scope.launch {
                prefs.edit { dataStore ->
                    val counterKey = intPreferencesKey(COUNTER)
                    dataStore[counterKey] = counter + 1
                }
            }
        }) {
            Text("Increment!")
        }
    }
}
