package com.muliulan.mll.code.`31-60`

/**
描述:
zhaochenshuo
2021/4/15
 */

class Main56 {

    /**
     * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。
     * 同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
    给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。


    示例 1：
    输入：nums = [2,3,2]
    输出：3
    解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。

    示例 2：
    输入：nums = [1,2,3,1]
    输出：4
    解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
         偷窃到的最高金额 = 1 + 3 = 4 。

    示例 3：
    输入：nums = [0]
    输出：0
     * */

    fun aa(): Int {
        val nums: IntArray = intArrayOf(1, 3, 1, 4, 100)
        if (nums.size == 1) {
            return nums[0]
        }
        if (nums.size == 2) {
            return Math.max(nums[0], nums[1])
        }
        return Math.max(dd(nums, 0, nums.size - 1), dd(nums, 1, nums.size - 1))
    }

    private fun dd(nums: IntArray, s: Int, e: Int): Int {
        var first = nums[s]
        var se = Math.max(nums[s], nums[s + 1])
        var n = s + 2
        while (n <= e) {
            val t = se
            se = Math.max(first + nums[n], se)
            first = t
            n++
        }
        return se
    }

}