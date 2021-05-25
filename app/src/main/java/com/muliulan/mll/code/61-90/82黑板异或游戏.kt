package com.muliulan.mll.code.`61-90`

/**
描述:
zhaochenshuo
2021/5/22
 */

class Main82 {


    fun aa(nums: IntArray): Boolean {

        if (nums.size % 2 == 0) {
            return true
        }

        var a = 0
        nums.forEach {

            a = a xor it
        }
        return a == 0
    }

}