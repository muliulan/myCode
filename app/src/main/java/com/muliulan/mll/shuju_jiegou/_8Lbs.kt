package com.muliulan.mll.shuju_jiegou

import java.util.*

/**
描述: 动态规划
zhaochenshuo
2021/4/16
 */

class _8Lbs {

    /**
     * 计算 1 1 3 4 7 11
     * */
    fun f1(c: Int): Int {
        val intArray = IntArray(c)
        intArray[0] = 1
        intArray[1] = 1
        for (a in 0 until intArray.size) {
            intArray[a] = intArray[a - 1] + intArray[a - 2]
        }
        return intArray[c - 1]
    }


    // Lcs算法
    /**
     * 找到两个字符串中相同的子集
     * aa="B,D,C,A,B,A"
     *  bb="A,B,C,B,D,A,B"
     * */
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

        //相同的取左上加1,不同的取上和左中的最大值
        for (b in 1 until array.size) {
            for (a in 1 until array[b].size) {
                if (bArray[b - 1] == aArray[a - 1]) {
                    //如果相等就取左上角的值+1
                    array[b][a] = array[b - 1][a- 1] + 1
                } else {
                    //如果不相等左值和上值取最大值
                    array[b][a] = Math.max(array[b - 1][a], array[b][a - 1])
                }
            }
        }
        //从后往前打印出结果
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
        //结果正过来
        var a = ""
        while (!stack.isEmpty()) {
            a += stack.pop()
        }
        return a
    }

    //KMP算法

}