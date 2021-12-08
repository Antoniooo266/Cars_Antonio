package com.example.cars_antonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Menu_Pilot : AppCompatActivity() {
    lateinit var texto : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_pilot)
        texto = findViewById(R.id.view_Pilot)

        texto.text = "Hola , $setPilot"

        val button_r = findViewById<Button>(R.id.button_race)

        button_r.setOnClickListener {

            val cambiando = Intent(this, Race_Start::class.java)

            startActivity(cambiando)

        }
    }
}