package com.example.cars_antonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Coche_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coche4)

        val boton_coche4 = findViewById<Button>(R.id.button8)

        boton_coche4.setOnClickListener {

            val cambiando = Intent(this, Coche_5::class.java)

            startActivity(cambiando)

        }

        val boton_coche4_1 = findViewById<Button>(R.id.button7)

        boton_coche4_1.setOnClickListener {

            val cambiando = Intent(this, Coche_3::class.java)

            startActivity(cambiando)

        }
    }
}