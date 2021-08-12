package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/8/10
 **/
class Main128 {
    fun aa(): Int {
        val nums: IntArray = intArrayOf(1, 2, 3, 4)
        var num = 0
        for (a in 0 until nums.size - 2) {
            var size = 2
            var cha = -9999
            for (b in a + 1 until nums.size) {
                val i = nums[b - 1]
                val i1 = nums[b]
                if (cha == -9999) {
                    cha = (i1 - i)
                } else {
                    if ((i1 - i) == cha) {
                        size++
                    } else {
                        break
                    }

                    if (size >= 3) {
                        num++
                    }
                }
            }
        }
        return num
    }

}