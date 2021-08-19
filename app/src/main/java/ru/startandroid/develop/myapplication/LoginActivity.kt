package ru.startandroid.develop.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import ru.startandroid.develop.myapplication.databinding.ActivityLogAndRegBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLogAndRegBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogAndRegBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView3.setOnClickListener {
            startActivity(Intent(this, WelcomeActivity::class.java))
        }
//        setContentView(R.layout.activity_log_and_reg)
//
//        findViewById<ImageView>(R.id.imageView3).setOnClickListener{
//            startActivity(Intent(this, WelcomeActivity::class.java))
//        }
    }
}