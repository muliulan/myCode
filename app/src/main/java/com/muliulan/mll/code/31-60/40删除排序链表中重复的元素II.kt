package com.muliulan.mll.code.`31-60`

import com.muliulan.mll.offer.ListNode
import java.util.*
import kotlin.collections.HashMap

/**
描述:
zhaochenshuo
2021/3/25
 */

class Main40 {
    /**
     * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
    返回同样按升序排列的结果链表。

    示例 1：
    输入：head = [1,2,3,3,4,4,5]
    输出：[1,2,5]

    示例 2：
    输入：head = [1,1,1,2,3]
    输出：[2,3]
     *
     * */


    fun aa(head: ListNode?): ListNode? {
        if (head == null) {
            return head
        }

        val aaa = ListNode(0)
        aaa.next = head
        var nnn = aaa
        while (nnn.next != null && nnn.next!!.next != null) {
            if (nnn.next!!.`val` == nnn.next!!.next!!.`val`) {
                val i = nnn.next!!.`val`
                while (nnn.next != null && nnn.next!!.`val` == i) {
                    if(nnn.next!!.next==null){
                        nnn.next=null
                    }else{
                        nnn.next = nnn.next!!.next!!
                    }
                }
            } else {
                nnn = nnn.next!!
            }
        }
        return aaa.next
    }


    /**
     if (head == null) {
    return head;
    }

    ListNode dummy = new ListNode(0, head);

    ListNode cur = dummy;
    while (cur.next != null && cur.next.next != null) {
    if (cur.next.val == cur.next.next.val) {
    int x = cur.next.val;
    while (cur.next != null && cur.next.val == x) {
    cur.next = cur.next.next;
    }
    } else {
    cur = cur.next;
    }
    }

    return dummy.next;

     *
     *
     * */

}