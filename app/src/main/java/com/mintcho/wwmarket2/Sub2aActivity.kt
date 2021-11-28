package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub2.*
import kotlinx.android.synthetic.main.activity_sub2a.*

class Sub2aActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2a)

        button5_negoa.setOnClickListener {
            val intent = Intent(this, Sub2NegoActivity::class.java)  //네고하기
            startActivity(intent)
        }
        button6_buya.setOnClickListener {
            val intent = Intent(this, Sub2buyActivity::class.java)  //구매하기
            startActivity(intent)
        }
        button7_hista.setOnClickListener {
            val intent = Intent(this, SubActivity3::class.java)  //거래기록 보기
            startActivity(intent)
        }

        imageButton8_backa.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)  //뒤로가기
            startActivity(intent)
        }
    }
}