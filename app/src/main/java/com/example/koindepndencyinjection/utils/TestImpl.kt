package com.example.koindepndencyinjection.utils

import android.util.Log

class TestImpl:Test1,Test2 {
    override fun test1() {
        Log.d("123","Here is test1")
    }

    override fun test2() {
        Log.d("123","Here is test2")

    }
}