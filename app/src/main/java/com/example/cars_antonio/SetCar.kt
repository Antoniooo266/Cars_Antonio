package com.example.cars_antonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

val arrayCar = mutableListOf<Car>()
var posicion = 0
val echeCar = Car("Echenike 5000 GT", R.drawable.coche_1, 0, 120, 20, 1, 0)
val rayoCar = Car("Rayo ValleNavaja", R.drawable.coche_2, 0, 100, 15, 6, 0)
val franCar = Car("Franchesco Virginidad", R.drawable.coche_3, 0, 140, 25, 2, 0)
val autiCar = Car("Autismus Prime Sport", R.drawable.coche_4, 0, 90, 15, 8, 0)
val lgtbCar = Car("SuperDeportivo LGTB+", R.drawable.coche_5, 0, 69, 22, 5, 0)
val RoadCars = arrayCar

class SetCar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)

        var carImg = findViewById<ImageView>(R.id.carImg)
        var name = findViewById<TextView>(R.id.nameCar)
        var car_next = findViewById<ImageButton>(R.id.arrow_next)
        var car_previous = findViewById<ImageButton>(R.id.arrow_before)
        val setCar = findViewById<Button>(R.id.setCar)

        fun mostrarcoche(car: Car) {

            carImg.setImageResource(car.img)
            name.text = car.name

        }

        arrayCar.add(echeCar)
        arrayCar.add(rayoCar)
        arrayCar.add(franCar)
        arrayCar.add(autiCar)
        arrayCar.add(lgtbCar)

        mostrarcoche(arrayCar[posicion])

        car_next.setOnClickListener {

            posicion++
            if (posicion < arrayCar.size) {
                mostrarcoche(arrayCar[posicion])
            } else {
                posicion = 0
                mostrarcoche(arrayCar[posicion])
            }

        }
        car_previous.setOnClickListener {

            posicion--
            if (posicion < 0) {
                posicion = arrayCar.size - 1
                mostrarcoche(arrayCar[posicion])
            } else {
                mostrarcoche(arrayCar[posicion])
            }
        }

        setCar.setOnClickListener {

            val cambiando = Intent(this, SetPilot::class.java)

            startActivity(cambiando)

        }

    }
}