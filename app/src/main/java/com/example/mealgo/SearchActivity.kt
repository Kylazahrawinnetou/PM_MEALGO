package com.example.mealgo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        // Mendapatkan referensi tombol
        val glutenFreeButton: Button = findViewById(R.id.GlutenFreebutton)
        val veganButton: Button = findViewById(R.id.VeganButton)
        val ketoButton: Button = findViewById(R.id.KetoButton)
        val paleoButton: Button = findViewById(R.id.PaleoButton)
        val lowCarbButton: Button = findViewById(R.id.LowCarbButton)
        val medDietButton: Button = findViewById(R.id.MedDietButton)
        val ifButton: Button = findViewById(R.id.IFButton)
        val whole30Button: Button = findViewById(R.id.Whole30Button)

        // Menambahkan listeners untuk setiap tombol
        glutenFreeButton.setOnClickListener {
            val intent = Intent(this, GlutenFreeActivity::class.java)
            startActivity(intent)
        }

        veganButton.setOnClickListener {
            val intent = Intent(this, VeganActivity::class.java)
            startActivity(intent)
        }

        ketoButton.setOnClickListener {
            val intent = Intent(this, KetoActivity::class.java)
            startActivity(intent)
        }

        paleoButton.setOnClickListener {
            val intent = Intent(this, PaleoActivity::class.java)
            startActivity(intent)
        }

        lowCarbButton.setOnClickListener {
            val intent = Intent(this, LowCarbActivity::class.java)
            startActivity(intent)
        }

        medDietButton.setOnClickListener {
            val intent = Intent(this, MediterraneanActivity::class.java)
            startActivity(intent)
        }

        ifButton.setOnClickListener {
            val intent = Intent(this, InterminttentActivity::class.java)
            startActivity(intent)
        }

        whole30Button.setOnClickListener {
            val intent = Intent(this, Whole30Activity::class.java)
            startActivity(intent)
        }
    }
}
