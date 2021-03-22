package com.muliulan.mll.offer.off

/**
描述:
zhaochenshuo
2021/3/2
 */

class Offer26 {

    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * */


    fun aa(): Int {
        val arrayOf = arrayOf(1, 2, 3, 2, 2, 2, 5, 4, 2)
        var count = 1

        var num = arrayOf[0]

        for (a in 1 until arrayOf.size) {

            if (arrayOf[a] == num) {
                count++
            } else {
                count--
            }

            if (count == 0) {
                count = 1
                num = arrayOf[a]
            }
        }

        count = 0
        arrayOf.forEach {
            if (num == it) {
                count++
            }
        }

        return if (count > arrayOf.size / 2) {
            num
        } else {
            0
        }

    }

}