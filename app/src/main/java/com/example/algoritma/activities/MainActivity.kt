package com.example.algoritma.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.algoritma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pizza=binding.textView2.text
        binding.button5.setOnClickListener {
            val intent=Intent(this, MainActivity2::class.java)
            intent.putExtra("key",pizza)
            startActivity(intent)
        }

    }
}