package com.kotlinnative.kmmdatastorage.shared

class KMMStorage(val context: SPref) {

    fun getInt(key: String): Int {
        return context.getInt(key)
    }

    fun putInt(key: String, value: Int) {
        context.setInt(key,value)
    }
}

