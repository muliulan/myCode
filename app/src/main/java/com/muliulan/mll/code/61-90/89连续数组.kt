package com.muliulan.mll.code.`61-90`

import java.util.*

class Main89 {

    fun a():Int{
        val nums: IntArray = intArrayOf(1, 1, 1, 0, 1, 0, 1, 1)

        var max=0
        var con=0
        val hashMap = HashMap<Int, Int>()
        hashMap[0]=-1
        for(a in 0 until nums.size){
            val i = nums[a]
            if(i==1){
                con++
            }else{
                con--
            }
            if(hashMap.containsKey(con)){
                max=Math.max(max,a- hashMap[con]!!)
            }else{
                hashMap[con] = i
            }
        }
        return max
    }



    fun aa(): Int {
        val nums: IntArray = intArrayOf(1, 1, 1, 0, 1, 0, 1, 1)
        val intArray = IntArray(nums.size + 1)

        for (a in 0 until nums.size) {
            val i = nums[a]
            if (i == 0) {
                intArray[a + 1] = intArray[a] + (intArray[a + 1] - 1)
            }
            if (i == 1) {
                intArray[a + 1] = intArray[a] + (intArray[a + 1] + 1)
            }
        }

        var num = 0
        for (a in 0 until intArray.size) {
            val ai = intArray[a]
            for (b in intArray.size - 1 downTo a) {
                val bi = intArray[b]
                if (ai == bi) {
                    num = Math.max(b - a, num)
                }
            }
        }
        return num
    }


}