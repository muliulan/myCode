package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/16
 **/
class Main115{

    fun search(nums: IntArray, target: Int): Int {

        var max=0
        nums.forEach {
            if(it==target){
                max++
            }
        }

        return max
    }

}