package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/8/17
 **/
class Main131 {

    fun checkRecord(s: String): Boolean {

        var a=0
        var l=0
        s.forEach {
            if(it=='A'){
                a++
            }
            if(a>=2){
                return false
            }
            if(it=='L'){
                l++
            }else{
                l=0
            }
            if(l>=3){
                return false
            }
        }
        return true
    }

}