package ru.startandroid.develop.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import ru.startandroid.develop.myapplication.databinding.ActivityInterestsBinding

class InterestsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInterestsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInterestsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fzLogo.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
//        setContentView(R.layout.activity_interests)
//
//        findViewById<ImageView>(R.id.fz_logo).setOnClickListener{
//            startActivity(Intent(this, RegisterActivity::class.java))
//        }
    }
}