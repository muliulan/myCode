package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/23
 **/
class Main119 {

    fun isCovered(ranges: Array<IntArray>, left: Int, right: Int): Boolean {

//        var (a, b) = aaa(ranges, left, right)


        val intArray = IntArray(1111)
        ranges.forEach {
            val i = it[0]
            val i1 = it[1]
            for (a in i..i1) {
                intArray[a] = 1
            }
        }


        for (a in left..right) {
            if(intArray[a]!=1){
                return false
            }
        }

        return true
    }


}