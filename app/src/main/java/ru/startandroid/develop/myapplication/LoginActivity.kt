package ru.startandroid.develop.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_and_reg)

        findViewById<ImageView>(R.id.imageView3).setOnClickListener{
            startActivity(Intent(this, WelcomeActivity::class.java))
        }
    }
}