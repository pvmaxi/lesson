package ru.startandroid.develop.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.startandroid.develop.myapplication.databinding.ItemUserBinding

class UserAdapter(var users: List<User>) : RecyclerView.Adapter<UserAdapter.Holder>() {


    class Holder(var binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(user: User) {
            binding.name.text = user.name
            binding.age.text = user.age.toString()
            binding.from.text = user.from
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
    var name: String = "Andrey",
    var age: Int = 9,
    var from: String = "Ukraine",
)