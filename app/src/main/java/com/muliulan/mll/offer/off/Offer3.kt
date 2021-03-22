package com.muliulan.mll.offer.off

import android.util.Log
import com.muliulan.mll.offer.Text

/**
描述:
zhaochenshuo
2021/2/8
 */

class Offer3 {

    /**
     * 输入个链表的头结点，从尾到头反过来打印出每个结点的值。
     *
     * */
    fun aa() {
        var text = Text(0)
        val text1 = Text(1)
        val text2 = Text(2)

        text.t = text1
        text1.t = text2

        var one: Text? = text
        while (one != null) {
            Log.e("mll_one", one.a.toString())
            one = one.t
        }
        Log.e("mll_one", "____________________________________")
        text = dd(text)
        Log.e("mll_one", "____________________________________")
        var two: Text? = text
        while (two != null) {
            Log.e("mll_two", two.a.toString())
            two = two.t
        }
    }

    private fun dd(text: Text): Text {
        var p = text
        var c = text.t
        var t: Text?
        while (c != null) {
            t = c.t
            c.t = p

            p = c
            c = t
        }
        text.t = null

        return p
    }
}