package com.muliulan.mll.offer.off

/**
描述:
zhaochenshuo
2021/2/23
 */

class Offer8 {

    /**
     * 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数。例如把9表示成二进制1001，有2位1。因此如果输入9，该函数输出2。
     * */


    fun aa(): Int {
        var a = 78
        var num = 0
        while (a > 0) {
            val i = a % 2
            if (i == 1) {
                num++
            }
            a /= 2
        }
        return num
    }

}