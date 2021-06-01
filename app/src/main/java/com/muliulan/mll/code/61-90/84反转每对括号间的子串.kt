package com.muliulan.mll.code.`61-90`

import java.util.*

/**
描述:
zhaochenshuo
2021/5/26
 */

class Main84 {


    /**
     *  输入：s = "(ed(et(oc))el)"
     * 输出："leetcode"
     *
     * (ed(et(oc))el)1
     * (ed(et(co))el)2
     * (ed((oc)te)el)3
     * (le(et(co))de)4
     *
     *0 13  3 10 69
     *
     *
     * "taawsu"
    预期结果：
    "tauswa"
     * */

    fun aa(): String? {
        val s = "(ed(et(oc))el)"
//        val s = "ta()usw((((a))))"
        val linkedList = LinkedList<String>()
        val stringBuffer = StringBuffer()

        for (a in 0 until s.length) {
            val c = s[a]
            if (c == '(') {
                linkedList.push(stringBuffer.toString())
                stringBuffer.setLength(0)
            } else if (c == ')') {
                stringBuffer.reverse()
                stringBuffer.insert(0, linkedList.pop())
            } else {
                stringBuffer.append(c)
            }

        }


        return stringBuffer.toString()
    }


    fun am(): String? {
        val s = "ta()usw((((a))))"
        var l = 0
        var r = s.length - 1
        val linkedList = LinkedList<Int>()
        while (r > l) {
            if (s[l] != '(') {
                l++
            }
            if (s[r] != ')') {
                r--
            }
            if (s[l] == '(' && s[r] == ')') {
                linkedList.push(l)
                linkedList.push(r)
                l++
                r--
            }
        }

        l = -999
        r = -999
        val stringBuffer = StringBuffer(s)
        while (!linkedList.isEmpty()) {
            val pop = linkedList.pop()
            if (r < 0) {
                r = pop
            } else if (l < 0) {
                l = pop
            }
            if (r > 0 && l >= 0) {
                val substring = stringBuffer.toString().substring(l + 1, r)
                var sub = bb(substring)
                stringBuffer.replace(l + 1, r, sub)
                l = -999
                r = -999
            }

        }
        var sss = ""
        stringBuffer.toString().forEach {
            val aa = if (it == '(') {
                ""
            } else if (it == ')') {
                ""
            } else {
                it.toString()
            }
            sss += aa
        }

        return stringBuffer.toString()
    }

    fun bb(s: String): String {
        var ass = ""
        for (a in s.length - 1 downTo 0) {
            val sss = if (s[a] == '(') {
                ')'
            } else if (s[a] == ')') {
                '('
            } else {
                s[a]
            }
            ass += sss
        }
        return ass
    }


}