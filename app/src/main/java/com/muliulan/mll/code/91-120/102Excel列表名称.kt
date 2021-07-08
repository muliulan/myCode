package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/6/29
 **/

class Main102 {

    fun aa(): String {
        val columnNumber: Int = 701
        val stringBuffer = StringBuffer()
        if (columnNumber <= 26) {
            stringBuffer.append((columnNumber + 'A'.toInt() - 1).toChar())
        } else {
            var num = columnNumber
            while (num > 0) {
                num--
                stringBuffer.append(((num % 26) + 'A'.toInt()).toChar())
                num /= 26
            }
        }
        return stringBuffer.reverse().toString()
    }

}

