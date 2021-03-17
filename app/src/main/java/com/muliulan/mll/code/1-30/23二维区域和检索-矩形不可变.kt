package com.muliulan.mll.code.`1-30`

import android.util.Log

/**
描述:
zhaochenshuo
2021/3/2
 */

class Main23() {
    /**
     * 给定一个二维矩阵，计算其子矩形范围内元素的总和，该子矩阵的左上角为 (row1, col1) ，右下角为 (row2, col2) 。
    上图子矩阵左上角 (row1, col1) = (2, 1) ，右下角(row2, col2) = (4, 3)，该子矩形内元素的总和为 8。

    示例：
    给定 matrix = [
    [3, 0, 1, 4, 2],
    [5, 6, 3, 2, 1],

    [1, 2, 0, 1, 5],
    [4, 1, 0, 1, 7],
    [1, 0, 3, 0, 5]
    ]
    sumRegion(2, 1, 4, 3) -> 8
    sumRegion(1, 1, 2, 2) -> 11
    sumRegion(1, 2, 2, 4) -> 12
     *
     * */
    val matrix: Array<IntArray> = arrayOf(
        intArrayOf(3, 0, 1, 4, 2),
        intArrayOf(5, 6, 3, 2, 1),
        intArrayOf(1, 2, 0, 1, 5),
        intArrayOf(4, 1, 0, 1, 7),
        intArrayOf(1, 0, 3, 0, 5)
    )
    val row1: Int = 2
    val col1: Int = 1
    val row2: Int = 4
    val col2: Int = 3

    fun aa(): Int {
        var num = 0
        for (a in row1 .. row2) {
            val ints = matrix[a]
            for (b in col1 .. col2) {
                num += ints[b]
                Log.e("mllzzz", ints[b].toString())
            }
        }

        return num
    }

    fun bb(){
        val arrayListOf = arrayListOf<IntArray>()

    }
}