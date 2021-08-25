package ru.startandroid.develop.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import com.bumptech.glide.Glide
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

        binding.textView2.setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java))
        }


    }
}