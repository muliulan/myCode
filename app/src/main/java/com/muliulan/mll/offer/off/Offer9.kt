package com.muliulan.mll.offer.off

import android.util.Log

/**
描述:
zhaochenshuo
2021/2/23
 */

class Offer9 {


    /**
     * 输入数字n，按顺序打印出从1到n位最大十进数的数值。比如输入3，则打印出1、2、3一直到最大三位数即999。
     *
     * */

    fun aa() {

        var n = 2

        var num = 1
        while (num.toString().length <= n) {
            Log.e("mll", num.toString())
            num++
        }


    }
}