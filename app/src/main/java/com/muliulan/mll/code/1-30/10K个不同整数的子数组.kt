package com.muliulan.mll.code.`1-30`

import android.util.Log

/**
描述:
zhaochenshuo
2021/2/9
 */

class Main10 {

    /***
     *给定一个正整数数组 A，如果 A 的某个子数组中不同整数的个数恰好为 K，则称 A 的这个连续、不一定独立的子数组为好子数组。
    （例如，[1,2,3,1,2] 中有 3 个不同的整数：1，2，以及 3。）
    返回 A 中好子数组的数目。

    示例 1：
    输入：A = [1,2,1,2,3], K = 2
    输出：7
    解释：恰好由 2 个不同整数组成的子数组：[1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2].

    示例 2：
    输入：A = [1,2,1,3,4], K = 3
    输出：3
    解释：恰好由 3 个不同整数组成的子数组：[1,2,1,3], [2,1,3], [1,3,4].

    [27,27,43,28,11,20,1,4,49,18,37,31,31,7,3,31,50,6,50,46,4,13,31,49,15,52,25,31,35,4,11,50,40,1,49,14,46,16,11,16,39,26,13,4,37,39,46,27,49,39,49,50,37,9,30,45,51,47,18,49,24,24,46,47,18,46,52,47,50,4,39,22,50,40,3,52,24,50,38,30,14,12,1,5,52,44,3,49,45,37,40,35,50,50,23,32,1,2]
    20
     */
    fun aa(): Int {
        val A: IntArray = intArrayOf(1, 2, 1, 2, 3)
        val K: Int = 2

        var n: String = ""
        var num: Int = 0

        for (i in 0 until A.size) {
            val it = A[i]
            n = it.toString() + ","
            val aa = if (K == 1) {
                i
            } else {
                i + 1
            }
            for (h in aa until A.size) {
                val toString = A[h].toString()
                n = "$n$toString,"
                if (dd(n) == K) {
                    num++
                    Log.e("mll_______________10 ", n.toString()) //1,2,1,2,3
                } else
                    if (dd(n) > K) {
                        break
                    }
            }
        }
        Log.e("mll_10 ", num.toString())
        return num
    }

    private fun dd(s: String): Int {
        val of = hashSetOf<Int>()
        val substring = s.substring(0, s.length - 1)
        val split = substring.split(",")
        split.forEach {
            of.add(it.toInt())
        }
        return of.size
    }

    // 目前最优化的解题方法
    fun cc(): Int {
        val A: IntArray = intArrayOf(
            27,
            27,
            43,
            28,
            11,
            20,
            1,
            4,
            49,
            18,
            37,
            31,
            31,
            7,
            3,
            31,
            50,
            6,
            50,
            46,
            4,
            13,
            31,
            49,
            15,
            52,
            25,
            31,
            35,
            4,
            11,
            50,
            40,
            1,
            49,
            14,
            46,
            16,
            11,
            16,
            39,
            26,
            13,
            4,
            37,
            39,
            46,
            27,
            49,
            39,
            49,
            50,
            37,
            9,
            30,
            45,
            51,
            47,
            18,
            49,
            24,
            24,
            46,
            47,
            18,
            46,
            52,
            47,
            50,
            4,
            39,
            22,
            50,
            40,
            3,
            52,
            24,
            50,
            38,
            30,
            14,
            12,
            1,
            5,
            52,
            44,
            3,
            49,
            45,
            37,
            40,
            35,
            50,
            50,
            23,
            32,
            1,
            2
        )
//        val A: IntArray = intArrayOf(1,2,1,2,3)
        val K: Int = 20
//        val arrayListOf = arrayListOf<Int>()
//        A.forEach {
//            arrayListOf.add(it)
//        }

        var left = 0
        var right = K
        var hh = 0
        while (A.size - left >= K) {
//            val subList = arrayListOf.subList(l, r)
//            val ee = ee(subList, K)

            val ee = f(A, left, right, K )

            if (ee == K) {
                hh++
                if (right == A.size) {
                    left += 1
                    right = K + left
                } else {
                    right += 1
                }
            } else if (ee > K) {
                left += 1
                right = K + left
            } else if (ee < K) {
                right += (K - ee)
                if (right > A.size) {
                    left += 1
                    right = K + left
                }
            }
        }
        Log.e("mll____________ ", hh.toString())
        return hh
    }

    private fun f(a: IntArray, l: Int, r: Int, k: Int): Int {
        val of = hashSetOf<Int>()
        for (i in l..r - 1) {
            of.add(a[i])
            if (of.size > k) {
                return of.size
            }else if(of.size +(a.size-i) <k){
                return k-(of.size +i)
            }
        }
        return of.size
    }


}