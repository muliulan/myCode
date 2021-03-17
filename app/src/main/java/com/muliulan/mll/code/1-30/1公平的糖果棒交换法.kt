package com.muliulan.mll.code.`1-30`

/**
描述:
zhaochenshuo
2021/2/1
 */

class Main1 {
    /**
     * 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 根糖果棒的大小，B[j] 是鲍勃拥有的第 j 根糖果棒的大小。
    因为他们是朋友，所以他们想交换一根糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
    返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
    如果有多个答案，你可以返回其中任何一个。保证答案存在。
     * */
    fun aa(): IntArray {
        val a = IntArray(3)//爱丽丝
        a[0] = 1
        a[1] = 1

        val b = IntArray(3)//鲍勃
        b[0] = 3
        b[1] = 3

        var allA = 0
        var allB = 0

        a.forEach {
            allA += it
        }
        b.forEach {
            allB += it
        }

        val allC = (allA - allB )/2
        a.forEach {
            val itA = it
            b.forEach {
                val itB = it
                if (itA - itB == allC) {
                    val intArray = IntArray(2)
                    intArray[0] = itA
                    intArray[1] = itB
                    return intArray
                }
            }
        }
        return IntArray(2)
    }
}