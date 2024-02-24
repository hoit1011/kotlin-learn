// helloActivity.kt
package com.example.kotlin_and_db

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_and_db.databinding.ActivityHelloBinding

class HelloActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHelloBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelloBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.text = "Hello world"

        binding.button.setOnClickListener{
            binding.text.text = "click !"
        }
    }

}
