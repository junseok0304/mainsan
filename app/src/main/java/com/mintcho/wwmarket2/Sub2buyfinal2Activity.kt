package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub2buyfinal.*
import kotlinx.android.synthetic.main.activity_sub2buyfinal2.*

class Sub2buyfinal2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2buyfinal2)

        button_buyfinal2a.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)  // 구매완료 페이지 등장
            startActivity(intent)
        }
    }
}