package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mealgo.HomeAllActivity
import com.example.mealgo.R
import com.example.mealgo.RegisterActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Hubungkan elemen UI dari XML
        val loginEmail: EditText = findViewById(R.id.loginEmail)
        val loginPassword: EditText = findViewById(R.id.loginPassword)
        val loginButton: Button = findViewById(R.id.loginButton)
        val registerNowButton: Button = findViewById(R.id.registernowButton)

        // Tombol Login ke halaman Home
        loginButton.setOnClickListener {
            val email = loginEmail.text.toString().trim()
            val password = loginPassword.text.toString().trim()

            // Validasi input
            if (email.isEmpty()) {
                loginEmail.error = "Email tidak boleh kosong"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                loginPassword.error = "Password tidak boleh kosong"
                return@setOnClickListener
            }

            // Jika validasi berhasil, pindah ke halaman Home
            // (Anda bisa menambahkan autentikasi Firebase di sini)
            if (email == "test@example.com" && password == "password123") {
                val intent = Intent(this, HomeAllActivity::class.java)
                startActivity(intent)
                finish() // Tutup LoginActivity
            } else {
                Toast.makeText(this, "Email atau Password salah!", Toast.LENGTH_SHORT).show()
            }
        }

        // Tombol ke halaman Register
        registerNowButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
