package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/12
 **/
class Main112 {

    fun aa(): Int {

        val citations: IntArray = intArrayOf(0, 1, 3, 5, 6)

        val n = citations.size
        var l = 0
        var r = n - 1
        while (l <= r) {
            /**
             * 找到范围内的中间点i
             * 则有n-i篇至少 citations[i]次
             *
             *
             * */
            val i = l + (r - l) / 2
            if (citations[i] >= n - i) {
                r = i - 1
            } else {
                l = i + 1
            }
        }
        return n - l
    }

}