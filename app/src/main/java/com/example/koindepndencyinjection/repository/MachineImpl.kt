package com.example.koindepndencyinjection.repository

import android.util.Log

class MachineImpl : Machine {
    override fun getMachine() {
        Log.d("123", "Here is the Machine")
    }
}