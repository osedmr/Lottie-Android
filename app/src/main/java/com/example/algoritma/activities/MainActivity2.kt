package com.example.algoritma.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.algoritma.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val pizza= intent.getStringExtra("key")
        binding.textView6.text=pizza

        binding.button.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}