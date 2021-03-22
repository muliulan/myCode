package com.muliulan.mll.code.`31-60`

import java.util.*

/**
描述:
zhaochenshuo
2021/3/20
 */

class Main35() {

    /**
     * 有效的算符包括 +、-、*、/ 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。

    说明：
    整数除法只保留整数部分。
    给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。

    示例 1：
    输入：tokens = ["2","1","+","3","*"]
    输出：9
    解释：该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9

    示例 2：
    输入：tokens = ["4","13","5","/","+"]
    输出：6
    解释：该算式转化为常见的中缀算术表达式为：(4 + (13 / 5)) = 6

    示例 3：
    输入：tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
    输出：22
    解释：
    该算式转化为常见的中缀算术表达式为：
    ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
    = ((10 * (6 / (12 * -11))) + 17) + 5
    = ((10 * (6 / -132)) + 17) + 5
    = ((10 * 0) + 17) + 5
    = (0 + 17) + 5
    = 17 + 5
    = 22
     * */
    fun aa(): Int {

        val tokens: Array<String> =
            arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")

        // (2 +1) *3
        val linkedList = LinkedList<Int>()
        tokens.forEach {
            when (it) {
                "+" -> {
                    val pop1 = linkedList.pop()
                    val pop2 = linkedList.pop()
                    linkedList.push(pop2 + pop1)
                }
                "-" -> {
                    val pop1 = linkedList.pop()
                    val pop2 = linkedList.pop()
                    linkedList.push(pop2 - pop1)
                }
                "*" -> {
                    val pop1 = linkedList.pop()
                    val pop2 = linkedList.pop()
                    linkedList.push(pop2 * pop1)
                }
                "/" -> {
                    val pop1 = linkedList.pop()
                    val pop2 = linkedList.pop()
                    linkedList.push(pop2 / pop1)
                }
                else -> {
                    linkedList.push(it.toInt())
                }
            }
        }
        return linkedList.pop()
    }
}