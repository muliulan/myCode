package com.muliulan.mll.code.`1-30`

import com.muliulan.mll.offer.ListNode

/**
描述:
zhaochenshuo
2021/2/7
 */

class Main8() {

    /**
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。

    示例:
    输入: 1->2->3->4->5->NULL
    输出: 5->4->3->2->1->NULL
     * */
    fun   aa(h: ListNode): ListNode {
        var p = h
        var c = h.next
        var t: ListNode? = null
        while (c != null) {

            t = c.next
            c.next = p

            p = c
            c = t
        }
        h.next = null

        return p
    }
    /**
     * 第二种
     * class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
                while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;

                prev = curr;
                curr = next;
                }
            return prev;
        }
    }
     *
     * */
}