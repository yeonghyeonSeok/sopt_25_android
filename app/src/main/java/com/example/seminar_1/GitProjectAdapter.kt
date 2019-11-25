package com.example.seminar_1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class GitProjectAdapter(private val context: Context) : RecyclerView.Adapter<GitProjectViewHolder>() {
    var data = listOf<GitProjectItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitProjectViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_item_repository, parent, false)

        return GitProjectViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: GitProjectViewHolder, position: Int) {
        holder.bind(data[position])
    }
}