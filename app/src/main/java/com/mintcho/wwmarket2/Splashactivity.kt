package com.mintcho.wwmarket2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splashactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashactivity)
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({

        }, 3000);


    }
}