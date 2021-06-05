package com.muliulan.mll.code.`61-90`

import java.util.HashMap

class Main88 {

    //    [23,2,6,4,7]
//    13
    fun aa(): Boolean {
        val nums: IntArray = intArrayOf(3, 2, 4, 5)
        val k: Int = 1
//        for (a in 0 until nums.size) {
//            var aa = nums[a]
//            for (b in a + 1 until nums.size) {
//                aa += nums[b]
//                if (aa % k == 0) {
//                    return true
//                }
//
//            }
//        }

        val map = HashMap<Int, Int>()
        map[0] = -1
        var nnn = 0
        for (a in 0 until nums.size) {
            nnn = (nnn + nums[a]) % k
            if (map.containsKey(nnn)) {
                if (a - map[nnn]!! >= 2) {
                    return true
                }
            } else {
                map[nnn] = a
            }

        }

        return false
    }

//    fun bb(l: Int, r: Int, nums: IntArray): Int {
//        var num = 0
//        for (a in l until r) {
//            num += nums[a]
//        }
//        return num
//    }

}