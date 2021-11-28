package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub3.*
import kotlinx.android.synthetic.main.activity_sub3.button_hostback
import kotlinx.android.synthetic.main.activity_sub3a.*

class Sub3aActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub3a)

        button_hostbacka.setOnClickListener {
            val intent = Intent(this, Sub2aActivity::class.java)  //뒤로가기
            startActivity(intent)
        }
    }
}