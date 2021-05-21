package com.muliulan.mll.code.`61-90`

/**
描述:
zhaochenshuo
2021/5/15
 */

class Main76 {

    /**
     * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。

    字符          数值
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

    通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
    给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。


    示例 1:
    输入: "III"
    输出: 3

    示例 2:
    输入: "IV"
    输出: 4

    示例 3:
    输入: "IX"
    输出: 9

    示例 4:
    输入: "LVIII"
    输出: 58
    解释: L = 50, V= 5, III = 3.

    示例 5:
    输入: "MCMXCIV"
    输出: 1994
    解释: M = 1000, CM = 900, XC = 90, IV = 4.
     *
     * */

    fun aa(): Int {
        val s: String="LVIII"
        val hashMap = HashMap<String, Int>()
        hashMap["I"] = 1
        hashMap["V"] = 5
        hashMap["X"] = 10
        hashMap["L"] = 50
        hashMap["C"] = 100
        hashMap["D"] = 500
        hashMap["M"] = 1000

        hashMap["IV"] = 4
        hashMap["IX"] = 9
        hashMap["XL"] = 40
        hashMap["XC"] = 90
        hashMap["CD"] = 400
        hashMap["CM"] = 900

        /**
         * "MCMXCIV"
        输出：
        2014
        预期结果：
        1994
         * */

        var num = 0
        var a = 0
        while (a < s.length) {
            if (a + 1 < s.length) {
                val s1 = s[a].toString() + s[a + 1]
                if (hashMap[s1] != null) {
                    num += hashMap[s1]!!
                    a += 2
                } else {
                    num += hashMap[s[a].toString()]!!
                    a++
                }
            } else {
                num += hashMap[s[a].toString()]!!
                a++
            }
        }
        return num
    }

}