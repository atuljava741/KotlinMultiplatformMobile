package com.kotlinnative.kmmdatastorage.shared;

expect class SPref

expect fun SPref.getInt(key: String) : Int
expect fun SPref.setInt(key: String, value: Int)