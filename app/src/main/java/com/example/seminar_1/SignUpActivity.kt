package com.example.seminar_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        makeController()
    }

    fun makeController() {
        btnSignUpSignUp.setOnClickListener {
            val name = edtSignUpName.text.toString()
            val id = edtSignUpId.text.toString()
            val pw = edtSignUpPw.text.toString()
            val pwCheck = edtSignUpPwCheck.text.toString()

            if(name.isEmpty() || id.isEmpty() || pw.isEmpty() || pwCheck.isEmpty()) {
                Toast.makeText(this, "내용을 채워주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(pw != pwCheck) {
                Toast.makeText(this, "비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val response = requestSignUp(name, id, pw)

            if(response) {
                Toast.makeText(this, "회원가입에 성공했습니다.", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            } else {
                Toast.makeText(this, "회원가입에 실패했습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun requestSignUp(name: String, id: String, pw:String): Boolean {
        return true
    }
}
