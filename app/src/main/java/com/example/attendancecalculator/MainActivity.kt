package com.example.attendancecalculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.attendancecalculator.Result

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<com.google.android.material.chip.Chip>(R.id.chip)
        val tc = findViewById<EditText>(R.id.tc)
        val ac = findViewById<EditText>(R.id.ac)
        val p = findViewById<EditText>(R.id.p)

        button.setOnClickListener {
            val intent = Intent(this,Result::class.java)

            val tcv = tc.text.toString().toFloat()
            val acv = ac.text.toString().toFloat()
            val pv = p.text.toString().toFloat()
            val rc = ((tcv * pv) - (acv * 100))/(100 - pv)

            intent.putExtra("result",rc.toString())
            startActivity(intent)
        }
    }
}