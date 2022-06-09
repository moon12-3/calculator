package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultNumber = findViewById<TextView>(R.id.resultNumber)
        val resultWay = findViewById<TextView>(R.id.result_way)
        val first = intent.getIntExtra("first", 0)
        val second = intent.getIntExtra("second", 0)
        val operator = intent.getStringExtra("operator")

        resultWay.text = "$first $operator $second = "
        
        val result = when(operator){
            "+" -> first+second
            "-" -> first-second
            "*" -> first*second
            "/" -> first/second
            else -> null
        }
        resultNumber.text = result.toString()
    }
}