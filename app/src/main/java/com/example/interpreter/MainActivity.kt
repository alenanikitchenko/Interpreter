package com.example.interpreter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstInt = findViewById<EditText>(R.id.editTextText)
        val secondInt = findViewById<EditText>(R.id.editTextText2)

        val button = findViewById<Button>(R.id.myFirstButton)
        button.setOnClickListener {

            val text = firstInt.text
            val text2 = secondInt.text

            val int1 = text.toString().toInt()
            val int2 = text2.toString().toInt()

            val sum = int1 + int2

            Toast.makeText(this, sum.toString(), Toast.LENGTH_SHORT).show()
        }

    }
}