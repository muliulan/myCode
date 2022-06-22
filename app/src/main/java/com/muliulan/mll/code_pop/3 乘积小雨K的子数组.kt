package com.muliulan.mll.code_pop

/**
 *    @author : zhaoCS
 *    date    : 2022/5/5 10:20 上午
 *    desc    :
 */
class Pop3 {

    fun aa(): Int {
        val nums: IntArray = intArrayOf(10, 5, 2, 6)
        val k: Int = 100

        var l = 0
        var r = 0
        var product = 1
        var cnt = 0

        while (r < nums.size) {
            product *= nums[r++]
            while (l < r && product >= k) {
                product /= nums[l++]
            }
            cnt += (r - l)
        }
        return cnt
    }

}
