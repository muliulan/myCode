package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/8/12
 **/
class Main129 {

    //用 dp[i][j] 表示字符串 ss 的下标范围 [i, j][i,j] 内的最长回文子序列的长度
    fun longestPalindromeSubseq(s: String): Int {
        val n = s.length
        if (n == 1) {
            return 1
        }
        val array = Array(n) {
            IntArray(n)
        }

        for (a in n - 1 downTo 0) {
            array[a][a] = 1
            val c = s[a]
            for (b in a + 1 until n) {
                val c1 = s[b]

                if (c == c1) {
                    array[a][b] = array[a + 1][b - 1] + 2
                } else {
                    array[a][b] = Math.max(array[a + 1][b], array[a][b - 1])
                }
            }
        }
        return array[0][n - 1]
    }

}