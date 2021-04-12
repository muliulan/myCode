package com.muliulan.mll.code.`31-60`

import java.util.*

/**
描述:
zhaochenshuo
2021/4/12
 */

class Main53 {

    /**
     * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。

    注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。


    示例 1：
    输入：nums = [10,2]
    输出："210"
    示例 2：
    输入：nums = [3,30,34,5,9]
    输出："9534330"

    示例 3：
    输入：nums = [1]
    输出："1"

    示例 4：
    输入：nums = [10]
    输出："10"
     *
     * */

    fun aa(): String {

        val nums: IntArray = intArrayOf(3, 30, 34, 5, 9)

//        val arrayList = Array(nums.size) { "" }
//        for (a in 0 until nums.size) {
//            arrayList[a] = nums[a].toString()
//        }
//        Arrays.sort(arrayList) { a, b ->
//            (a + b).compareTo(b + a)
//        }
//        var aa=""
//        for(b in arrayList.size downTo 0){
//            aa+=arrayList[b]
//        }
//



        for(a in 0 until nums.size){
            for(b in 0 until nums.size){
                val toa = nums[a].toString()
                val tob = nums[b].toString()
                if(toa+tob>tob+toa){
                    val c=nums[a]
                    nums[a]=nums[b]
                    nums[b]=c
                }
            }
        }
        var aa=""
        for(b in 0 until nums.size){
            aa+=nums[b]
        }

        aa.forEach {
            if(it!='0'){
                return aa
            }
        }
        return "0"
    }


}