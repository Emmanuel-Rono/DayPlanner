package com.example.dayplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Learning_Button=findViewById<Button>(R.id.Learning_Button)
        val skillup_Button=findViewById<Button>(R.id.skillup_Button)
    }
}