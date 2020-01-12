package com.example.nubank.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.example.nubank.Model.ButtomNavigation
import com.example.nubank.R
import kotlinx.android.synthetic.main.buttom_navegation.view.*

class ButtomNavigationAdapter(private val buttons: List<ButtomNavigation>, private val context: Context): Adapter<ButtomNavigationAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageIcon = itemView.imageIcon
        val textTitle = itemView.textTitle
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.buttom_navegation, parent, false )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return buttons.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val button = buttons[position]
        holder?.textTitle.text = button.title
        holder?.imageIcon.setImageResource(button.icon);
    }
}