package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/8/4
 **/


class Main125 {


    fun triangleNumber(nums: IntArray): Int {
        var num = 0
        nums.sort()
        for (a in nums.indices) {
            for (b in a - 1 downTo 0) {
                for (c in b - 1 downTo 0) {
                    if (nums[c] + nums[b] > nums[a]) {
                        num++
                    }
                }
            }
        }
        return num
    }

}