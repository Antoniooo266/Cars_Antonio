package com.example.cars_antonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

var setPilot : String = ""

class SetPilot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var nombre_pitot : EditText
        lateinit var button_pilot : Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_pilot)
        nombre_pitot = findViewById(R.id.setPilot)
        button_pilot = findViewById(R.id.SelectP)

        button_pilot.setOnClickListener(){
            setPilot = nombre_pitot.text.toString()
            if (setPilot != "Name" && setPilot.isNotEmpty() ){

                val enviar = Intent (this, Menu_Pilot::class.java)
                startActivity(enviar)

            }else{

                Toast.makeText(this, "Puta", Toast.LENGTH_SHORT).show()

            }

        }

    }

}