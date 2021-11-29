package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_realoffer4.*

class realoffer4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_realoffer4)

        realofferbtn4.setOnClickListener {
        val intent = Intent(this, offer5::class.java)  //버튼 누르면 넘어갈 페이지를 Subactivity 위치에 알맞게 변경할것
        startActivity(intent)
    }
}
}