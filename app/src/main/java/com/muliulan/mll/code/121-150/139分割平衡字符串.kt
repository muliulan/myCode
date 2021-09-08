package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/9/7
 **/

class Main139{

    fun balancedStringSplit(s: String): Int {

        var r=0
        var l=0
        var num=0
        s.forEach {
            if(it=='R'){
                r++
            }
            if(it=='L'){
                l++
            }
            if(r==l){
                num++
            }
        }
        return num
    }

}