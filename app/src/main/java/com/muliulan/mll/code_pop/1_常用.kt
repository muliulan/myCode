package com.muliulan.mll.code_pop

import android.util.Log

/**
 *    @author : zhaoCS
 *    date    : 2022/4/28 11:45 上午
 *    desc    :
 */
class Cy {

    val list = arrayListOf<Int>(5, 1, 3, 4, 2)
    val list1 = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7)

    fun aa() {
        Log.e("mll", a6().toString())
    }

    //1 冒泡
    fun a1() {
        for (a in list.size - 1 downTo 0) {
            for (b in 0 until a) {
                if (list[b] > list[b + 1]) {
                    val l = list[b]
                    list[b] = list[b + 1]
                    list[b + 1] = l
                }
            }
        }
        list.forEach {
            Log.e("mll", it.toString())
        }

    }

    //2 快排
    fun a2() {
        for (a in 0 until list.size) {
            var index = a
            for (b in index + 1 until list.size) {
                if (list[index] > list[b]) {
                    index = b
                }

            }
            if (index != a) {
                val l = list[index]
                list[index] = list[a]
                list[a] = l
            }
        }
        list.forEach {
            Log.e("mll", it.toString())
        }
    }

    //3 二分
    fun a3(m: Int): Int {
        var l = 0
        var r = list1.size - 1

        while (l < r) {
            val index = (l + r) / 2
            if (list1[index] > m) {
                r--
            } else if (list1[index] < m) {
                l++
            } else if (list1[index] == m) {
                return index
            }
        }
        return -1
    }

    //4 分治
    fun a4(num: Int, one: Int, two: Int, three: Int) {
        //汉诺塔
        if (num == 1) {
            Log.e("mll", "移动第$num 个 从$one 到 $three")
        } else {
            a4(num - 1, one, three, two)
            Log.e("mll", "移动第$num 个 从$one 到 $three")
            a4(num - 1, two, one, three)
        }


    }

    //5 kmp
    fun a5(): Int {
        //对比两个字符串是否有相同的(暴力解法)
        val a = "dawdwadfgvcbvctyerafhtr"
        val b = "fgvcbvctyer"
        var i = 0
        var j = 0
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                i++
                j++
            } else {
                i = i - j + 1 //指针向后移动一位
                j = 0
            }
        }
        if (j == b.length) {
            return i - j
        }
        return -1
    }

    // 6贪心算法
    fun a6() {
        //假设1元、2元、5元、10元、20元、50元、100元的纸币，张数不限制，现在要用来支付K元，至少要多少张纸币

        val intArrayOf = intArrayOf(1, 2, 5, 10, 20, 50, 100)
        var num = 103//支付的钱数

        for (a in intArrayOf.size - 1 downTo 0) {

            val i = num / intArrayOf[a]
            val i1 = num % intArrayOf[a]
            num = i1
            if (num >= 0) {
                Log.e("mll", "${intArrayOf[a]}元的需要$i 张")
            }

        }


    }

    //7普里姆算法(最小生成树)
    fun a7() {

    }


    fun a8() {}


}