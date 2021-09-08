package com.example.koindepndencyinjection.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.koindepndencyinjection.R
import com.example.koindepndencyinjection.components.InjectionComponent

class MainActivity : AppCompatActivity() {
    val injectionComponent = InjectionComponent()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectionComponent.car.getCar()
        injectionComponent.machineAccess.machineAccess()
        injectionComponent.homeViewModel.getAllTest()
    }
}