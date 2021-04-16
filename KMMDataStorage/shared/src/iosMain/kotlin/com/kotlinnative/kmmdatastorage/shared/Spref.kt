package com.kotlinnative.kmmdatastorage.shared

import platform.Foundation.NSUserDefaults
import platform.darwin.NSObject

actual typealias SPref = NSObject

actual fun SPref.getInt(key: String) : Int {
    return NSUserDefaults.standardUserDefaults.integerForKey(key).toInt()
}

actual fun SPref.setInt(key: String, value : Int){
    NSUserDefaults.standardUserDefaults.setInteger(value.toLong(),key)
}
