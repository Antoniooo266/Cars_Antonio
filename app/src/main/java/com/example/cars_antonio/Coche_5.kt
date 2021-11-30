package com.example.cars_antonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Coche_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coche5)

        val boton_coche5 = findViewById<Button>(R.id.button10)

        boton_coche5.setOnClickListener {

            val cambiando = Intent(this, Coche_1::class.java)

            startActivity(cambiando)

        }

        val boton_coche5_1 = findViewById<Button>(R.id.button9)

        boton_coche5_1.setOnClickListener {

            val cambiando = Intent(this, Coche_4::class.java)

            startActivity(cambiando)

        }
    }
}