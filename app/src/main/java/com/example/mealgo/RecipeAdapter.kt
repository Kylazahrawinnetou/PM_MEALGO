package com.example.mealgo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Recipe(
    val title: String,
    val description: String,
    val tags: List<String>,
    val imageResId: Int
)

class RecipeAdapter(private val recipes: List<Recipe>) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    inner class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recipeImage: ImageView = itemView.findViewById(R.id.recipe_image)
        val recipeTitle: TextView = itemView.findViewById(R.id.recipe_title)
        val recipeDescription: TextView = itemView.findViewById(R.id.recipe_description)
        val recipeTags: TextView = itemView.findViewById(R.id.recipe_tags)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_recipe_adapter, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.recipeImage.setImageResource(recipe.imageResId) // Gambar
        holder.recipeTitle.text = recipe.title                // Judul
        holder.recipeDescription.text = recipe.description    // Deskripsi
        holder.recipeTags.text = recipe.tags.joinToString(", ") // Tag
    }

    override fun getItemCount(): Int = recipes.size
}
