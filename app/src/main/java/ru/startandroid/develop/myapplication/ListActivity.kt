package ru.startandroid.develop.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
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
            User("Andrey, 25", "Ukraine, Donetsk"),
            User(),
            User(),
            User(),
            User(),
            User(),
            User(),
            User(),
        )

        binding.userList.adapter = UserAdapter(users)

        val url = "https://kubnews.ru/upload/resize_cache/iblock/994/800_533_2/99475ea7123c9d8229f5674d202aa761.jpg"

        val imageAva = binding.ava

        Glide.with(this)
            .load (url)
            .circleCrop()
            .into(imageAva)
    }
}