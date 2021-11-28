package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub2.*
import kotlinx.android.synthetic.main.activity_sub3.*

class SubActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub3)

        button_hostback.setOnClickListener {
            val intent = Intent(this, SubActivity2::class.java)  //뒤로가기
            startActivity(intent)
        }
    }
}