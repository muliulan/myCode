package com.muliulan.mll.offer.off

import com.muliulan.mll.offer.Text

/**
描述:
zhaochenshuo
2021/2/24
 */

class Offer13 {

    /**
     * 定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。
     * */
    fun aa() {

        val text = Text(1)


        var p = text
        var c = text.t
        var t: Text? = null
        while (c != null) {
            t = c.t
            c.t = p
            p = c
            c = t
        }

        text.t=null

    }
}