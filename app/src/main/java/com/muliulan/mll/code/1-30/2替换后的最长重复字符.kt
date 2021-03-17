package com.muliulan.mll.code.`1-30`

import android.text.TextUtils
import java.util.*


/**
描述:
zhaochenshuo
2021/2/2
 */

class Main2() {

    /**
    给你一个仅由大写英文字母组成的字符串，你可以将任意位置上的字符替换成另外的字符，总共可最多替换 k 次。在执行上述操作后，找到包含重复字母的最长子串的长度。
    注意：字符串长度 和 k 不会超过 104。

    示例 1：
    输入：s = "ABAB", k = 2
    输出：4
    解释：用两个'A'替换为两个'B',反之亦然。
    示例 2：

    输入：s = "AABABBA", k = 1
    输出：4
    解释：
    将中间的一个'A'替换为'B',字符串变为 "AABBBBA"。
    子串 "BBBB" 有最长重复字母, 答案为 4。*/

    fun aa(): Int {
        val s = "ABABddBBB"
        val k = 1

        var l = 0
        var r = 1 + k
        var length = 0

        while (length < s.length - l) {
            val substring = s.substring(l, r)
            val bb = bb(substring)
            if (bb < k + 1 || substring.length <= length) {
                if (substring.length > length) {
                    length = substring.length
                }
                if (r < s.length) {
                    r++
                    continue
                }
            }
            l++
        }
        return length
    }

    // 吧字符串中 重复数值最多的字符去掉 还剩多长
    private fun bb(string: String): Int {
        if (TextUtils.isEmpty(string)) {
            return 0
        }

        val toCharArray = string.toCharArray()
        val arrayList = ArrayList<Char>()
        toCharArray.forEach {
            arrayList.add(it)
        }
        arrayList.sort()

        var a = arrayList[0]
        var b = 0
        var c = 0
        arrayList.forEach {
            if (a == it) {
                b++
            } else {
                if (b > c) {
                    c = b
                }
                b = 1
            }
            a = it
        }
        if (c < b) {
            c = b
        }
        return toCharArray.size - c
    }

}