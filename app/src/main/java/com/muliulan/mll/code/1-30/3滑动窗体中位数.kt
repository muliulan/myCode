package com.muliulan.mll.code.`1-30`

import android.util.Log
import java.util.*


/**
描述:
zhaochenshuo
2021/2/3
 */

class Main3 {

    /**
     * 中位数是有序序列最中间的那个数。如果序列的长度是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。

    [2,3,4]，中位数是 3
    [2,3]，中位数是 (2 + 3) / 2 = 2.5
    给你一个数组 nums，有一个长度为 k 的窗口从最左端滑动到最右端。窗口中有 k 个数，每次窗口向右移动 1 位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。

    给出 nums = [1,3,-1,-3,5,3,6,7]，以及 k = 3。
    窗口位置                      中位数
    ---------------               -----
    [1  3  -1] -3  5  3  6  7       1
    1 [3  -1  -3] 5  3  6  7      -1
    1  3 [-1  -3  5] 3  6  7      -1
    1  3  -1 [-3  5  3] 6  7       3
    1  3  -1  -3 [5  3  6] 7       5
    1  3  -1  -3  5 [3  6  7]      6
     * */
    fun aa(): DoubleArray {
        val nums: IntArray = IntArray(4)
        nums[0] = 1
        nums[1] = 4
        nums[2] = 2
        nums[3] = 3
//        nums[4] = 5
//        nums[5] = 3
//        nums[6] = 6
//        nums[7] = 7
        //[1,4,2,3] 4


        val k = 1
        var left = 0
        val doubleArray = DoubleArray(nums.size - k + 1)

        if (nums.size == 1) {
            doubleArray[0] = nums[0].toDouble()
            return doubleArray
        }

        for (right in nums.indices) {
            if(k==1){
                doubleArray[right] = nums[right].toDouble()
                continue
            }
            if (right + k > nums.size) {
                break
            }
            doubleArray[left] = dd(nums, k, left, right + k)
            left++
        }
        doubleArray.forEach {
            Log.e("mll qaz", it.toString())
        }
        return doubleArray
    }

    private fun dd(nums: IntArray, k: Int, left: Int, right: Int): Double {
        val temp = IntArray(k)
        for (i in left..right - 1) {
            temp[i - left] = nums[i]
        }
        Arrays.sort(temp)
        return if (k % 2 == 0) {
            val i = temp[k / 2].toDouble()
            val i1 = temp[(k / 2) - 1].toDouble()
            (i + i1) / 2.toDouble()
        } else {
            temp[k / 2].toDouble()
        }
    }


}