package com.example.cars_antonio

import kotlin.random.Random

class Car (val name:String, val img:Int, var speed: Int, var maxSpeed:Int, val accelerate:Int, val stability:Int, var Distance: Int){

    fun accelerate(){

        if(speed >= maxSpeed){
            speed = maxSpeed
        }else {
            speed += accelerate
        }

    }

    fun move(){

        Distance += speed

    }

    fun overturn(){
        var random = Random.nextInt(0, 11)
        if (random == stability){
            Distance = 0
            speed = 0
        }

    }

    fun boost() {

        var random = Random.nextInt(0, 11)
        if (random == 5) {
            speed += 10
        }

    }
}