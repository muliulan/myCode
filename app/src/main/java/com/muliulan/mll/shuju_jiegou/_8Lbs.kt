package com.muliulan.mll.shuju_jiegou

import java.util.*

/**
描述: 动态规划
zhaochenshuo
2021/4/16
 */

class _8Lbs {

    fun f1(c: Int): Int {
        val intArray = IntArray(c)
        intArray[0] = 1
        intArray[1] = 1
        for (a in 0 until intArray.size) {
            intArray[a] = intArray[a - 1] + intArray[a - 2]
        }
        return intArray[c - 1]
    }

    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    // Lcs算法
    fun getLcs(aa: String, bb: String): String {

        val aArray = aa.toCharArray()
        val bArray = bb.toCharArray()

        val array = Array(bArray.size + 1) {
            IntArray(aArray.size + 1)
        }

        for (a in 0 until aArray.size) {
            array[0][a] = 0
        }
        for (b in 0 until bArray.size) {
            array[b][0] = 0
        }

        for (b in 1 until array.size) {
            for (a in 1 until array[b].size) {
                if (bArray[b - 1] == aArray[a - 1]) {
                    //如果相等就取左上角的值+1
                    array[b][a] = array[a - 1][b - 1] + 1
                } else {
                    //如果不相等左值和上值取最大值
                    array[b][a] = Math.max(array[a - 1][b], array[a][b - 1])
                }
            }
        }
        //从后往前找出结果
        val stack = Stack<Char>()
        var x = aArray.size - 1
        var y = bArray.size - 1
        while (x == 0 || y == 0) {
            if (aa[x] == bb[y]) {
                stack.push(aa[x])
                y--
                x--
            } else {
                if (array[x + 1][y + 1 - 1] > array[x + 1 - 1][y + 1]) {
                    y--
                } else {
                    x--
                }
            }
        }
        var a = ""
        while (!stack.isEmpty()) {
            a += stack.pop()
        }
        return a
    }

    //KMP算法

}