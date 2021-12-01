package com.example.cars_antonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Menu_Cars : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_cars)

        val boton_coche = findViewById<ImageButton>(R.id.imageButton2)

        boton_coche.setOnClickListener {

            val cambiando = Intent(this, SetCar::class.java)

            startActivity(cambiando)

        }
    }
}