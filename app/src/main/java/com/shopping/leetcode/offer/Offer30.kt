package com.shopping.leetcode.offer

import android.util.Log
import java.util.*

/**
描述:
zhaochenshuo
2021/3/2
 */

class Offer30 {

    /**
     * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
     * */


    fun aa() {

        val arrayOf = arrayOf(3, 1, 2)
        val array = Array<String>(arrayOf.size) {
            ""
        }

        for (a in 0 until arrayOf.size) {
            array[a] = arrayOf[a].toString()
        }

        Arrays.sort(array) { s1, s2 ->
            (s1 + s2).compareTo(s2 + s1)
        }
        array.forEach {
            Log.e("mllll",it.toString())
        }


    }
}