package com.muliulan.mll.code.`1-30`

import android.util.Log

/**
描述:
zhaochenshuo
2021/2/25
 */

class Main20() {

    /**
     * 给你一个二维整数数组 matrix， 返回 matrix 的 转置矩阵 。
    矩阵的 转置 是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。


    2   4   -1              2   -10 18
    -10 5   11      ->      4   5   -7
    18  -7  6               -1  11  6

    示例 1：
    输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
    输出：[[1,4,7],[2,5,8],[3,6,9]]

    示例 2：
    输入：matrix = [[1,2,3],[4,5,6]]
    输出：[[1,4],[2,5],[3,6]]
    1  2   3
    4  5   6
    0  0   0


     *
     * */

    fun aa() {
        val matrix: Array<IntArray> =
            arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6) )


        val my: Array<IntArray> = Array(matrix[0].size) {
            IntArray(matrix.size)
        }

        for (a in 0 until matrix.size) {
            val ints = matrix[a]
            for (b in 0 until ints.size) {
                my[b][a] = matrix[a][b]
            }
        }

        my.forEach {
            var s = ""
            it.forEach {
                s += it
            }
            Log.e("mllll", s)
        }

    }


}