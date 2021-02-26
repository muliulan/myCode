package com.shopping.leetcode.code

/**
描述:
zhaochenshuo
2021/2/22
 */

class Main17() {

    /**
     * 给你一个 m x n 的矩阵 matrix 。如果这个矩阵是托普利茨矩阵，返回 true ；否则，返回 false 。
    如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
     *
     * */


    fun aa(): Boolean {
        //[1,2,3,4],[5,1,2,3],[9,5,1,2]
        val matrix: Array<IntArray> = arrayOf<IntArray>(intArrayOf(1, 3, 4),intArrayOf(5, 1, 2, 3),intArrayOf(9, 5, 1, 2))

        if(matrix.size==1){
            return true
        }
        for (a in 1 until matrix.size) {
            val ints = matrix[a]
            for (b in 1 until ints.size) {

                    val i = matrix[a][b]
                    val ii = matrix[a - 1][b - 1]
                    if (i != ii) {
                        return false
                    }
            }

        }
        return true
    }
}