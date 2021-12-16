package com.example.cars_antonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import kotlin.properties.Delegates

lateinit var winner: String
var winnerImg by Delegates.notNull<Int>()

class Race_Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_race_start)

        var Cars = RoadCars
        var Eche = findViewById<SeekBar>(R.id.Echenike)
        var Rayo = findViewById<SeekBar>(R.id.Rayo)
        var Fran = findViewById<SeekBar>(R.id.Franchesco)
        var Autismus = findViewById<SeekBar>(R.id.Autismus)
        var LGTB = findViewById<SeekBar>(R.id.LGTB)



        var continuar = true

        Thread(Runnable {
            while (continuar == true){
                Cars.forEach{

                    print(it.name + "\n")
                    it.accelerate()
                    it.move()
                    it.overturn()
                    it.boost()
                    println(it.Distance)

                    Eche.progress = echeCar.Distance
                    Rayo.progress = rayoCar.Distance
                    Fran.progress = franCar.Distance
                    Autismus.progress = autiCar.Distance
                    LGTB.progress = lgtbCar.Distance
                    Thread.sleep(100)


                    if (it.Distance >= 500){

                        winner = it.name

                        winnerImg = it.img

                        val cambiando = Intent(this, Podium::class.java)

                        startActivity(cambiando)


                    }
                }
            }


        }).start()

    }
}