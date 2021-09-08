package com.muliulan.mll

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
name: zhaochenshuo
Date: 2021/8/24
 **/
class Bbbb : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.text = intent.getStringExtra("aaa")


        text1.setOnClickListener {
            startActivity(Intent(this, Ccccc::class.java))
        }


        val apply = Intent().apply {
            putExtra("aaa", "bbbbbbb")
        }
        setResult(1, apply)

    }


}