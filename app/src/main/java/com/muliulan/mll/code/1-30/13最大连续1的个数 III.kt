package com.muliulan.mll.code.`1-30`

/**
描述:
zhaochenshuo
2021/2/19
 */

class Main13() {

    /**
     * 给定一个由若干 0 和 1 组成的数组 A，我们最多可以将 K 个值从 0 变成 1 。
    返回仅包含 1 的最长（连续）子数组的长度。
     

    示例 1：
    输入：A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
    输出：6
    解释：
    [1,1,1,0,0,1,1,1,1,1,1]
    粗体数字从 0 翻转到 1，最长的子数组长度为 6。

    示例 2：
    输入：A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
    输出：10
    解释：
    [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
    粗体数字从 0 翻转到 1，最长的子数组长度为 10。
     *
     * */
    fun aa(): Int {
        val A: IntArray = intArrayOf(0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1)
        val K: Int = 3

        if (A.size - 1 == K) {
            return K
        }
        var l = 0
        var r = 0

        var z = 0
        var all = 0

        while (r < A.size) {
            if (A[r] == 0) {
                z++
            }
            while (z > K) {
                if (A[l] == 0) {
                    z--
                }
                l++
            }
            all = Math.max(all, r - l + 1)
            r++
        }

        return all
    }

}