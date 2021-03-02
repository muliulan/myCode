package com.shopping.leetcode.offer

import java.util.*

/**
描述:
zhaochenshuo
2021/3/1
 */

class Offer19 {

    /**
     * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
     * */


    fun aa(): Boolean {
//        int[] pushA, int[] popA

        val pushA = arrayOf(1, 2, 3, 4, 5)
        val popA = arrayOf(5, 4, 3, 2, 1)

        val stack = Stack<Int>()
        pushA.forEach {
            stack.push(it)
        }

        var n = 0
        while (n < popA.size) {

            val pop = stack.pop()
            val i = popA[n]

            if (pop != i) {
                return false
            }
            n++
        }

        return true
    }

}