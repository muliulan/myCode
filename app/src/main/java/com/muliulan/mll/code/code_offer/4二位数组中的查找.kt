package com.muliulan.mll.code.code_offer

/**
描述:
zhaochenshuo
2021/3/19
 */

class Off4() {

    /**
     * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

    示例:
    现有矩阵 matrix 如下：
    [
    [1,   4,  7, 11, 15],
    [2,   5,  8, 12, 19],
    [3,   6,  9, 16, 22],
    [10, 13, 14, 17, 24],
    [18, 21, 23, 26, 30]
    ]
    给定 target = 5，返回 true。
    给定 target = 20，返回 false。

    [[3,3,8,13,13,18],
    [4,5,11,13,18,20],
    [9,9,14,15,23,23],
    [13,18,22,22,25,27],
    [18,22,23,28,30,33],
    [21,25,28,30,35,35],
    [24,25,33,36,37,40]]
     * */

    fun aa(): Boolean {


        val matrix: Array<IntArray> = arrayOf(intArrayOf(1, 2, 3), intArrayOf(1, 2, 3))
        val target: Int = 1
        var i = matrix.size - 1
        var j = 0

        if (matrix.size == 0 || matrix[0].size == 0) {
            return false
        }

        while (i >= 0 && j < matrix[0].size) {
            val i1 = matrix[i][j]
            if (i1 > target) {
                i--
            }
            if (i1 < target) {
                j++
            }
            if (i1 == target) {
                return true
            }
        }
            return false
    }

}