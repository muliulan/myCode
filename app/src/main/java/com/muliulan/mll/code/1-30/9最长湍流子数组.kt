package com.muliulan.mll.code.`1-30`

import android.util.Log

/**
描述:
zhaochenshuo
2021/2/8
 */

class Main9 {

    /**
    当 A 的子数组 A[i], A[i+1], ..., A[j] 满足下列条件时，我们称其为湍流子数组：
    若 i <= k < j，当 k 为奇数时， A[k] > A[k+1]，且当 k 为偶数时，A[k] < A[k+1]；
    或 若 i <= k < j，当 k 为偶数时，A[k] > A[k+1] ，且当 k 为奇数时， A[k] < A[k+1]。
    也就是说，如果比较符号在子数组中的每个相邻元素对之间翻转，则该子数组是湍流子数组。
    返回 A 的最大湍流子数组的长度。

    示例 1：
    输入：[9,4,2,10,7,8,8,1,9]
    输出：5
    解释：(A[1] > A[2] < A[3] > A[4] < A[5])

    示例 2：
    输入：[4,8,12,16]
    输出：2
    示例 3：

    输入：[100]
    输出：1
     * */
    fun aa() {
        val arr = intArrayOf(9, 4, 2, 10, 7, 8, 8, 1, 9)

        var up = 1
        var del = 1
        var n = 1


        for (i in 1 until arr.size) {
            /**
             * 如果第一次大于 第二次是小于  就会累加上第一次的
             * 如果 第一次大于  第二次还是大于  就会重置成第一次
             * */
            if (arr[i] > arr[i - 1]) {
                up = del + 1
                del = 1
            } else if (arr[i] < arr[i - 1]) {
                del = up + 1
                up = 1
            } else {
                up = 1
                del = 1
            }
            n = Math.max(n, Math.max(up, del))

        }
        Log.e("mll dada", n.toString())
    }
}