package com.muliulan.mll.code.`121-150`

import java.util.*

/**
name: zhaochenshuo
Date: 2021/8/19
 **/

class Main132() {


    fun reverseVowels(s: String): String {

//        a、e、i、o、u 元音


        val toCharArray = s.toCharArray()
        val linkedList = LinkedList<Char>()


        toCharArray.forEach { c ->
            if (aa(c)) {
                linkedList.push(c)
            }
        }

        for (a in 0 until toCharArray.size) {
            val c = toCharArray[a]
            if (aa(c)) {
                toCharArray[a] = linkedList.pop()
            }
        }
        var a = ""
        toCharArray.forEach {
            a += it
        }
        return a
    }

    fun aa(c: Char): Boolean = c in "AEOIUaeiou"

}