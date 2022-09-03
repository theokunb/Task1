package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private val TAG:String = "MainActivity"


    private lateinit var name: String
    private lateinit var surname: String
    private var age: Int = 0
    private var height: Double = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"start oncreate func")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        Log.d(TAG,"end of oncreate func")
    }

    private fun init(){
        var textView:TextView = findViewById(R.id.output)
        name = "Ivan"
        surname = "Ivanov"
        age = 37
        height = 172.2
        textView.text = "name: ${name} surname: ${surname} age: ${age} height: ${height}"

    }

}