package com.itdam.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform