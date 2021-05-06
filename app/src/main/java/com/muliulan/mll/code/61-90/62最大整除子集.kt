package com.muliulan.mll.code.`61-90`

import java.util.*

/**
描述:
zhaochenshuo
2021/4/23
 */

class Main62 {

    /**
     * 给你一个由 无重复 正整数组成的集合 nums ，请你找出并返回其中最大的整除子集 answer ，子集中每一元素对 (answer[i], answer[j]) 都应当满足：
    answer[i] % answer[j] == 0 ，或
    answer[j] % answer[i] == 0
    如果存在多个有效解子集，返回其中任何一个均可。

    示例 1：
    输入：nums = [1,2,3]
    输出：[1,2]
    解释：[1,3] 也会被视为正确答案。

    示例 2：
    输入：nums = [1,2,4,8]
    输出：[1,2,4,8]
     *
     * */

    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        val len = nums.size

        //1 从小到大排序
        Arrays.sort(nums)

        val dp = IntArray(len)
        Arrays.fill(dp, 1)
        var maxSize = 1
        var maxVal = 1

        for (i in 1 until dp.size) {

            for (j in 0 until i) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j ]+ 1)
                }
            }

            if (dp[i] > maxSize) {
                maxSize = dp[i]
                maxVal = nums[i]
            }
        }


        //是否只有一个值
        val arrayList = ArrayList<Int>()
        if (maxSize == 1) {
            arrayList.add(nums[0])
            return arrayList
        }

        //从后往前推

        for (a in len - 1 downTo 0) {
            if (dp[a] == maxSize && maxVal % nums[a] == 0) {
                arrayList.add(nums[a])
                maxVal=nums[a]
                maxSize--
            }
        }



        return arrayList
    }

}