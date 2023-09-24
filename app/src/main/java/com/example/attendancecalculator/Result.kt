package com.example.attendancecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val r = findViewById<TextView>(R.id.result)

        val intent1 = intent
        val res1 = intent1.getStringExtra("result")
        r.text= res1
    }
}