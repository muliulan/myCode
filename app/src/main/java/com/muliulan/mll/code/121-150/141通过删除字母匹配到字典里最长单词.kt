package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/9/14
 **/

class Main141 {

    fun findLongestWord(s: String, dictionary: List<String>): String {

        var st = ""

        dictionary.forEach {

            var l=0
            var r=0

            while (s.length>l && it.length>r){
                if(s[l]==it[r]){
                    r++
                }
                l++
            }
            if(l==it.length){
                st=if(it.length>st.length || (it.length==st.length && it < st)) it else st
            }
        }
        return st
    }
}