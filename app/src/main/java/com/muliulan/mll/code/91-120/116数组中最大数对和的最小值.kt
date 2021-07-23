package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/20
 **/
class Main116() {
    fun minPairSum(nums: IntArray): Int {

        nums.sort()

        var max=0
        val i = nums.size / 2
        val n = nums.size
        for (a in 0 until i) {
            max=Math.max(nums[a]+nums[n-a],max)

        }
        return max
    }


}