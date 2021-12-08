package com.example.cars_antonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ready = findViewById<Button>(R.id.button2)

        ready.setOnClickListener {

            val cambiando = Intent(this, Menu_Cars::class.java)

            startActivity(cambiando)

        }
    }
}