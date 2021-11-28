package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub2_nego.*
import kotlinx.android.synthetic.main.activity_sub2buy.*

class Sub2buyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2buy)

        button_buyfinal.setOnClickListener {
            val intent = Intent(this, Sub2buyfinalActivity::class.java)  // 구매완료 페이지 등장
            startActivity(intent)
        }
    }
}