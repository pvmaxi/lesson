package ru.startandroid.develop.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import ru.startandroid.develop.myapplication.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListBinding

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var users = listOf<User>(
            User(),
            User(),
            User(),
            User(),
            User(),
            User(),
            User(),
            User(),
            User(),
            User(),

        )

        binding.userList.adapter = UserAdapter(users)

        Glide.with(this)
            .load("https://st2.depositphotos.com/1064024/10769/i/600/depositphotos_107694484-stock-photo-little-boy.jpg")
            .circleCrop()
            .placeholder(R.drawable.button)
            .error(R.drawable.button)

    }
}