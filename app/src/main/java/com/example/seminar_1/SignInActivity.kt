package com.example.seminar_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {

    private var edtSignInId: EditText? = null
    private var edtSignInPw: EditText? = null
    private var btnSignInSignUp: Button? = null
    private var btnSignInSignIn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        Log.d("with sopt", "sign in activity is created")

        makeController()
    }

    private fun makeController() {
        edtSignInId = findViewById(R.id.edtSignInId)
        edtSignInPw = findViewById(R.id.edtSignInPw)
        btnSignInSignUp = findViewById(R.id.btnSignInSignUp)
        btnSignInSignIn = findViewById(R.id.btnSignInSignIn)

        btnSignInSignUp?.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    val intent = Intent(this@SignInActivity, SignUpActivity::class.java)

                    startActivity(intent)
                }
            }
        )

        btnSignInSignIn?.setOnClickListener {
            val id = edtSignInId?.text.toString()
            val pw = edtSignInPw?.text.toString()

            if (id.isEmpty() || pw.isEmpty()) {
                Toast.makeText(this, "아이디나 비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val response = requestLogin(id, pw)
            if (response) {
                Toast.makeText(this, "로그인에 성공했습니다.", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            } else {
                Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
                edtSignInId?.requestFocus()
            }
        }
    }

    private fun requestLogin(id: String, pw: String): Boolean {
        return true
    }
}
