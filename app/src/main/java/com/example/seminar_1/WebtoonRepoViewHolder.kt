package com.example.seminar_1

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WebtoonRepoViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val txtTitle: TextView = view.findViewById(R.id.txtItemTitle)
    val txtName: TextView = view.findViewById(R.id.txtName)

    fun bind(data: WebtoonRepoItem) {
        txtTitle.text = data.title
        txtName.text = data.name
    }
}
