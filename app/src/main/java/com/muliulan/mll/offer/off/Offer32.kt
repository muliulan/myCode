package com.muliulan.mll.offer.off

import android.util.Log

/**
描述:
zhaochenshuo
2021/3/3
 */

class Offer32 {

    /**
    在字符串中找出第一个只出现一次的字符。
     *
     * */


    fun aa() {
        val ss = "addzczcd"
        val toCharArray = ss.toCharArray()
        val intArray = IntArray(26)

        for (a in 0 until toCharArray.size) {
            val i = toCharArray[a] - 'a'
            intArray[i]= intArray[i]+1
        }


        for (b in 0 until intArray.size) {
            if (intArray[b] == 1) {

                val c = b + 97
                val toChar = c.toChar()
                Log.e("mllzz", toChar.toString())
                return
            }

        }


    }


}