package com.example.dayplanner

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
//To make splash fullScreen
        if(Build.VERSION.SDK_INT >= Build.VERSION.R)
        {
            window.insetsController.hide(WindowInsets.Type.statusBars())
            else
            {
                @Suppress{"DEPRECIATION"}
                window.setFlags(
                    windowManager.LayoutParams.FLAG_FULLSCREEN
                )
            }
        }
    }
}