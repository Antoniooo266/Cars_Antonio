package com.example.cars_antonio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Podium : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podium)
        var winnertext = findViewById<TextView>(R.id.WinnerText)
        var winnerImage = findViewById<ImageView>(R.id.Winner)


        winnertext.text = "Congrats the Winner is" + winner + "."

        winnerImage.setImageResource(winnerImg)

    }
}