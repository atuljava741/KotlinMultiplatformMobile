package com.kotlinnative.kmmdatastorage.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.kotlinnative.kmmdatastorage.shared.KMMStorage

class MainActivity : AppCompatActivity() {

    lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.text_view)
        loadFromSP(tv)
    }

    fun loadFromSP(view : View) {
        var kmmStorage = KMMStorage(this)
        var count  = kmmStorage.getInt("count")
        count++
        tv.text = "Current Count is "+count
        kmmStorage.putInt("count", count)
    }

}
