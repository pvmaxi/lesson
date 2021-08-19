package ru.startandroid.develop.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import ru.startandroid.develop.myapplication.databinding.ActivityCreateAccBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreateAccBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener{
            startActivity(Intent(this, WelcomeActivity::class.java))
        }

        binding.moveToInterests.setOnClickListener{
            startActivity(Intent(this, InterestsActivity::class.java))
        }

//        setContentView(R.layout.activity_create_acc)
//
//        findViewById<ImageView>(R.id.button_back).setOnClickListener {
//            startActivity(Intent(this, WelcomeActivity::class.java))
//        }
//
//        findViewById<TextView>(R.id.move_to_interests).setOnClickListener {
//            startActivity(Intent(this, InterestsActivity::class.java))
//        }
    }
}