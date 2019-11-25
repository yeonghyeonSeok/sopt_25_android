package com.example.seminar_1

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GitRepoViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    val txtEmail: TextView = view.findViewById(R.id.txtEmail)
    val txtName: TextView = view.findViewById(R.id.txtName)
    val imgProfile: ImageView = view.findViewById(R.id.imgProfile)


    fun onBind(data: GitRepoItem) {
        txtEmail.text = data.email
        txtName.text = data.name

        itemView.setOnClickListener{
            val context = it.context
            val intent = Intent(context, GitProjectActivity::class.java)

            //선택한 팔로워 이름 전달
            intent.putExtra("follower_name", data.email)

            context.startActivity(intent)
        }

    }


}
