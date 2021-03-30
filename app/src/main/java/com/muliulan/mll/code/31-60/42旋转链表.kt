package com.muliulan.mll.code.`31-60`

import com.muliulan.mll.offer.ListNode

/**
描述:
zhaochenshuo
2021/3/27
 */

class Main42 {

    /**给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。

    示例 1：
    输入：head = [1,2,3,4,5], k = 2
    输出：[4,5,1,2,3]

    示例 2：
    输入：head = [0,1,2], k = 4
    输出：[2,0,1]
     *
     * */
    fun aa(): ListNode? {
        //12345
        //45123

        //23145
        //31245
        //12345
        //41235
        //45123

//12121212
        val k: Int = 1
        val head = ListNode(1)
        val listNode2 = ListNode(2)
        head.next = listNode2

        if (head == null) {
            return null
        }
        if (k == 0) {
            return head
        }

        var a = 1
        var mh = head!!
        while (mh.next != null) {
            mh = mh.next!!
            a++
        }

        var i = a - k % a
        if (i == a) {
            return head
        }
        mh.next=head
        while (i > 0) {
            i--
            mh = mh.next!!
        }
        val next = mh.next
        mh.next = null
        return next
    }
}