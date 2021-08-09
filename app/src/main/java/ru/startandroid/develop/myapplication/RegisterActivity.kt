package ru.startandroid.develop.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_acc)

        findViewById<ImageView>(R.id.button_back).setOnClickListener {
            startActivity(Intent(this, WelcomeActivity::class.java))
        }

        findViewById<TextView>(R.id.move_to_interests).setOnClickListener {
            startActivity(Intent(this, InterestsActivity::class.java))
        }
    }
}