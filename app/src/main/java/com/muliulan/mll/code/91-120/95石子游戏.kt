package com.muliulan.mll.code.`91-120`

import java.util.*

class Main95 {

    fun stoneGame(piles: IntArray): Boolean {
        val arrayList = ArrayList<Int>()
        piles.forEach {
            arrayList.add(it)
        }
        var a = 0
        var b = 0
        var t = true
        while (arrayList.size > 0) {
            val sss = Math.max(arrayList[0], arrayList[arrayList.size - 1])
            if (t) {
                a += sss
            } else {
                b += sss
            }
            arrayList.remove(sss)
            t = !t
        }
        return a > b
    }

}