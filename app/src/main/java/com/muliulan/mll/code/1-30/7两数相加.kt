package com.muliulan.mll.code.`1-30`

/**
描述:
zhaochenshuo
2021/2/7
 */

class Main7() {

    /**
     * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
    请你将两个数相加，并以相同形式返回一个表示和的链表。
    你可以假设除了数字 0 之外，这两个数都不会以 0 开头。


    示例 1：
    输入：l1 = [2,4,3], l2 = [5,6,4]
    输出：[7,0,8]
    解释：342 + 465 = 807.

    示例 2：
    输入：l1 = [0], l2 = [0]
    输出：[0]

     * */
    fun aa() {
        var l1: ListNode? = ListNode(1)
        var l2: ListNode? = ListNode(1)

        var a = 0
        var my = ListNode(-1)
        var pre = my

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                a += l1.`val`
                l1 = l1.next
            }
            if (l2 != null) {
                a += l2.`val`
                l2 = l2.next
            }

            pre.next = ListNode(a % 10)
            pre = pre.next!!
            a /= 10

        }

//        return my.next
    }

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

