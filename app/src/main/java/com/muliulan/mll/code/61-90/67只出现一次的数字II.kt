package com.muliulan.mll.code.`61-90`

import java.util.*

/**
描述:
zhaochenshuo
2021/4/30
 */

class Main67 {

    /**
     * 给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。

    示例 1：
    输入：nums = [2,2,3,2]
    输出：3

    示例 2：
    输入：nums = [0,1,0,1,0,1,99]
    输出：99
     *
     * */
    fun aa(): Int {
        val nums: IntArray = intArrayOf(2, 2, 3, 2)
        Arrays.sort(nums)
        var num = -999
        var ss = 2
        for (a in 0 until nums.size) {
            if (num == nums[a]) {
                ss--
            } else {
                if (a == nums.size - 1 && ss == 0) {
                    return nums[a]
                }
                if (ss == 0 || a == 0) {
                    ss = 2
                    num = nums[a]
                } else {
                    return num
                }
            }
        }
        return -11
    }
}