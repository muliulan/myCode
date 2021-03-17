package com.muliulan.mll.code.`1-30`

/**
描述:
zhaochenshuo
2021/2/5
 */

class Main5() {
    /**给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
    如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
    假设环境不允许存储 64 位整数（有符号或无符号）。

    输入：x = 123
    输出：321

    输入：x = -123
    输出：-321

    输入：x = 120
    输出：21

    输入：x = 0
    输出：0
     * */
    fun aa(): Int {
        var x: Int = 1534236469
        var n = 0
        var a = x
        while ((x > 0 && a > 0) || (x < 0 && a < 0)) {
            var result=n
            val i = a % 10  //9
            n = n * 10 + i  //9
            a = a / 10      //153423646
            if (n / 10 != result) return 0
        }

        return n
    }

}