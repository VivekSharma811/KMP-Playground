package com.hypheno.hello

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform