package com.example.cars_antonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Coche_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coche1)

        val boton_coche1 = findViewById<Button>(R.id.button2)

        boton_coche1.setOnClickListener {

            val cambiando = Intent(this, Coche_2::class.java)

            startActivity(cambiando)

        }

        val boton_coche1_1 = findViewById<Button>(R.id.button1)

        boton_coche1_1.setOnClickListener {

            val cambiando = Intent(this, Coche_5::class.java)

            startActivity(cambiando)

        }
    }
}