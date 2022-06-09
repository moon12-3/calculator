package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultBtn = findViewById<Button>(R.id.result_btn)
        val firstNumber = findViewById<TextView>(R.id.first_number)
        val secondNumber = findViewById<TextView>(R.id.second_number)
        val operatorText = findViewById<TextView>(R.id.operator_text)

        resultBtn.setOnClickListener {

            var first = firstNumber.text.toString().toInt()
            var second = secondNumber.text.toString().toInt()


            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("first", first)
            intent.putExtra("second", second)
            intent.putExtra("operator", operatorText.text.toString())
            startActivity(intent)
        }
    }
}