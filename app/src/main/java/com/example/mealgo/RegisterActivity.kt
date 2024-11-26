package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mealgo.R
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Inisialisasi Firebase Authentication
        firebaseAuth = FirebaseAuth.getInstance()

        // Hubungkan elemen UI dari XML
        val registerEmail: EditText = findViewById(R.id.registerEmail)
        val registerPassword: EditText = findViewById(R.id.registerPassword)
        val registerConfirm: EditText = findViewById(R.id.registerConfirm)
        val registerButton: Button = findViewById(R.id.loginButton)

        // Tombol Register
        registerButton.setOnClickListener {
            val email = registerEmail.text.toString().trim()
            val password = registerPassword.text.toString().trim()
            val confirmPassword = registerConfirm.text.toString().trim()

            // Validasi Input
            if (email.isEmpty()) {
                registerEmail.error = "Email tidak boleh kosong"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                registerPassword.error = "Password tidak boleh kosong"
                return@setOnClickListener
            }

            if (confirmPassword.isEmpty()) {
                registerConfirm.error = "Konfirmasi Password tidak boleh kosong"
                return@setOnClickListener
            }

            if (password != confirmPassword) {
                registerConfirm.error = "Password tidak cocok"
                return@setOnClickListener
            }

            if (password.length < 6) {
                registerPassword.error = "Password harus minimal 6 karakter"
                return@setOnClickListener
            }

            // Proses Registrasi dengan Firebase Authentication
            firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show()
                        // Setelah registrasi berhasil, kembali ke halaman login
                        startActivity(Intent(this, LoginActivity::class.java))
                        finish()
                    } else {
                        Toast.makeText(
                            this,
                            "Registrasi Gagal: ${task.exception?.message}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
        }
    }
}
