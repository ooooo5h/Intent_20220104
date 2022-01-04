package com.neppplus.intent_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

//        이전 화면에서 보내준 문구를 찾기
        val message = intent.getStringExtra("message")

        txtMessage.text = message

    }
}