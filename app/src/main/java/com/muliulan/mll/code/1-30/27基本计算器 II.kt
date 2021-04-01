package com.muliulan.mll.code.`1-30`

import java.util.*

/**
描述:
zhaochenshuo
2021/3/11
 */

class Main27() {

    /**
     * 给你一个字符串表达式 s ，请你实现一个基本计算器来计算并返回它的值。
    整数除法仅保留整数部分。

     
    示例 1：
    输入：s = "3+2*2"
    输出：7

    示例 2：
    输入：s = " 3/2 "
    输出：1

    示例 3：
    输入：s = " 3+5 / 2 "
    输出：5
     * */

    fun aa(): Int {
        val s = "3/2"

        val linkedList = LinkedList<Int>()
        var ps = '+'
        var num = 0
        val n = s.length

        for (a in 0 until n) {
            val c = s[a]
            //如果是数字
            if (Character.isDigit(c)) {
                num = num * 10 + s[a].toInt() - '0'.toInt()
            }
            if (!Character.isDigit(c) || a == n - 1) {
                //如果是符号
                when (ps) {
                    '+' -> {
                        linkedList.push(num)
                    }
                    '-' -> {
                        linkedList.push(-num)
                    }
                    '*' -> {
                        linkedList.push(linkedList.pop() * num)
                    }
                    '/' -> {
                        linkedList.push(linkedList.pop() / num)
                    }
                }
                num = 0
                ps = c
            }
        }

        var ns = 0
        while (!linkedList.isEmpty()) {
            ns += linkedList.pop()
        }
        return ns
    }
}
