package com.cmota.playground.triathlon.shared

internal actual class PlatformLogger {

    actual fun debug(tag: String, message: String) {
        print("$tag | $message")
    }

    actual fun warn(tag: String, message: String) {
        print("$tag | $message")
    }

    actual fun error(tag: String, message: String) {
        print("$tag | $message")
    }
}