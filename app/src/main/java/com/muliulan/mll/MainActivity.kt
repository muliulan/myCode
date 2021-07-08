package com.muliulan.mll

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.muliulan.mll.code.`91-120`.Main106
import com.muliulan.mll.code.`91-120`.Main107


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentTimeMillis = System.currentTimeMillis()
        val codeAA = Main107().aa()
        Log.e("mll_codeAA", "$codeAA   ${System.currentTimeMillis() - currentTimeMillis}")
    }

}