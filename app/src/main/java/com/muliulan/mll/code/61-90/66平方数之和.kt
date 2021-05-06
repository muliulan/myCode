package com.muliulan.mll.code.`61-90`

/**
描述:
zhaochenshuo
2021/4/28
 */

class Main66 {

    /**给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。

    示例 1：
    输入：c = 5
    输出：true
    解释：1 * 1 + 2 * 2 = 5

    示例 2：
    输入：c = 3
    输出：false

    示例 3：
    输入：c = 4
    输出：true

    示例 4：
    输入：c = 2
    输出：true

    示例 5：
    输入：c = 1
    输出：true
     *
     * */
    fun aa(): Boolean {
        val c: Int = 4


        var a=0.toLong()
        while (a*a<c){
            val i = c - a * a
            val sqrt = Math.sqrt(i.toDouble())

            if(sqrt==sqrt.toInt().toDouble()){
                return true
            }
            a++
        }
        return false
    }

}