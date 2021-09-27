package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/9/23
 **/
class Main146 {

    fun isPowerOfThree(n: Int): Boolean {
        var a = n
        while (a % 3 == 0) {


            a /= 3
        }

        return a == 1

    }


}