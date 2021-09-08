package com.example.koindepndencyinjection.viewmodel

import androidx.lifecycle.ViewModel
import com.example.koindepndencyinjection.utils.Test1
import com.example.koindepndencyinjection.utils.Test2

class HomeViewModel(val test1: Test1, val test2: Test2) : ViewModel() {
    fun getAllTest() {
        test1.test1()
        test2.test2()
    }
}