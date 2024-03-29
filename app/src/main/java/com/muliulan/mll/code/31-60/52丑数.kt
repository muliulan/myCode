package com.muliulan.mll.code.`31-60`

/**
描述:
zhaochenshuo
2021/4/10
 */

class Main52() {

    /**
     * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
    丑数 就是只包含质因数 2、3 和/或 5 的正整数。
     

    示例 1：
    输入：n = 6
    输出：true
    解释：6 = 2 × 3

    示例 2：
    输入：n = 8
    输出：true
    解释：8 = 2 × 2 × 2

    示例 3：
    输入：n = 14
    输出：false
    解释：14 不是丑数，因为它包含了另外一个质因数 7 。

    示例 4：
    输入：n = 1
    输出：true
    解释：1 通常被视为丑数。
     * */
    fun aa(): Boolean {
        val n: Int = 6
        if (n == 1) {
            return true
        }
        if (n == 0) {
            return false
        }
        var aa = n
        while (true) {
            if (aa % 2 == 0) {
                aa /= 2
                if (aa == 1) {
                    return true
                }
            } else if (aa % 3 == 0) {
                aa /= 3
                if (aa == 1) {
                    return true
                }
            } else if (aa % 5 == 0) {
                aa /= 5
                if (aa == 1) {
                    return true
                }
            } else {
                return false

            }
        }
        return true
    }
}