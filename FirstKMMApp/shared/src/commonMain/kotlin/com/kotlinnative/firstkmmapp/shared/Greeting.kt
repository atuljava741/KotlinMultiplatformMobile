package com.kotlinnative.firstkmmapp.shared
class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
