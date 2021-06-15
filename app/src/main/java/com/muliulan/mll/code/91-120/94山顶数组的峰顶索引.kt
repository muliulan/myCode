package com.muliulan.mll.code.`91-120`

class Main94 {


    fun aa(arr: IntArray): Int {
        var c=arr[0]
        for(a in 1 until arr.size){
            if(arr[a]<c){
                return a-1
            }
            c=arr[a]
        }
        return -1
    }

}