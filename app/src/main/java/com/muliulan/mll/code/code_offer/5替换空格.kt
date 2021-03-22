package com.muliulan.mll.code.code_offer

/**
描述:
zhaochenshuo
2021/3/19
 */

class Off5() {


    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

    示例 1：
    输入：s = "We are happy."
    输出："We%20are%20happy."

     * */


    fun aa(): String {
        val s: String = ""

        val toCharArray = s.toCharArray()
        val stringBuffer = StringBuffer()
        for (a in 0 until s.length) {

            if (toCharArray[a] == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(toCharArray[a]);
            }

        }
        return stringBuffer.toString()
    }
}