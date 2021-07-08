package com.muliulan.mll.code.`91-120`

import java.util.*

/**
name: zhaochenshuo
Date: 2021/7/2
 **/
class Main104 {

    fun aa(): Int {
        val costs: IntArray = intArrayOf(1, 6, 3, 1, 2, 5)
        val coins: Int = 20

        Arrays.sort(costs)
        var num = 0
        var m = 0
        costs.forEach {
            if (m + it <= coins) {
                num++
                m += it
            } else {
                return num
            }
        }
        return num
    }

}