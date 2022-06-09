package com.example.dayplanner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController:NavController//get the Navcontroller
        override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            //set navController
            //step1 access navHostfragment
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView2)
                    as NavHostFragment
            val bottomNavigation=findViewById<BottomNavigationView>(R.id.bottom_navigation)
            bottomNavigation.setupWithNavController()
            //set navhost as mavcontroller
            //associating navHostFragment with navcontroller
            //access BottomNavigation

        }
    }

private fun BottomNavigationView.setupWithNavController() {

}
