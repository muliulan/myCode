package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/9/15
 **/
class Main142{

    fun findPeakElement(nums: IntArray): Int {
        var index=0

        for(a in 0 until nums.size){
            if(nums[a] > nums[index]){
                index=a
            }
        }
        return index
    }

}