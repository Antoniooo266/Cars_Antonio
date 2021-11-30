package com.example.cars_antonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Coche_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coche2)

        val boton_coche2 = findViewById<Button>(R.id.button5)

        boton_coche2.setOnClickListener {

            val cambiando = Intent(this, Coche_3::class.java)

            startActivity(cambiando)

        }
    }
}