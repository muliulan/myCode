package com.muliulan.mll

import android.content.Intent
import android.os.Bundle
import android.util.Log
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
        text1.text = "bbbbbbbbbbbbb"


        text1.setOnClickListener {
            startActivity(Intent(this, Bbbb::class.java))
        }

        val apply = Intent().apply {
            putExtra("aaa", "bbbbbbb")
        }

        setResult(1, apply)
        Log.e("mll","onCreate")
    }
    override fun onRestart() {
        super.onRestart()
        Log.e("mll","onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("mll","onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.e("mll","onStart")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.e("mll","onNewIntent")
    }

    override fun onPause() {
        super.onPause()
        Log.e("mll","onPause")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("mll","onDestroy")

    }

}