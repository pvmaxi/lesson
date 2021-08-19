package ru.startandroid.develop.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.startandroid.develop.myapplication.databinding.ActivityRegBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textRegister.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        binding.textLogin.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
//        setContentView(R.layout.activity_reg)
//
//        findViewById<TextView>(R.id.text_register).setOnClickListener {
//            startActivity(Intent(this, RegisterActivity::class.java))
//        }
//
//        findViewById<TextView>(R.id.text_login).setOnClickListener {
//            startActivity(Intent(this, LoginActivity::class.java))
//        }
    }
}