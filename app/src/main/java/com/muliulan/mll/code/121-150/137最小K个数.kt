package com.muliulan.mll.code.`121-150`

import java.util.*


/**
name: zhaochenshuo
Date: 2021/9/3
 **/
class Main137{

    fun smallestK(arr: IntArray, k: Int): IntArray {


        val intArray = IntArray(k)
        Arrays.sort(arr)
        for(a in 0 until k){
            intArray[a]=arr[a]
        }

        return  intArray
    }

}