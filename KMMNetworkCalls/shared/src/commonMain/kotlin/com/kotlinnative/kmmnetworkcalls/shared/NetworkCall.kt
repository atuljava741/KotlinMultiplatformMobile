package com.kotlinnative.kmmnetworkcalls.shared


class NetworkCall {
    suspend fun getData(): String {
        var data = RestCall().fetchData()
        return "Data from Api : ${data}!"
    }
}
