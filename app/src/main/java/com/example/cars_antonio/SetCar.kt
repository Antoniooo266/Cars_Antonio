package com.example.cars_antonio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class SetCar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)

        val arrayCar = mutableListOf<Car>()
        var carImg = findViewById<ImageView>(R.id.carImg)
        var name = findViewById<TextView>(R.id.nameCar)
        var car_next = findViewById<ImageButton>(R.id.arrow_next)
        var car_previous = findViewById<ImageButton>(R.id.arrow_before)

        fun mostrarcoche(car: Car) {

            carImg.setImageResource(car.img)
            name.text = car.nombre

        }

        var posicion = 0
        val echeCar = Car("Echenike 5000 GT", R.drawable.coche_1)
        val rayoCar = Car("Rayo ValleNavaja", R.drawable.coche_2)
        val franCar = Car("Franchesco Virginidad", R.drawable.coche_3)
        val autiCar = Car("Autismus Prime Sport", R.drawable.coche_4)
        val lgtbCar = Car("SuperDeportivo LGTB+", R.drawable.coche_5)
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

    }
}