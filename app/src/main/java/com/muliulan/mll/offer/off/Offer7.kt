package com.muliulan.mll.offer.off

/**
描述:
zhaochenshuo
2021/2/8
 */

class Offer7 {


    /**
     * 写一个函数，输入n，求斐波那契数列的第n项值。
     */
    fun aa(n: Int): Int {

        if (n == 0 || n == 1) {
            return n
        }
        return aa(n - 1) + aa(n - 2)
    }
}