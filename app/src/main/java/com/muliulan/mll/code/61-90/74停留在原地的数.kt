package com.muliulan.mll.code.`61-90`


/**
描述:
zhaochenshuo
2021/5/13
 */

class Main74 {

    /**
     * 有一个长度为 arrLen 的数组，开始有一个指针在索引 0 处。
    每一步操作中，你可以将指针向左或向右移动 1 步，或者停在原地（指针不能被移动到数组范围外）。
    给你两个整数 steps 和 arrLen ，请你计算并返回：在恰好执行 steps 次操作以后，指针仍然指向索引 0 处的方案数。
    由于答案可能会很大，请返回方案数 模 10^9 + 7 后的结果。


    示例 1：
    输入：steps = 3, arrLen = 2
    输出：4
    解释：3 步后，总共有 4 种不同的方法可以停在索引 0 处。
    向右，向左，不动
    不动，向右，向左
    向右，不动，向左
    不动，不动，不动

    示例  2：
    输入：steps = 2, arrLen = 4
    输出：2
    解释：2 步后，总共有 2 种不同的方法可以停在索引 0 处。
    向右，向左
    不动，不动

    示例 3：
    输入：steps = 4, arrLen = 2
    输出：8
     * */
    fun numWays(steps: Int, arrLen: Int): Int {
        val a = 1000000007
        val maxColumn = Math.min(steps, arrLen - 1)
        //array[i][j] 标示 走了i步之后 指针对应j的方案数
        val array = Array<IntArray>(steps + 1) {
            IntArray(maxColumn + 1)
        }
        array[0][0] = 1
        for (i in 1..steps) {
            for (j in 0..maxColumn) {
                array[i][j] = array[i-1][j]
                if (j - 1 >= 0) {
                    array[i][j] = (array[i][j] + array[i - 1][j - 1]) % a
                }
                if (j + 1 <= maxColumn) {
                    array[i][j] = (array[i][j] + array[i - 1][j + 1]) % a
                }

            }
        }
        return array[steps][0]
    }

}