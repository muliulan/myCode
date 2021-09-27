package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/9/26
 **/
class Main148 {

    fun getSum(a: Int, b: Int): Int {

        var aa=a
        var bb =b
        while (b != 0) {
            val c= (aa and bb ) shl 1
            aa=aa xor bb
            bb=c
        }
        return aa
    }

}