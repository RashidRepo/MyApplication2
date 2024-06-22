package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val requestCodeIntent = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent()
            intent.action = "com.example.myapplication1.SecondActivity"
            intent.addCategory("android.intent.category.DEFAULT")

            try {
                startActivityForResult(intent, requestCodeIntent)
            } catch (e: Exception) {
                Toast.makeText(this, "Permission not granted", Toast.LENGTH_LONG).show()
            }
        }
    }
}
