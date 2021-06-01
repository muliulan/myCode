package com.muliulan.mll.code.`61-90`

/**
描述:
zhaochenshuo
2021/5/31
 */

class Main87 {
    fun isPowerOfFour(n: Int): Boolean {

        if (n == 1) {
            return true
        }
        var a = n.toFloat()
        while (a >= 4) {
            a /= 4
        }
        return a == 1f
    }
}