package com.muliulan.mll.code.`91-120`

import android.os.Build
import androidx.annotation.RequiresApi

/**
name: zhaochenshuo
Date: 2021/7/7
 **/

class Main106 {

    // 1 3 5 7 9
    // 1 3 5 7 9


    @RequiresApi(Build.VERSION_CODES.N)
    fun aa(): Int {
        val deliciousness: IntArray = intArrayOf(1, 3, 5, 7, 9)
//        var num = 0
//        for (a in 0 until deliciousness.size) {
//            for (b in 0 until deliciousness.size) {
//                val i = deliciousness[a] + deliciousness[b]
//                if (a != b && (i and (i - 1)) == 0) {
//                    num++
//                }
//            }
//        }


        val Mod = 1000000007
        var max = 0
        deliciousness.forEach {
            max = Math.max(max, it)
        }
        max *= 2
        val hashMap = HashMap<Int, Int>()
        var pairs = 0
        for (a in 0 until deliciousness.size) {
            val i = deliciousness[a]

            var b = 1
            while (b <= max) {
                val orDefault = hashMap.getOrDefault(b - i, 0)
                pairs = (pairs + orDefault) % Mod
                b = b shl 1
            }
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1)
        }
        return pairs
    }

}