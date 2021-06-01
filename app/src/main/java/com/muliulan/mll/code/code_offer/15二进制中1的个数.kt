package com.muliulan.mll.code.code_offer

/**
描述:
zhaochenshuo
2021/5/25
 */

class off15 {

    fun hammingWeight(n: Int): Int {
        val chars = n.toString().toCharArray()
        var a = 0
        for (aChar in chars) {
            if (aChar == '1') {
                a++
            }
        }

        return a
    }

}