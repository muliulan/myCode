package com.shopping.leetcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.shopping.leetcode.code.Main10
import com.shopping.leetcode.code.Main11
import com.shopping.leetcode.code.Main6
import com.shopping.leetcode.code.Main9
import com.shopping.leetcode.offer.Offer1
import com.shopping.leetcode.offer.Offer3
import com.shopping.leetcode.offer.Offer6

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val currentTimeMillis = System.currentTimeMillis()
//
//        val codeAA = Main11().aa()
//        Log.e("mll_codeAA","$codeAA   ${System.currentTimeMillis()-currentTimeMillis}")

//        val offerAA = Offer6().aa()
//        Log.e("mll_offerAA", "$offerAA   ${System.currentTimeMillis() - currentTimeMillis}")

        val arrayList = ArrayList<String>()
        val arrayList1:ArrayList<String> ?= null
        val arrayList2 = ArrayList<String>()

        if (arrayList.size == 0 && arrayList1?.size == 0 && arrayList2.size == 0) {
            Log.e("mll_offerAA","1111111111111111111")
        }else{
            Log.e("mll_offerAA","22222111")

        }

    }
}