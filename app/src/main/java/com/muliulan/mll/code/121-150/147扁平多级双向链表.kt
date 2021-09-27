package com.muliulan.mll.code.`121-150`

/**
name: zhaochenshuo
Date: 2021/9/24
 **/

class Main147 {

    fun flatten(root: Node?): Node? {
        a(root)
        return root
    }

    fun a(root: Node?): Node? {
        var cur = root
        var last: Node? = null

        while (cur != null) {
            var next = cur.next
            if (next?.child != null) {

                val child = a(cur.child)
                next=cur.next
                cur.next = cur.child
                cur.child?.prev = cur
                if (next != null) {
                    child?.next = next
                    next.prev = child
                }
                cur.child = null
                last = child
            } else {
                last = cur
            }
            cur = next
        }
        return last
    }


    class Node(var `val`: Int) {
        var prev: Node? = null
        var next: Node? = null
        var child: Node? = null
    }

}