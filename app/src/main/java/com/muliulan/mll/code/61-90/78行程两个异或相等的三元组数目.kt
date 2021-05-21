package com.muliulan.mll.code.`61-90`

import android.util.Log

/**
描述:
zhaochenshuo
2021/5/18
 */

class Main78 {

    /**
     *
     * 给你一个整数数组 arr 。
    现需要从数组中取三个下标 i、j 和 k ，其中 (0 <= i < j <= k < arr.length) 。
    a 和 b 定义如下：
    a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
    b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
    注意：^ 表示 按位异或 操作。
    请返回能够令 a == b 成立的三元组 (i, j , k) 的数目。
     

    示例 1：
    输入：arr = [2,3,1,6,7]
    输出：4
    解释：满足题意的三元组分别是 (0,1,2), (0,2,2), (2,3,4) 以及 (2,4,4)
     * */

    fun aa(): Int {
        val arr: IntArray = intArrayOf(2, 3, 1, 6, 7)
//        i、j 和 k

        val intArray = IntArray(arr.size + 1)

        for (a in 0 until arr.size) {
            intArray[a + 1] = intArray[a] xor arr[a]
        }
        var ans = 0

        for (a in 0 until arr.size) {
            for (b in a + 1 until arr.size) {
                if (intArray[a] == intArray[b + 1]) {
                    ans += b - a
                }
            }
        }


        return ans
    }

}