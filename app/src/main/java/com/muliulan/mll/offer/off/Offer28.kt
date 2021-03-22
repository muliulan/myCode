package com.muliulan.mll.offer.off

import android.util.Log

/**
描述:
zhaochenshuo
2021/3/2
 */

class Offer28 {

    /**
     * 输入一个整型数组，数组里有正数也有负数。数组中一个或连续的多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为O(n)。

    例子说明：
    例如输入的数组为{1, -2, 3, 10, -4, 7, 2, -5}，和最大的子数组为｛3, 10, -4, 7, 2}。因此输出为该子数组的和18 。
     *
     * */

    fun aa() {
        val arr = arrayOf(-5, 6 ,10)

//        -5 6 10

        var c = Int.MIN_VALUE
        var num = 0
        for (a in 0 until arr.size) {

            if (num < 0) {
                num = arr[a]
            } else {
                num += arr[a]
            }

            c = Math.max(c, num)
        }

    Log.e("mllzz",c.toString())
    }
}