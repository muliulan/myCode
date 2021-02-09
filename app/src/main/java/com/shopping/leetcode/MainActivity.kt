package com.shopping.leetcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.shopping.leetcode.code.Main10
import com.shopping.leetcode.code.Main6
import com.shopping.leetcode.code.Main9
import com.shopping.leetcode.offer.Offer1
import com.shopping.leetcode.offer.Offer3
import com.shopping.leetcode.offer.Offer6

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentTimeMillis = System.currentTimeMillis()

        val codeAA = Main10().cc()
        Log.e("mll_codeAA","$codeAA   ${System.currentTimeMillis()-currentTimeMillis}")

//        val offerAA = Offer6().aa()
//        Log.e("mll_offerAA", "$offerAA   ${System.currentTimeMillis() - currentTimeMillis}")
    }
}