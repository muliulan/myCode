package com.muliulan.mll.offer.off

import android.util.Log

/**
描述:
zhaochenshuo
2021/3/3
 */

class Offer33 {


    /**
     * 在数组中的两个数字如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。

    举例分析

    例如在数组｛7, 5, 6, 4 中， 一共存在5 个逆序对，分别是（7, 6）、（7，5），(7, 4）、（6, 4）和（5, 4）。
     *
     * */


    fun aa(){

        val arrayOf = arrayOf(7, 5, 6, 4)
        var start=0
        var num=0

        while (start<=arrayOf.size-2){
            num=arrayOf[start]
            for(a in start+1 until arrayOf.size){
                val i = arrayOf[a]
                if(num>i){
                    Log.e("mllddd", "$num   $i")
                }
            }
            start++
        }


    }


}