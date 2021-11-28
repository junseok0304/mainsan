package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub2buy.*
import kotlinx.android.synthetic.main.activity_sub2buyfinal.*

class Sub2buyfinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2buyfinal)

        button_buyfinal2.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)  // 구매완료 페이지 등장
            startActivity(intent)
        }
    }
}