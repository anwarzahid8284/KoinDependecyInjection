package com.example.koindepndencyinjection.utils

import android.util.Log

class Car(private val engine: Engine, private val wheel: Wheel) {
    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
        Log.d("123", "Car is Running")
    }
}