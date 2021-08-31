package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/8/26
 **/
class Main135 {

    fun numRescueBoats(people: IntArray, limit: Int): Int {


        var l = 0
        var r = people.size - 1
        people.sort()
        var num = 0
        while (l <= r) {
            if (limit >= people[l] + people[r]) {
                l++
            }
            r--
            num++
        }
        return num
    }

}