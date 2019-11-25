package com.example.seminar_1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WebtoonRepoAdapter(private val context: Context) : RecyclerView.Adapter<WebtoonRepoViewHolder>() {
    var data = listOf<WebtoonRepoItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WebtoonRepoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_webtoon_repository, parent, false)

        return WebtoonRepoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: WebtoonRepoViewHolder, position: Int) {
        holder.bind(data[position])
    }

}