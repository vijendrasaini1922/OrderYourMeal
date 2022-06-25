package com.vijay.orderyourmeal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vijay.orderyourmeal.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val list = mutableListOf<Meal>()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add(Meal(R.drawable.hamburger, "Hamburger-Fries", 100))
        list.add(Meal(R.drawable.scrumptious, "Scrumptious-Brunch-Setting", 150))
        list.add(Meal(R.drawable.pepperonipizza , "Delicious-Plate-Of-Pepperoni-Pizza", 180))
        list.add(Meal(R.drawable.cocktails , "two-red-cocktails", 140))
        list.add(Meal(R.drawable.pastapizza , "shellfish-pasta-pizza-and-italian-food", 120))

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val mealAdapter = MealAdapter(this, list)
        rv.adapter = mealAdapter
    }
}