package com.muliulan.mll.offer.off

import android.util.Log

/**
描述:
zhaochenshuo
2021/2/8
 */

class Offer6 {

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾， 我们称之数组的旋转。输入一个递增排序的数组的一个旋转， 输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2 ｝为｛ 1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * */
    fun aa() {

        val intArrayOf = intArrayOf(3, 4, 5, 1, 2,3)

        var l = 0
        var r = intArrayOf.size - 1
        var n: Int

        while (intArrayOf[l] >= intArrayOf[r]) {

            if (r - l == 1) {
                Log.e(
                    "mllqqqq",
                    if (intArrayOf[r] > intArrayOf[l]) intArrayOf[l].toString() else intArrayOf[r].toString()
                )
            }

            n = l + (r - l) / 2
            if (intArrayOf[n] == intArrayOf[l] && intArrayOf[n] == intArrayOf[r]) {
                Log.e("mllwww", intArrayOf[n].toString())
            }
            if (intArrayOf[l] <= intArrayOf[n]) {
                l = n
            } else if (intArrayOf[r] >= intArrayOf[n]) {
                r = n
            }


        }

    }

}