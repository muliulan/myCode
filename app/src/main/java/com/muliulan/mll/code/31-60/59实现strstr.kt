package com.muliulan.mll.code.`31-60`

/**
描述:
zhaochenshuo
2021/4/20
 */

class Main59 {
    /**
     * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。

    说明：
    当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
    对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。

     

    示例 1：
    输入：haystack = "hello", needle = "ll"
    输出：2

    示例 2：
    输入：haystack = "aaaaa", needle = "bba"
    输出：-1

    示例 3：
    输入：haystack = "", needle = ""
    输出：0
     *
     * */
    fun aa(haystack: String, needle: String): Int {
        if (haystack.length == 0 && needle.length == 0) {
            return 0
        }

        if (haystack.length == 0) {
            return -1
        }

        if (needle.length == 0) {
            return 0
        }
        var bb: String = ""
        val indexOf = haystack.indexOf(needle[0])
        for (a in 0 until haystack.length - needle.length + 1) {
            if (haystack[a] == needle[0]) {
                bb = haystack
                if (bb.substring(a, a + needle.length) == needle) {
                    return a
                }
            }
        }
        return -1
    }

}