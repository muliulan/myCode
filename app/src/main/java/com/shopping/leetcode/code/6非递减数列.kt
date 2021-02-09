package com.shopping.leetcode.code

import android.util.Log

/**
描述:
zhaochenshuo
2021/2/7
 */

class Main6() {


    /**给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。
    我们是这样定义一个非递减数列的： 对于数组中所有的 i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。


    示例 1:
    输入: nums = [4,2,3]
    输出: true
    解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。

    示例 2:
    输入: nums = [4,2,1]
    输出: false
    解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
     
    说明：
    1 <= n <= 10 ^ 4
    - 10 ^ 5 <= nums[i] <= 10 ^ 5
     * */
    fun aa() {
        var nums: IntArray = intArrayOf(5, 4)   //1231
        var l = 0

        for (a in 0 until nums.size) {

            if (a == 0) {
                if (nums[a] > nums[a + 1]) {
                    nums[a] = nums[a + 1]
                    l++
                }
                continue
            }
            val b = nums[a] >= nums[a - 1]
            //-1, 4, 2, 3
            // 1 2 3 1
            // 判断是换当前数  还是换前一个数
            if (!b) {
                l++
                if (nums[a] >= nums[a - 2]) {
                    nums[a - 1] = nums[a]
                } else {
                    nums[a] = nums[a - 1]
                }

            }

        }
        Log.e("mll 结果", l.toString())

        nums.forEach {
            Log.e("mll aaaa", it.toString())
        }
    }

}