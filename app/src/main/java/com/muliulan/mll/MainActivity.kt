package com.muliulan.mll

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.muliulan.mll.code.`121-150`.Main123


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentTimeMillis = System.currentTimeMillis()
        val codeAA = Main123().aa()
        Log.e("mll_codeAA", "$codeAA   ${System.currentTimeMillis() - currentTimeMillis}")
    }

}