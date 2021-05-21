package com.muliulan.mll.code.`61-90`

import android.util.Log
import java.util.*

/**
描述:
zhaochenshuo
2021/5/19
 */

class Main79 {


    fun aa(k: Int): Int {
//        [4,5,6,2]
//        [1,2,3,4]
//        [8,4,6,8]
//
//        (a, b) 的 值 可由对所有满足 0 <= i <= a < m 且 0 <= j <= b < n 的元素 matrix[i][j]（下标从 0 开始计数）

        val matrix = Array<IntArray>(2) {
            intArrayOf(5, 2)
            intArrayOf(1, 6)
        }

        val m = matrix.size
        val n = matrix[0].size

        val array = Array<IntArray>(m + 1) {
            IntArray(n + 1)
        }
        val array1 = ArrayList<Int>()
        for (a in 1 .. m) {
            for (b in 1 .. n) {
                array[a][b] =
                    array[a - 1][b] xor array[a - 1][b - 1] xor array[a][b - 1] xor matrix[a - 1][b - 1]
                array1.add(array[a][b])
            }
        }

        Collections.sort(array1){o1,o2->
            o2-o1
        }

        return array1[k - 1]
    }

}