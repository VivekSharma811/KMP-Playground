package com.hypheno.hello.network

import kotlinx.serialization.Serializable

@Serializable
data class CensoredText(
    val result: String
)
