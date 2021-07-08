package com.muliulan.mll.code.`91-120`

import java.util.*

/**
name: zhaochenshuo
Date: 2021/7/8
 **/

class Main108 {

    fun isValid(s: String): Boolean {
        if (s.length % 2 != 0) {
            return false
        }
        val linkedList = LinkedList<Char>()
        s.forEach {
            if (it == '(' || it == '{' || it == '[') {
                linkedList.push(it)
            } else {
                if (linkedList.isEmpty()) {
                    return false
                }
                val pop = linkedList.pop()
                val b = (it == ')' && pop == '(') || (it == '}' && pop == '{') || (it == ']' && pop == '[')
                if (!b) {
                    return false
                }
            }
        }
        return linkedList.isEmpty()
    }

}