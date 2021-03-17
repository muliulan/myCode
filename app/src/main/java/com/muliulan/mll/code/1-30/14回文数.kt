package com.muliulan.mll.code.`1-30`

/**
描述:
zhaochenshuo
2021/2/19
 */

class Main14() {

    /**
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
    回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
     

    示例 1：
    输入：x = 121
    输出：true

    示例 2：
    输入：x = -121
    输出：false
    解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

    示例 3：
    输入：x = 10
    输出：false
    解释：从右向左读, 为 01 。因此它不是一个回文数。

    示例 4：
    输入：x = -101
    输出：false
     * */
    fun aa(): Boolean {

        val x: Int = 121
        if (x < 0) {
            return false
        }

        val toString = x.toString()
        val toCharArray = toString.toCharArray()

        var a = ""
        var b = ""
        for (c in 0 until toCharArray.size) {

            a += toCharArray[c]
            b += toCharArray[toCharArray.size - c - 1]
        }

        return a.equals(b)
    }

    fun bb() :Boolean{
        var x: Int = 121


        var a = 0
        var b=x
        while (b!=0) {
            a = a * 10 + b % 10
            b /= 10
        }

        return a==x
    }

}