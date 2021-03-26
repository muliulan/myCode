package com.muliulan.mll.code.`31-60`

import android.util.Log
import java.util.*

/**
描述:
zhaochenshuo
2021/3/24
 */

class Main39 {

    /**
     * 给你一个整数数组 nums ，数组中共有 n 个整数。132 模式的子序列 由三个整数 nums[i]、nums[j] 和 nums[k] 组成，
     * 并同时满足：i < j < k 和 nums[i] < nums[k] < nums[j] 。
    如果 nums 中存在 132 模式的子序列 ，返回 true ；否则，返回 false 。
    进阶：很容易想到时间复杂度为 O(n^2) 的解决方案，你可以设计一个时间复杂度为 O(n logn) 或 O(n) 的解决方案吗？


    示例 1：
    输入：nums = [1,2,3,4]
    输出：false
    解释：序列中不存在 132 模式的子序列。

    示例 2：
    输入：nums = [3,1,4,2]
    输出：true
    解释：序列中有 1 个 132 模式的子序列： [1, 4, 2] 。

    示例 3：
    输入：nums = [-1,3,2,0]
    输出：true
    解释：序列中有 3 个 132 模式的的子序列：[-1, 3, 2]、[-1, 3, 0] 和 [-1, 2, 0] 。

     * */
    fun aa(): Boolean {
        val nums: IntArray = intArrayOf(1, 2, 3, 4)

        //方法一(超时)
//        for (i in 0 until nums.size) {
//            for (j in i + 1 until nums.size) {
//                for (k in j + 1 until nums.size) {
//                    if (nums[i] < nums[k] && nums[k] < nums[j]) {
//                        return true
//                    }
//                }
//            }
//        }

        //方法二
        val size = nums.size
        val linkedList = LinkedList<Int>()
        linkedList.add(nums[size - 1])
        var maxK = Integer.MIN_VALUE

        for (i in size - 2 downTo 0) {
            val i1 = nums[i]
            if (i1 < maxK) {
                return true
            }
            while (!linkedList.isEmpty() && i1 > linkedList.peek()) {
                maxK = linkedList.pop()
            }
            if (i1 > maxK) {
                linkedList.push(i1)
            }
        }

        return false
    }
}