package com.example.mealgo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class HomeFoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_food)

        // Buttons for categories and navigation
        val drinksButton: Button = findViewById(R.id.drinksbutton)  // Button for Drinks
        val allButton: Button = findViewById(R.id.allbutton)    // Button to go to Home All
        val searchButton: ImageButton = findViewById(R.id.searchbutton)  // Search Button
        val whiteArrowNewArrival: ImageButton = findViewById(R.id.nextNewArrival)  // Next New Arrival
        val whiteArrowPopular: ImageButton = findViewById(R.id.nextPopural)  // Next Popular
        val whiteArrowExplore: ImageButton = findViewById(R.id.nextExplore)  // Next Explore
        val foodButton: Button = findViewById(R.id.foodbutton)  // Button to navigate to Food (self)

        // Click listeners for navigation
        drinksButton.setOnClickListener {
            navigateToDrinks()
        }

        allButton.setOnClickListener {
            navigateToHomeAll()
        }

        searchButton.setOnClickListener {
            navigateToSearch()
        }

        whiteArrowNewArrival.setOnClickListener {
            navigateToNewArrival()
        }

        whiteArrowPopular.setOnClickListener {
            navigateToPopular()
        }

        whiteArrowExplore.setOnClickListener {
            navigateToExplore()
        }

        foodButton.setOnClickListener {
            navigateToFood()
        }
    }

    // Navigate to Drinks Activity
    private fun navigateToDrinks() {
        val intent = Intent(this, HomeDrinksActivity::class.java)
        startActivity(intent)
    }

    // Navigate to Home All Activity
    private fun navigateToHomeAll() {
        val intent = Intent(this, HomeAllActivity::class.java)
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

    // Navigate to Food Activity (self)
    private fun navigateToFood() {
        val intent = Intent(this, HomeFoodActivity::class.java)
        startActivity(intent)
    }
}
