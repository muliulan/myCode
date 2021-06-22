package com.muliulan.mll.code.`91-120`

import java.util.*

class Main98 {

    fun readBinaryWatch(turnedOn: Int): List<String> {
        val arrayListOf1 = arrayListOf(8, 4, 2, 1)
        val arrayListOf2 = arrayListOf(32, 16, 8, 4, 2, 1)


        val arrayList = ArrayList<String>()
        for (a in 0 until 12) {
            for (b in 0 until 60) {
                if (Integer.bitCount(a) + Integer.bitCount(b) == turnedOn) {

                    val s = "$a:${if (b > 10) b else "0$b"}"
                    arrayList.add(s)
                }
            }
        }
        return arrayList
    }

}