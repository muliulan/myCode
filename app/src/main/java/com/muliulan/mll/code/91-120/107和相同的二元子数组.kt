package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/8
 **/


class Main107 {

    fun aa(): Int {
        val goal: Int = 2
        val nums: IntArray = intArrayOf(1, 0, 1, 0, 1)
        var s = 0
        for (a in 0 until nums.size) {
            var nn = 0
            for (b in a until nums.size) {
                nn += nums[b]
                if (nn == goal) {
                    s++
                }
            }
        }
        return s
    }

}