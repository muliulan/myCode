package com.muliulan.mll.code.`91-120`

class Main92 {

    fun findTargetSumWays(): Int {

        val nums: IntArray = intArrayOf(1, 1, 1, 1, 1)
        val target: Int = 3
        bb(nums,target,0,0)
        return mysun
    }

    var mysun = 0
    fun bb(nums: IntArray, target: Int, index: Int, sun: Int) {

        if (index == nums.size) {
            if (sun == target) {
                mysun++
            }
        } else {
            bb(nums, target, index + 1, sun - nums[index ])
            bb(nums, target, index + 1, sun + nums[index ])
        }
    }

}