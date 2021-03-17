package com.muliulan.mll.code.`31-60`

/**
描述:
zhaochenshuo
2021/3/16
 */

class Main31 {

    /**
     * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
     
    1   2   3
    8   9   4
    7   6   5

    示例 1：
    输入：n = 3
    输出：[[1,2,3],[8,9,4],[7,6,5]]

    示例 2：
    输入：n = 1
    输出：[[1]]
     *
     * */
    fun aa() {
        val n: Int = 3

        val array = Array(n) {
            IntArray(n)
        }

        var top = 0
        var bottom = n - 1
        var left = 0
        var right = n - 1
        var num = 0
        while (top <= bottom && left <= right) {

            for (a in left..right) {
                num++
                array[top][a] = num
            }
//
            for (b in top+1..right) {
                num++
                array[b][right] = num
            }
//
            if (top < bottom && left < right) {

                for (c in right - 1 downTo left) {
                    num++
                    array[bottom][c] = num
                }

                for (d in bottom - 1 downTo top + 1) {
                    num++
                    array[d][left] = num
                }
            }

            left++
            right--
            top++
            bottom--

        }



    }

}