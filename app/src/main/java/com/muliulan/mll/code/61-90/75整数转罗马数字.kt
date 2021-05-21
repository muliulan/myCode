package com.muliulan.mll.code.`61-90`

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

/**
描述:
zhaochenshuo
2021/5/14
 */

class Main75 {


    /**
     * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。

    字符          数值
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

    通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
    所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
    给你一个整数，将其转为罗马数字。


    示例 1:
    输入: num = 3
    输出: "III"

    示例 2:
    输入: num = 4
    输出: "IV"

    示例 3:
    输入: num = 9
    输出: "IX"

    示例 4:
    输入: num = 58
    输出: "LVIII"
    解释: L = 50, V = 5, III = 3.

    示例 5:
    输入: num = 1994
    输出: "MCMXCIV"
    解释: M = 1000, CM = 900, XC = 90, IV = 4.
     *
     * */

    fun intToRoman(num: Int): String {


//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

//        1994
//        输出：
//        "MDCCCCLXXXXIV"
//        预期结果：
//        "MCMXCIV"

        val hashMap = TreeMap<Int, String>()
        hashMap[1] = "I"
        hashMap[5] = "V"
        hashMap[10] = "X"
        hashMap[50] = "L"
        hashMap[100] = "C"
        hashMap[500] = "D"
        hashMap[1000] = "M"
        val s1 = hashMap[num]
        if (s1 != null) {
            return s1
        }

        var p = num
        while (p != 0) {
            p = aa(hashMap, p)
        }

        return s
    }

    var s = ""
    var t = 1
    private fun aa(hashMap: TreeMap<Int, String>, num: Int): Int {
        hashMap.forEach {
            val key = it.key
            val ba = b(num)
            if (ba !=num) {
                return ba
            } else if (key == num) {
                s += it.value
                return 0
            } else if (key > num) {
                s += hashMap[t]
                return num - t
            }
            t = key
        }
        s += hashMap[1000]
        return num - 1000
    }

    private fun dd(hashMap: TreeMap<Int, String>, num: Int){
        num
    }


    private fun b(num: Int): Int {
        if (num >= 4 && num<5) {
            s += "IV"
            return num - 4
        }
        if (num >= 9&& num<10) {
            s += "IX"
            return num - 9
        }

        if (num >= 40&& num<50) {
            s += "XL"
            return num - 40
        }

        if (num >= 90&& num<100) {
            s += "XC"
            return num - 90
        }

        if (num >= 400&& num<500) {
            s += "CD"
            return num - 400
        }

        if (num >= 900&& num<1000) {
            s += "CM"
            return num - 900
        }
        return num
    }

}