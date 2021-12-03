package com.example.cars_antonio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Menu_Pilot : AppCompatActivity() {
    lateinit var texto : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_pilot)
        texto = findViewById(R.id.view_Pilot)

        texto.text = "Hola , $setPilot"
    }
}