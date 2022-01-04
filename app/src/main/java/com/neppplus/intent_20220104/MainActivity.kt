package com.neppplus.intent_20220104

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendMessage.setOnClickListener {

//            입력한 내용 가져오기
            val inputMessage = edtMessage.text.toString()

//            view_message로 이동하기
            val myIntent = Intent(this, ViewMessageActivity::class.java)
            startActivity(myIntent)

        }



        btnMoveToOther.setOnClickListener {

//            Intent를 이용해서 다른 화면으로 이동
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }
    }
}