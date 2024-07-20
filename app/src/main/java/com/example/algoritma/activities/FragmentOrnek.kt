package com.example.algoritma.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.algoritma.R
import com.example.algoritma.databinding.ActivityFragmentOrnekBinding

class FragmentOrnek : AppCompatActivity() {

    private lateinit var binding: ActivityFragmentOrnekBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFragmentOrnekBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navigationId=supportFragmentManager.findFragmentById(R.id.navigationId) as NavHostFragment
        NavigationUI.setupWithNavController(binding.bottomNavMenu,navigationId.navController)
    }
}