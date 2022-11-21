package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val np1 = findViewById<NumberPicker>(R.id.np1)
        val np2 = findViewById<NumberPicker>(R.id.np2)
        val np3 = findViewById<NumberPicker>(R.id.np3)
        val np4 = findViewById<NumberPicker>(R.id.np4)
        val btSetNum = findViewById<Button>(R.id.btSetNum)
        val btUnlock= findViewById<Button>(R.id.btUnlock)

        np1.minValue = 0
        np1.maxValue = 9
        np2.minValue = 0
        np2.maxValue = 9
        np3.minValue = 0
        np3.maxValue = 9
        np4.minValue = 0
        np4.maxValue = 9

        btSetNum.setOnClickListener {
            val nums = "${np1.value}${np2.value}${np3.value}${np4.value}"
            Toast.makeText(this, nums, Toast.LENGTH_LONG).show()
        }
    }
}