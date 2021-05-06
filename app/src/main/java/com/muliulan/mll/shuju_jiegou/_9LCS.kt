package com.muliulan.mll.shuju_jiegou

/**
描述: 动态规划
zhaochenshuo
2021/4/23
 */

class _9LCS {




    fun aa() {
        val a1 = arrayListOf<String>()
        val a2 = arrayListOf<String>()
        val a3 = arrayListOf<String>()
        val x = arrayOf("B", "D", "C", "A", "B", "A")
        val y = arrayOf("A", "B", "C", "B", "D", "A", "B")

        var a = x.size - 1
        var b = y.size - 1
        while (a < 0 || b < 0) {
            if (x[a] == y[b]) {
                a1.add(x[a])
                a--
                b--
            } else {
                a--
            }
        }

    }


}