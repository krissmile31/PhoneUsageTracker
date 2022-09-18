package com.krissmile31.phoneusagetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.krissmile31.phoneusagetracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.fragment_container)
//        NavigationUI.setupActionBarWithNavController(this, navController)

        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    navController.navigate(R.id.action_timeline_to_home)
                    true
                }

                R.id.block -> {
                    navController.navigate(R.id.action_homeFragment_to_blockFragment)
                    true
                }

                R.id.timeline -> {
                    navController.navigate(R.id.action_blockFragment_to_timelineFragment)
                    true
                }

                else -> false
            }
        }

    }

//    override fun onSupportNavigateUp(): Boolean {
//        return NavigationUI.navigateUp(navController, null)
//    }
}