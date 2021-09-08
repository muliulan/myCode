package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/9/6
 **/

class Main138 {

    fun aa(): Int {

        val nums: IntArray = intArrayOf(-1, 0, 3, 5, 9, 12)
        val target: Int = 9

        if(nums.size==1){
            return if(nums[0]==target) 0 else -1
        }
        var l = 0
        var r = nums.size - 1
        while (l < r) {
            val z =  l + (r - l) / 2
            if (nums[z] == target) {
                return z
            }
            if (nums[z] > target) {
                r -= 1
            } else if (nums[z] < target) {
                l += 1
            }
        }
        return -1
    }

}