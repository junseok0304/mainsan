package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        imageButton3.setOnClickListener {
            val intent = Intent(this, SubActivity2::class.java)  //버튼 누르면 넘어갈 페이지를 Subactivity 위치에 알맞게 변경할것
            startActivity(intent)
        }
        imageButton4.setOnClickListener {
            val intent = Intent(this, Sub2aActivity::class.java)  //버튼 누르면 넘어갈 페이지를 Subactivity 위치에 알맞게 변경할것
            startActivity(intent)
        }
        imageButton5.setOnClickListener {
            val intent = Intent(this, SubActivity2::class.java)  //버튼 누르면 넘어갈 페이지를 Subactivity 위치에 알맞게 변경할것
            startActivity(intent)
        }
        imageButton7.setOnClickListener {
            val intent = Intent(this, Sub2aActivity::class.java)  //버튼 누르면 넘어갈 페이지를 Subactivity 위치에 알맞게 변경할것
            startActivity(intent)
        }
    }
}