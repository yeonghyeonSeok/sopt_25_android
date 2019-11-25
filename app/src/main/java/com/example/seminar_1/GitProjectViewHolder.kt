package com.example.seminar_1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GitProjectViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val txtItemTitle: TextView = view.findViewById(R.id.txtItemTitle)
    val txtItemDesc: TextView = view.findViewById(R.id.txtItemDesc)
    val txtItemDate: TextView = view.findViewById(R.id.txtItemDate)
    val txtItemLang: TextView = view.findViewById(R.id.txtItemLang)
    val imgLanguage: ImageView = view.findViewById(R.id.imgLanguage)

    fun bind(data: GitProjectItem) {
        txtItemTitle.text = data.title
        txtItemDesc.text = data.desc
        txtItemLang.text = data.language
        txtItemDate.text = data.date
    }
}