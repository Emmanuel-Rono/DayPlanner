package com.example.dayplanner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : AppCompatActivity() {
    private lateinit var navController:NavController//get the Navcontroller
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView2)
        as NavHostFragment
        navController=navHostFragment.navController
        //bottom navigation
        val bottom_navigation=findViewById<BottomNavigationItemView>(R.id.bottom_navigation)
        setupWithNavController(bottom_navigation,navController)

    }


}