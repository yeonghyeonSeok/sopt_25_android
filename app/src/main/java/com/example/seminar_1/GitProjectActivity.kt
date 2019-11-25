package com.example.seminar_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GitProjectActivity : AppCompatActivity() {

    private lateinit var rvGitProject: RecyclerView
    private lateinit var gitProjectAdapter: GitProjectAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git_project)

        rvGitProject = findViewById(R.id.rvGitProject)

        gitProjectAdapter = GitProjectAdapter(this)

        rvGitProject.adapter = gitProjectAdapter

        rvGitProject.layoutManager = LinearLayoutManager(this)

            gitProjectAdapter.data = listOf(
                GitProjectItem(
                    title =  "SoptStagram",
                    desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                    language = "Kotlin",
                    languageColor = 0,
                    date = "2019/1/16"
                ),
            GitProjectItem(
                title =  "SoptStagram",
                desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                language = "Kotlin",
                languageColor = 0,
                date = "2019/1/16"
            ),
            GitProjectItem(
                title =  "SoptStagram",
                desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                language = "Kotlin",
                languageColor = 0,
                date = "2019/1/16"
            ),
            GitProjectItem(
                title =  "SoptStagram",
                desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                language = "Kotlin",
                languageColor = 0,
                date = "2019/1/16"
            ),
            GitProjectItem(
                title =  "SoptStagram",
                desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                language = "Kotlin",
                languageColor = 0,
                date = "2019/1/16"
            ),
            GitProjectItem(
                title =  "SoptStagram",
                desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                language = "Kotlin",
                languageColor = 0,
                date = "2019/1/16"
            )
        )

        gitProjectAdapter.notifyDataSetChanged()
    }
}
