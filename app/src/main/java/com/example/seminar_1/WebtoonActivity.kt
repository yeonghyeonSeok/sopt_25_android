package com.example.seminar_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WebtoonActivity : AppCompatActivity() {

    private lateinit var rvWebtoon: RecyclerView
    private lateinit var WebtoonRepoAdapter: WebtoonRepoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webtoon)

        initGitRepoList()

    }

    private fun initGitRepoList() {
        rvWebtoon = findViewById(R.id.rvWebtoon)

        WebtoonRepoAdapter = WebtoonRepoAdapter(this)

        rvWebtoon.adapter = WebtoonRepoAdapter

        rvWebtoon.layoutManager = GridLayoutManager(this, 3)

        WebtoonRepoAdapter.data = listOf(
            WebtoonRepoItem(
                title = "웹툰제목",
                name = "웹툰작가"
            ),
            WebtoonRepoItem(
                title = "웹툰제목",
                name = "웹툰작가"
            ),
            WebtoonRepoItem(
                title = "웹툰제목",
                name = "웹툰작가"
            ),
            WebtoonRepoItem(
                title = "웹툰제목",
                name = "웹툰작가"
            ),
            WebtoonRepoItem(
                title = "웹툰제목",
                name = "웹툰작가"
            ),
            WebtoonRepoItem(
                title = "웹툰제목",
                name = "웹툰작가"
            ),
            WebtoonRepoItem(
                title = "웹툰제목",
                name = "웹툰작가"
            ),
            WebtoonRepoItem(
                title = "웹툰제목",
                name = "웹툰작가"
            ),
            WebtoonRepoItem(
                title = "웹툰제목",
                name = "웹툰작가"
            )
        )
    }
}
