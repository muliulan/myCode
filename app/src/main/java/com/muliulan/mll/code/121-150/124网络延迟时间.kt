package com.muliulan.mll.code.`121-150`

import java.util.*

/**
name: zhaochenshuo
Date: 2021/8/2
 **/
class Main124 {
    fun networkDelayTime(): Int {

        val times = ArrayList<IntArray>()
        times.add(intArrayOf(2, 1, 1))
        times.add(intArrayOf(2, 3, 1))
        times.add(intArrayOf(3, 4, 1))
        val n = 4
        val k = 2


        val hashMap = HashMap<Int, ArrayList<Int>>()


        times.forEach {
            val a = it[0]
            val b = it[1]
            val c = it[2]

            val arrayList = if (hashMap.containsKey(a)) {
                hashMap[a]
            } else {
                ArrayList<Int>()
            }
            arrayList?.add(b)
            hashMap[a] = arrayList!!
        }



        return 1
    }
}