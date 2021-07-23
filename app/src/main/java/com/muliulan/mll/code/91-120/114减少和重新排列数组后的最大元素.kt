package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/15
 **/

class Main114 {

    fun aa(): Int {

        val arr: IntArray = intArrayOf(2, 3, 4)
//        var max = 0
//        arr.forEach {
//            max = Math.max(it, max)
//        }
        arr.sort()
        arr[0] = 1
        for (a in 1 until arr.size) {
            if (Math.abs(arr[a] - arr[a - 1]) > 1) {
                arr[a] = arr[a - 1] + 1
            }
        }
        return arr[arr.size - 1]
    }

}