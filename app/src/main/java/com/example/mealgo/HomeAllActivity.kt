package com.example.mealgo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class HomeAllActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_all)

        // Buttons for categories
        val foodButton: Button = findViewById(R.id.foodbutton)
        val drinksButton: Button = findViewById(R.id.drinksbutton)
        val searchButton: ImageButton = findViewById(R.id.searchbutton)

        // ImageButton elements (make sure they are ImageButtons, not Buttons)
        val whiteArrowNewArrival: ImageButton = findViewById(R.id.nextNewArrival)
        val whiteArrowPopular: ImageButton = findViewById(R.id.nextPopural)
        val whiteArrowExplore: ImageButton = findViewById(R.id.nextExplore)
        val allButton: Button = findViewById(R.id.allbutton)

        // Food Button Click
        foodButton.setOnClickListener {
            navigateToFood()
        }

        // Drinks Button Click
        drinksButton.setOnClickListener {
            navigateToDrinks()
        }

        // Search Button Click
        searchButton.setOnClickListener {
            navigateToSearch()
        }

        // White Arrow New Arrival Click
        whiteArrowNewArrival.setOnClickListener {
            navigateToNewArrival()
        }

        // White Arrow Popular Click
        whiteArrowPopular.setOnClickListener {
            navigateToPopular()
        }

        // White Arrow Explore Click
        whiteArrowExplore.setOnClickListener {
            navigateToExplore()
        }

        // All Button Click
        allButton.setOnClickListener {
            navigateToHomeAll()
        }
    }

    // Navigate to Food Activity
    private fun navigateToFood() {
        val intent = Intent(this, HomeFoodActivity::class.java)
        startActivity(intent)
    }

    // Navigate to Drinks Activity
    private fun navigateToDrinks() {
        val intent = Intent(this, HomeDrinksActivity::class.java)
        startActivity(intent)
    }

    // Navigate to Search Activity
    private fun navigateToSearch() {
        val intent = Intent(this, SearchActivity::class.java)
        startActivity(intent)
    }

    // Navigate to New Arrival Activity
    private fun navigateToNewArrival() {
        val intent = Intent(this, NewArrivalsActivity::class.java)
        startActivity(intent)
    }

    // Navigate to Popular Activity
    private fun navigateToPopular() {
        val intent = Intent(this, PopularActivity::class.java)
        startActivity(intent)
    }

    // Navigate to Explore Activity
    private fun navigateToExplore() {
        val intent = Intent(this, ExploreActivity::class.java)
        startActivity(intent)
    }

    // Navigate back to Home All Activity
    private fun navigateToHomeAll() {
        val intent = Intent(this, HomeAllActivity::class.java)
        startActivity(intent)
    }
}
