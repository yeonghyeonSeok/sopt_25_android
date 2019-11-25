package com.example.seminar_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_follower_repository.*

class GithubActivity : AppCompatActivity() {

    private var imgMainProfile: ImageView? = null

    private lateinit var rvMainGitRepo: RecyclerView
    private lateinit var gitRepoAdapter: GitRepoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)

        initGitRepoList()
        makeController()

    }

    private fun initGitRepoList() {
        rvMainGitRepo = findViewById(R.id.rvMainGitRepo)

        gitRepoAdapter = GitRepoAdapter(this)

        rvMainGitRepo.adapter = gitRepoAdapter

        rvMainGitRepo.layoutManager = LinearLayoutManager(this)

        gitRepoAdapter.data = listOf(
            GitRepoItem(
                email = "syh4834",
                name = "yeonghyeon"
            ),
            GitRepoItem(
                email = "syh4834",
                name = "yeonghyeon"
            ),
            GitRepoItem(
                email = "syh4834",
                name = "yeonghyeon"
            ),
            GitRepoItem(
                email = "syh4834",
                name = "yeonghyeon"
            ),
            GitRepoItem(
                email = "syh4834",
                name = "yeonghyeon"
            )
        )
    }

    private fun makeController() {

        imgMainProfile = findViewById(R.id.imgMainProfile)

        imgMainProfile?.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    val intent = Intent(this@GithubActivity, WebtoonActivity::class.java)

                    startActivity(intent)
                }
            }
        )

        //아이디 클릭하면 화면 다른 액티비티로 넘어가게 만드는 방법
    }
}
