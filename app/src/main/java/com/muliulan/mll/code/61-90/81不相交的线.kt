package com.muliulan.mll.code.`61-90`

import java.util.*

/**
描述:
zhaochenshuo
2021/5/21
 */

class Main81 {

    fun aa(): Int {
        val nums1: IntArray = intArrayOf(2, 5, 1, 2, 5)
        val nums2: IntArray = intArrayOf(10, 5, 2, 1, 5, 2)

        val arrayList = ArrayList<ArrayList<Int>>()

        nums1.forEach {
            arrayList.add(ArrayList<Int>())
        }

        for (a in 0 until nums1.size) {
            for (b in 0 until nums2.size) {
                val i = nums2[b]
                if (nums1[a] == i) {
                    arrayList[a].add(b)
                }
            }
        }

        var num = 0
        var s = 0
        arrayList.forEach {
            it.forEach {

            }

        }

        val array = Array<IntArray>(nums1.size + 1) {
            IntArray(nums2.size + 1)
        }
        for (a in 1..nums1.size) {
            val ai = nums1[a - 1]
            for (b in 1..nums2.size) {
                val bi = nums2[b - 1]
                if (ai == bi) {
                    array[a][b] = array[a-1][b-1] + 1
                } else {
                    array[a][b] = Math.max(array[a][b - 1], array[a - 1][b])
                }
            }
        }
        return array[nums1.size][nums2.size]
    }

}