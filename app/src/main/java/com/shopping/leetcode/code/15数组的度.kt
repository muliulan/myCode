package com.shopping.leetcode.code

import android.util.Log
import kotlin.math.max
import kotlin.math.min

/**
描述:
zhaochenshuo
2021/2/20
 */

class Main15() {


    /**
     * 给定一个非空且只包含非负数的整数数组 nums，数组的度的定义是指数组里任一元素出现频数的最大值。
    你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。

    示例 1：
    输入：[1, 2, 2, 3, 1]
    输出：2
    解释：
    输入数组的度是2，因为元素1和2的出现频数最大，均为2.
    连续子数组里面拥有相同度的有如下所示:
    [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
    最短连续子数组[2, 2]的长度为2，所以返回2.

    示例 2：
    输入：[1,2,2,3,1,4,2]
    输出：6
     * */
    fun aa() {

        val nums: IntArray = intArrayOf(1, 2, 2, 3, 1, 4, 2)
        val cc = cc(nums)
        Log.e("mllddddddddddddddd",cc.toString())
    }

    private fun cc(nums: IntArray) :Int{
        val l = HashMap<Int, Int>()//第一次出现的位置
        val r = HashMap<Int, Int>()//最后一次出现的位置
        val n = HashMap<Int, Int>()//每个元素出现的个数

        for (a in 0 until nums.size) {
            val i = nums[a]
            val i1 = l[i]
            if (i1 == null) {
                l[i] = a
                n[i] = 1

            } else {
                n[i] = n[i]!! + 1
            }
        }

        l.forEach {
            val key = it.key
            for (a in nums.size-1 downTo  0) {
                val i = nums[a]
                if (key == i && r[key]==null) {
                    r[key] = a
                    continue
                }
            }
        }
        l.forEach {
            Log.e("mll", "mll")
        }


        var dd=0
        n.forEach {
           dd= max(it.value,dd)
        }

        var num=nums.size
        n.forEach{
            val value = it.value
            val key = it.key
            if(dd==value){
                val i = l[key]
                val i1 = r[key]
                val i2 = i1!! - i!!+1
                num=min(i2,num)
            }

        }

    return num
    }

}