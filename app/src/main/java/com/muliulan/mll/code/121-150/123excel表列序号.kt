package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/7/30
 **/
class Main123 {

    fun aa(): Int {
        val columnTitle: String = "AA"
        val num = 'A'.toInt() - 1
        val length = columnTitle.length

        var aaa = 0
        var size = 1
        for (a in length-1 downTo 0) {
            val toInt = columnTitle[a].toInt()- num
            if (size == 1) {
                aaa = toInt
            } else {
                aaa +=  toInt*size
            }
            size*=26
        }


        return aaa
    }

}