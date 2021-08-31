package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/8/31
 **/
class Main136 {

    fun corpFlightBookings(bookings: Array<IntArray>, n: Int): IntArray {

        val intArray = IntArray(n)


        bookings.forEach {

            val i = it[0]
            val i1 = it[1]
            val i2 = it[2]
            for(a in i..i1){
                intArray[a-1]+=i2
            }
        }
        return intArray
    }
}