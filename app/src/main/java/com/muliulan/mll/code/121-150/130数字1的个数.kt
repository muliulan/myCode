package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/8/13
 **/
class Main130 {

    fun countDigitOne(n: Int): Int {
        var num = 0
        for (a in n downTo 0) {
            val toString = a.toString()
            if (toString.indexOf('1') != -1) {
                toString.forEach {
                    if (it == '1') {
                        num++
                    }
                }
            }
        }
        return num
    }


}