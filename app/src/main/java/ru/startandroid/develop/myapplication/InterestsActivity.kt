package ru.startandroid.develop.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class InterestsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interests)

        findViewById<ImageView>(R.id.fz_logo).setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}