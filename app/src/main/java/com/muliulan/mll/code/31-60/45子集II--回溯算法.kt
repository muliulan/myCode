package com.muliulan.mll.code.`31-60`

import java.util.*
import kotlin.collections.ArrayList

/**
描述:
zhaochenshuo
2021/3/31
 */

class Main45() {

    /**
     * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
    解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
     

    示例 1：
    输入：nums = [1,2,2]
    输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]

    示例 2：
    输入：nums = [0]
    输出：[[],[0]]
     * */
    val t = ArrayList<Int>()
    val ans = ArrayList<List<Int>>()
    fun aa(): List<List<Int>> {
        val nums: IntArray = intArrayOf(1, 2, 3, 4)
        Arrays.sort(nums)
        bb(false, 0, nums)
        return ans
    }

    fun bb(b: Boolean, cur: Int, nums: IntArray) {
        if (cur == nums.size) {
            ans.add(ArrayList<Int>(t))
            return
        }

        bb(false, cur + 1, nums)
        if (!b && cur > 0 && nums[cur] == nums[cur - 1]) {
            return
        }

        t.add(nums[cur])
        bb(true, cur + 1, nums)
        t.removeAt(t.size - 1)

    }

}