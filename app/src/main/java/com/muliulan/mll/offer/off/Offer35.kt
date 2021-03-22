package com.muliulan.mll.offer.off

import android.util.Log

/**
描述:
zhaochenshuo
2021/3/3
 */

class Offer35 {


    /**
     * 统计一个数字：在排序数组中出现的次数。

    举例说明

    例如输入排序数组｛ 1, 2, 3, 3, 3, 3, 4, 5｝和数字3 ，由于3 在这个数组中出现了4 次，因此输出4 。
     *
     * */

    fun aa() {
        val arrayOf = arrayOf(1, 2, 2, 3, 3, 3, 4, 5)
        val k = 3

        var l = 0
        var r = arrayOf.size - 1
        var z = 0
        while (true) {
            z = (l + (r - l)) / 2
            val i = arrayOf[z]
            if (i < k) {
                l++
            } else if (i > k) {
                r--
            } else if (i == k) {

                var nn = 1
                while (arrayOf[k - nn] == k) {
                    nn++
                }
                l = k - nn+1

                nn = 1
                while (arrayOf[k + nn] == k) {
                    nn++
                }
                r = k + nn-1
                Log.e("mllllll","$l    $r")
                return
            }


        }

    }

}