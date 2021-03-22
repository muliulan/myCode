package com.muliulan.mll.offer.off

/**
描述:
zhaochenshuo
2021/2/8
 */

class Offer1 {

    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     *
     * [
     * [1,2,3],
     * [2,3,4],
     * [3,4,5,6]
     * ]
     *
     * */
    fun aa(): Boolean {

        val matrix = arrayOf(intArrayOf(4, 5, 6, 8), intArrayOf(2, 3), intArrayOf(1, 6, 9))
        val i = 0

        for (m in matrix) {
            for (a in m) {
                if (a == i) {
                    return true
                }
                if (a > i) {
                    break
                }
            }
        }
        return false
    }
}