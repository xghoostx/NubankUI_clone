package com.example.nubank.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nubank.Model.Card
import com.example.nubank.R
import kotlinx.android.synthetic.main.card_main.view.*

class MainCardAdapter(private val cards: List<Card>, private val context: Context) : RecyclerView.Adapter<MainCardAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val amaunt = itemView.cardMain.textAmout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_main, parent, false )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val card = cards[position]
        holder?.amaunt.text = "R$ " + card.amount
    }
}
