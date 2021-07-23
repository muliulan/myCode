package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/9
 **/

class Main110 {

    fun maxProfit(): Int {
        val prices: IntArray = intArrayOf(7, 1, 5, 3, 6, 4)
        var max = -999
        val intArray = IntArray(prices.size - 1)
        for (a in 1 until prices.size) {
            intArray[a - 1] = prices[a] - prices[a - 1]
        }

        if (intArray.size < 3) {
            var aa = 0
            intArray.forEach {
                max = Math.max(it, max)
                aa += it
            }
            return Math.max(Math.max(max, aa), 0)
        }

        max = intArray[0]
        for (a in 1 until intArray.size) {
            intArray[a] += Math.max(intArray[a - 1], 0)
            max = Math.max(intArray[a], max)
        }

        return Math.max(max, 0)
    }

}
