package com.example.nubank.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nubank.Adapter.ButtomNavigationAdapter
import com.example.nubank.Adapter.MainCardAdapter
import com.example.nubank.Model.ButtomNavigation
import com.example.nubank.Model.Card
import com.example.nubank.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewMain = cardMainRecycler;
        recyclerViewMain.adapter = MainCardAdapter(cards(), this)

        paginator.attachTo(recyclerViewMain)

        val layoutManagerMain = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewMain.layoutManager = layoutManagerMain
        paginator.attachTo(recyclerViewMain)

        val recyclerViewButton = buttomNavegationRecycler;
        recyclerViewButton.adapter = ButtomNavigationAdapter(buttons(), this)
        val layoutManagerButton = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewButton.layoutManager = layoutManagerButton
    }

    private fun cards(): List<Card> {
        return listOf(
            Card("3850,55"),
            Card("2850,59")
        )
    }

    private fun buttons(): List<ButtomNavigation> {
        return listOf(
            ButtomNavigation(R.drawable.ic_phone_iphone_24dp,"Recarrega de celular"),
            ButtomNavigation(R.drawable.ic_lock_open_24px,"Bloquear cartão"),
            ButtomNavigation(R.drawable.ic_group_add_24px,"Indicar amigos"),
            ButtomNavigation(R.drawable.ic_phone_iphone_24dp,"Recarregar de celular"),
            ButtomNavigation(R.drawable.ic_phone_iphone_24dp,"Recarregar de celular"),
            ButtomNavigation(R.drawable.ic_phone_iphone_24dp,"Recarregar de celular"),
            ButtomNavigation(R.drawable.ic_phone_iphone_24dp,"Recarregar de celular"),
            ButtomNavigation(R.drawable.ic_phone_iphone_24dp,"Recarregar de celular"),
            ButtomNavigation(R.drawable.ic_phone_iphone_24dp,"Recarregar de celular")
        )
    }
}
