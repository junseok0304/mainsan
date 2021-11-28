package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub2_nego.*
import kotlinx.android.synthetic.main.activity_sub2_nego.imageButton_sendnego
import kotlinx.android.synthetic.main.activity_sub2_negoa.*

class Sub2NegoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2_negoa)

        imageButton_sendnegoa.setOnClickListener {
            val intent = Intent(this, Sub2NegofinalaActivity::class.java)  //네고 완료 페이지 등장
            startActivity(intent)
        }
    }

}