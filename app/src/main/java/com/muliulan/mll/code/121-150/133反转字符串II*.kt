package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/8/20
 **/

class Main133 {


    /**
    给定一个字符串 s 和一个整数 k，从字符串开头算起，每 2k 个字符反转前 k 个字符。
    如果剩余字符少于 k 个，则将剩余字符全部反转。
    如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。

    示例 1：
    输入：s = "abcdefg", k = 2
    输出："bacdfeg"
     *
     * **/

    fun reverseStr(s: String, k: Int): String {

        var a = 0
        val arr = s.toCharArray()
        while (a < s.length) {
            aa(arr, a, Math.min(a + k, arr.size) - 1)
            a += 2 * k
        }
        return String(arr)
    }

    private fun aa(arr: CharArray, ll: Int, rr: Int) {
        var l = ll
        var r = rr
        while (l < r) {
            val cl = arr[l]
            arr[l] = arr[r]
            arr[r] = cl
            l++
            r--
        }
    }


}