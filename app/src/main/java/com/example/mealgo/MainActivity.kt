package com.example.mealgo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Data untuk resep
        val recipes = listOf(
            Recipe(
                title = "Zucchini Noodles Avocado Pesto",
                description = "Fresh and creamy avocado noodles.",
                tags = listOf("Gluten-Free", "Low-Carb", "Keto"),
                imageResId = R.drawable.recipe_image
            ),
            Recipe(
                title = "Healthy Smoothie",
                description = "A refreshing and healthy smoothie.",
                tags = listOf("Vegan", "Gluten-Free"),
                imageResId = R.drawable.recipe_image
            ),
            Recipe(
                title = "Grilled Chicken",
                description = "Juicy and tender grilled chicken.",
                tags = listOf("Low-Carb", "Keto"),
                imageResId = R.drawable.recipe_image

            )
        )

        // RecyclerView untuk "New Arrivals"
        val newArrivalsRecyclerView = findViewById<RecyclerView>(R.id.new_arrivals_recycler_view)
        newArrivalsRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        newArrivalsRecyclerView.adapter = RecipeAdapter(recipes)

        // RecyclerView untuk "Popular"
        val popularRecyclerView = findViewById<RecyclerView>(R.id.popular_recycler_view)
        popularRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        popularRecyclerView.adapter = RecipeAdapter(recipes)

        // RecyclerView untuk "Explore"
        val exploreRecyclerView = findViewById<RecyclerView>(R.id.explore_recycler_view)
        exploreRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        exploreRecyclerView.adapter = RecipeAdapter(recipes)
    }
}

