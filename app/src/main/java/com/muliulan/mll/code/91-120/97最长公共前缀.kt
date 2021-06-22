package com.muliulan.mll.code.`91-120`

class Main97 {

    fun aa(): String {

        val strs: Array<String> = arrayOf("flower", "flow", "flight")
        var s = strs[0]
        for (a in 1 until strs.size) {

            val s1 = strs[a]
            val ls = Math.min(strs[a].length, s.length)
            var index = 0
            while (index < ls && s1[index] == s[index]) {
                index++
            }
            s = s.substring(0, index)

        }
        return s
    }

}