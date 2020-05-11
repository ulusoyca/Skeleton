package com.ulusoy.skeletonapp.main

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.ulusoy.skeletonapp.R
import com.ulusoy.skeletonapp.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        (supportFragmentManager.findFragmentById(R.id.demo_nav_host_fragment) as? NavHostFragment)?.let {
            NavigationUI.setupWithNavController(binding.bottomNav, it.navController)
        }
    }
}
