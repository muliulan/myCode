package com.muliulan.mll.offer.off

import android.util.Log

/**
描述:
zhaochenshuo
2021/3/2
 */

class Offer29 {


    /**
     * 输入一个整数n，求从1 到n这n个整数的十进制表示中1 出现的次数。

    举例说明：
    例如输入12 ，从1 到12 这些整数中包含1 的数字有1、10、11 和12，1 一共出现了5 次。
     *
     * */


    fun aa() {

        val num = 12
        var n = 1
        for (a in 2 .. num) {
            val charArray = a.toString().toCharArray()
            charArray.forEach {
                if(it=='1'){
                    n++
                }
            }

        }
        Log.e("mllzzz",n.toString())

    }

}