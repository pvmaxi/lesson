package ru.startandroid.develop.myapplication

import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import ru.startandroid.develop.myapplication.databinding.ItemUserBinding

class UserAdapter(var users: List<User>) : RecyclerView.Adapter<UserAdapter.Holder>() {


    class Holder(var binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(user: User) {
            binding.title.text = user.title.toString()
            binding.from.text = user.from
            binding.lastCheck.text = user.last.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
       holder.bind(users[position])
    }

    override fun getItemCount(): Int {
        return users.size
    }

}

class User(
    var title: Any = "Max, 24",
    var from: String = "Ukraine, Avdeevka",
    var last: Any = "Был(а) 2 минуты назад",
)