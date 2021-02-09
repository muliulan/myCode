package com.shopping.leetcode.code

import android.util.Log
import java.util.ArrayList

/**
描述:
zhaochenshuo
2021/2/4
 */

class Main4 {
    /**
     * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。

    示例：
    输入：[1,12,-5,-6,50,3], k = 4
    输出：12.75
    解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
     *
     * */
    //第二种方式
    fun cc() {
        val nums: IntArray = IntArray(6)
        nums[0] = 3
        nums[1] = 3
        nums[2] = 4
        nums[3] =3
        nums[4] = 0
        val k = 3

        if(nums.size==1){
            nums[0].toDouble()
        }

        var sun = 0
        for (a in 0.. k-1) {
            sun += nums[a]
        }
        var max = sun
         for(b in k..nums.size-1 ){
             sun=sun+nums[b]-nums[b-k] //进站出站  加上下一个数 减去第一个数
            max=Math.max(sun ,max)
         }

        Log.e("mlldd",(max.toDouble()/k).toString())
    }



    fun aa() {
        val nums: IntArray = IntArray(6)
        nums[0] = 1
        nums[1] = 12
        nums[2] = -5
        nums[3] = -6
        nums[4] = 50
        nums[5] = 3
        val k = 4

        val arrayList = ArrayList<Int>()
        nums.forEach {
            arrayList.add(it)
        }
        var l = 0
        var r = 0
        var max = -999.0
        for (a in 0..nums.size - k) {
            l = a
            r = a + k
            val subList = arrayList.subList(l, r)
            max = Math.max(max, dd(subList, k))
        }
        Log.e("mllqqq", max.toString())
    }

    private fun dd(subList: MutableList<Int>, k: Int): Double {
        var a: Double = 0.0
        subList.forEach {
            a += it
        }

        return a / k
    }
}