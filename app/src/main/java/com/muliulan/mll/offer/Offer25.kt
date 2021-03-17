package com.muliulan.mll.offer

import android.util.Log

/**
描述:
zhaochenshuo
2021/3/1
 */

class Offer25 {


    /**
    输入一个字符串，打印出该字符串中字符的所有排列。例如输入字符串abc。则打印出由字符a、b、c 所能排列出来的所有字符串abc、acb、bac 、bca、cab 和cba 。
     * */

    val s = "abc"
    fun aa( ) {

        val toCharArray = s.toCharArray()
        bb(toCharArray,0)
    }

    fun bb(toCharArray: CharArray, b: Int) {
        if (b + 1 == s.length) {
            Log.e("mll2525   ", String(toCharArray))
            return
        }

        for (aa in b until toCharArray.size) {
            val a = toCharArray[b]
            toCharArray[b] = toCharArray[aa]
            toCharArray[aa] = a
            bb(toCharArray, b + 1)
        }

    }
}