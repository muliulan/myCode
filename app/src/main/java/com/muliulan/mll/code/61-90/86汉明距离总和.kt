package com.muliulan.mll.code.`61-90`

import android.util.Log

/**
描述:
zhaochenshuo
2021/5/28
 */

class Main86 {


    fun aa(): Int {
        val nums: IntArray = intArrayOf(4, 14, 2)

        for (a in 0 until nums.size) {
            val ai = nums[a]
            for (b in a until nums.size) {
                val bi = nums[b]
                if (a != b) {
//                    dd(ai xor bi)

                    num += Integer.bitCount(ai xor bi)
                }
            }
        }
        return num
    }

    var num = 0
    fun dd(i: Int) {
        val toString = cc(i)
        toString.forEach {
            if (it == '1') {
                num++
            }
        }
    }

    fun cc(x: Int): String {
        if (x == 0) {
            return "0"
        }
        var mx = x
        var s = ""
        while (mx > 1) {

            val i = mx % 2
            s += i
            mx /= 2
        }
        return s + "1"
    }

}