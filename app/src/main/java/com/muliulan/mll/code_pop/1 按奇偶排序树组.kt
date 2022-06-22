package com.muliulan.mll.code_pop

/**
 *    @author : zhaoCS
 *    date    : 2022/4/28 11:19 上午
 *    desc    :
 */
class Pop1 {


    fun sortArrayByParity(nums: IntArray): IntArray {

        val mm = IntArray(nums.size)

        var l = 0
        var r = nums.size - 1

        nums.forEach {
            if (it % 2 == 0) {
                mm[l++] = it
            } else {
                mm[r--] = it
            }
        }
        return mm

    }

}

