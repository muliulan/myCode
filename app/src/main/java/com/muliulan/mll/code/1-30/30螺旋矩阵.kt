package com.muliulan.mll.code.`1-30`

import java.util.ArrayList

/**
描述:
zhaochenshuo
2021/3/15
 */

class Main30 {

    /**
     *
    给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。

    1   2   3
    4   5   6
    7   8   9

    示例 1：
    输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
    输出：[1,2,3,6,9,8,7,4,5]

    示例 2：
    输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
    输出：[1,2,3,4,8,12,11,10,9,5,6,7]
     *
     * */

    fun aa(): List<Int> {
        val arrayList = ArrayList<Int>()
        val matrix: Array<IntArray> =
            arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))


        val rows = matrix.size
        val columns = matrix[0].size
        var left = 0
        var right = columns - 1
        var top = 0
        var bottom = rows - 1


        while (left <= right && top <= bottom) {
            for (a in left..right) {
                arrayList.add(matrix[top][a])
            }

            for (b in top + 1..bottom) {
                arrayList.add(matrix[b][right])
            }
            if (left < right && top < bottom) {
                for (c in right - 1 downTo left) {
                    arrayList.add(matrix[bottom][c])
                }

                for (d in bottom - 1 downTo top + 1) {
                    arrayList.add(matrix[d][left])
                }
            }

            left++
            right--
            top++
            bottom--
        }

//        var s = ""
//        arrayList.forEach {
//            s += it
//        }
//
//        Log.e("mlllll", s)
        return arrayList
    }

}