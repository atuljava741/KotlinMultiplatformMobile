package com.kotlinnative.kmmnetworkcalls.shared

import io.ktor.client.*
import io.ktor.client.request.*

class RestCall() {
    private val client = HttpClient()
    suspend fun fetchData(): String {
        return client.get<String> {
            url("$baseUrl/posts/2")
        }
    }
    companion object {
        private const val baseUrl = "https://jsonplaceholder.typicode.com"
    }
}