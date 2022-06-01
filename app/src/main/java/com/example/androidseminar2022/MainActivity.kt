package com.example.androidseminar2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chucNang01()
    }

    private fun chucNang01(){
        Log.e("xxx","Nguyen van phuc dang di choi quoc te thieu nhi vao 16h00 ngay 1/6")
    }
}