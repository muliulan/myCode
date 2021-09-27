package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/9/10
 **/
class Main140 {

    fun chalkReplacer(chalk: IntArray, k: Int): Int {

        var index = 0
        var num = k
        while (true) {
            num -= chalk[index]
            if(num<0){
                return index
            }
            if (index == chalk.size - 1) {
                index = 0
            } else {
                index++
            }
        }
        return index
    }


}