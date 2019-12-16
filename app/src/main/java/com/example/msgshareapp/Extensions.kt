package com.example.msgshareapp

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String, duration :Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

fun normalFunction(a: Int = 2){
    println(a)
}