package com.muliulan.mll.code.`121-150`

import java.util.*
import kotlin.collections.HashSet

/**
name: zhaochenshuo
Date: 2021/8/9
 **/

class Main127 {

    fun nthSuperUglyNumber(n: Int, primes: IntArray): Int {
        val seen = HashSet<Long>()
        //最小顶堆  会自动排序   每次heap.poll()返回的都是最小值
        val heap = PriorityQueue<Long>()
        var num=0

        seen.add(1)
        heap.add(1)

        for(a in 0 until n){
            val poll = heap.poll()
            num= poll.toInt()
            primes.forEach {
                val l = poll * it
                if(seen.add(l)){
                    heap.add(l)
                }
            }
        }

        return num
    }

}