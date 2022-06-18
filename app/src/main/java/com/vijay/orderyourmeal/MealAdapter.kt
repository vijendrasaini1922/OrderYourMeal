package com.vijay.orderyourmeal

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class MealAdapter(var ctx: Context, var list: MutableList<Meal>):
    RecyclerView.Adapter<MealAdapter.MealHolder>() {

    lateinit var mealHolder: MealHolder

    class MealHolder(view: View): RecyclerView.ViewHolder(view){
        var tv:TextView = view.meal_names
        var iv:ImageView = view.meal_images
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealHolder {
        val  myView = LayoutInflater.from(ctx).inflate(R.layout.item_layout, null, false)
        mealHolder = MealHolder(myView)
        return mealHolder
    }

    override fun onBindViewHolder(holder: MealHolder, position: Int) {
        mealHolder.tv.text = list[position].m_names
        mealHolder.iv.setImageResource(list[position].m_images)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}