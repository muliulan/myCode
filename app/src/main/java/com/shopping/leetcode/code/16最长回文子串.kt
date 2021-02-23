package com.shopping.leetcode.code

/**
描述:
zhaochenshuo
2021/2/20
 */

class Main16() {
    /**
     *
     * 给你一个字符串 s，找到 s 中最长的回文子串。

    示例 1：
    输入：s = "babad"
    输出："bab"
    解释："aba" 同样是符合题意的答案。
     * */
    fun aa(): String {

        val s: String = "cbbd"

        if (s.length == 1) {
            return s
        }
        val toCharArray = s.toCharArray()

        if (s.length == 2) {
            return if (toCharArray[0] == toCharArray[1]) {
                s
            } else {
                toCharArray[0].toString()
            }
        }

        var ma = ""
        for (a in 1 until toCharArray.size) {
            val bb = bb(s, a, toCharArray)
            if (bb.length > ma.length) {
                ma = bb
            }
        }

        return ma
    }

    fun bb(s: String, a: Int, charArray: CharArray): String {

        var l = a - 1

        var r = if (a == s.length - 1) {
            a
        } else {
            a + 1
        }

        val c = charArray[a]
        val c1 = charArray[l]
        val c2 = charArray[r]
        if (c1 == c) {
            r = a
        }
        if (c2 == c && a != r) {
            l = a
        }

        var iss = false
        while (l >= 0 && r < charArray.size) {
            if (charArray[l] != charArray[r]) {
                if (r - l == 1) {
                    return s.substring(l-1, r )
                } else if (iss) {
                    return s.substring(l + 1, r - 1)
                }
                return s.substring(l, r)

            }
            iss = true
            l--
            r++
        }

        l = if (l < 0) 0 else l
        r = if (r >= charArray.size) charArray.size - 1 else r

        return s.substring(l, r)
    }
}