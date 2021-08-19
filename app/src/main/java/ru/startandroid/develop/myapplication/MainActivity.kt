package ru.startandroid.develop.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import ru.startandroid.develop.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            startActivity(Intent(this, WelcomeActivity::class.java))
        }, 2000)
//        setContentView(R.layout.activity_main)
//
//        Handler().postDelayed({
//            startActivity(Intent(this, WelcomeActivity::class.java))
//        }, 2000)
    }
}