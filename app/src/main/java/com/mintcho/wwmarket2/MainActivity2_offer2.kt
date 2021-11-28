package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_activity2_offer2.*
import kotlinx.android.synthetic.main.activity_main_realworld.*

class MainActivity2_offer2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2_offer2)

        imageButton_offer1.setOnClickListener {
            val intent = Intent(this, MainActivity2_offera::class.java)  //버튼 누르면 넘어갈 페이지를 Subactivity 위치에 알맞게 변경할것
            startActivity(intent)
        }
    }
}