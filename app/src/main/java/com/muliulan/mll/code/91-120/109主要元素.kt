package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/9
 **/


class Main109 {

    fun aa(): Int {
        val nums: IntArray = intArrayOf(3, 2, 3)
        val hashMap = HashMap<Int, Int>()
        nums.forEach {
            if (hashMap.containsKey(it)) {
                hashMap[it] = hashMap[it]!! + 1
            } else {
                hashMap[it] = 1
            }
        }
        val a = nums.size / 2
        var num = -1
        hashMap.forEach {
            if (it.value > a) {
                num = it.key
            }
        }
        return num
    }

}