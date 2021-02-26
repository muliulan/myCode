package com.shopping.leetcode.offer

/**
描述:
zhaochenshuo
2021/2/24
 */

class Offer14 {

    /**
     * 输入两个递增排序的链表，合并这两个链表并使新链表中的结点仍然是按照递增排序的。
     * */

    fun aa() {
        //145
        //23
        var te: Text? = Text(0)
        var tex: Text? = Text(10)

        //要返回的新节点
        var new = Text(1)
        while (te != null && tex != null) {
            if (te.a > tex.a) {
                new.t = tex
                tex = tex.t
            } else {
                new.t = te
                te = te.t
            }

        }

    }

}