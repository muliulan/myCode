package com.muliulan.mll.code.`61-90`

/**
描述:
zhaochenshuo
2021/5/24
 */

class Main83 {


    fun aa(s: String): Int {


        val n = s.length
        val array = Array<IntArray>(n) {
            IntArray(n)
        }

        for (a in n - 1 downTo 0) {
            array[a][a] = 1
            for (b in a + 1 until n) {
                if (s[a] == s[b]) {
                    array[a][b] = array[a][b - 1]
                } else {
                    var num = 9999
                    for (c in a until b) {
                        num = Math.min(num, array[a][c] + array[c + 1][b])
                    }
                    array[a][b] = num
                }
            }
        }
        return array[0][n-1]
    }

}