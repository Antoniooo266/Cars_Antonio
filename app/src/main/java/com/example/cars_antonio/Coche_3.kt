package com.example.cars_antonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Coche_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coche3)

        val boton_coche3 = findViewById<Button>(R.id.button8)

        boton_coche3.setOnClickListener {

            val cambiando = Intent(this, Coche_4::class.java)

            startActivity(cambiando)

        }

        val boton_coche3_1 = findViewById<Button>(R.id.button7)

        boton_coche3_1.setOnClickListener {

            val cambiando = Intent(this, Coche_2::class.java)

            startActivity(cambiando)

        }
    }
}