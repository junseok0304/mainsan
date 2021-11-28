package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub2buy.*
import kotlinx.android.synthetic.main.activity_sub2buyfinal.*

class Sub2buy2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2buy2)

        button_buyfinal2.setOnClickListener {
            val intent = Intent(this, Sub2buyfinal2Activity::class.java)  // 구매완료 페이지 등장
            startActivity(intent)
        }
    }
}