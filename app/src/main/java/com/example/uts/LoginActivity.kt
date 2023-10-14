package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.uts.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.edtUsername.hint = "Masukkan username"
        binding.edtPassword.hint = "Masukkan password"

        binding.btnLogin.setOnClickListener {
            val username = binding.edtUsername.text.toString()
            val password = binding.edtPassword.text.toString()

            if (checkLogin(username, password)) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(
                    this@LoginActivity,
                    "Username atau Password Salah",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun checkLogin(username: String, password: String): Boolean {
        val staticUsername = "Innaiya azkiya H"
        val staticPassword = "496809"
        return username == staticUsername && password == staticPassword
    }
}
