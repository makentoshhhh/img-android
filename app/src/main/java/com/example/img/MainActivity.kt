package com.example.img

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.img.R
import com.example.img.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        got()
    }
    fun got() {
        binding.button.setOnClickListener {
            binding.imageView.setImageDrawable(getDrawable(R.drawable.tablet))
            got1()
        }
    }
    fun got1(){
        binding.button.setOnClickListener {
            binding.imageView.setImageDrawable(getDrawable(R.drawable.notes))
            got2()
        }

    }
    fun got2(){
        binding.button.setOnClickListener {
            binding.imageView.setImageDrawable(getDrawable(R.drawable.computer))
            got()
        }
    }
}