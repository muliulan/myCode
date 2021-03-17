package com.muliulan.mll.offer

import android.util.Log

/**
描述:
zhaochenshuo
2021/2/24
 */

class Offer11 {


    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位予数组的后半部分。
     * */

    fun aa() {

        val arra = arrayOf(1, 4, 3, 2, 1)


        var l = 0
        var r = arra.size - 1

        while (r > l) {

            while (r > l && arra[l] % 2 != 0) {
                l++
            }
            while (r > l && arra[r] % 2 == 0) {
                r--
            }
            val a = arra[l]
            arra[l] = arra[r]
            arra[r] = a

            var b = ""
            arra.forEach {
                b += it
            }
            Log.e("mllzz", b.toString())

        }


    }


}