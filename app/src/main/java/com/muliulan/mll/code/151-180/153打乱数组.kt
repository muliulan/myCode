package com.muliulan.mll.code


/**
 *    @author : zhaoCS
 *    date    : 2021/11/222:41 下午
 *    desc    :
 */

class Main153(nums: IntArray) {

    private val mNums1 = nums
    private val list = java.util.ArrayList<Int>()


    fun reset(): IntArray {
        val intArray = IntArray(list.size)
        for (a in 0 until list.size) {
            intArray[a] = list[a]
        }
        return intArray
    }

    fun shuffle(): IntArray {
        if (list.size == 0) {
            mNums1.forEach {
                list.add(it)
            }
        }

        for (a in 0 until mNums1.size) {
            for (b in 0 until mNums1.size) {
                val ma = mNums1[a]
                val mb = mNums1[b]

                mNums1[a] = mb
                mNums1[b] = ma
            }
        }
        return mNums1
    }


}
