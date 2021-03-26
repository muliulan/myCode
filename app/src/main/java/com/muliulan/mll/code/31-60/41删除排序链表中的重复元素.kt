package com.muliulan.mll.code.`31-60`

import com.muliulan.mll.offer.ListNode

/**
描述:
zhaochenshuo
2021/3/26
 */

class Main41() {
    /**
     * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
    返回同样按升序排列的结果链表。

    示例 1：
    输入：head = [1,1,2]
    输出：[1,2]

    示例 2：
    输入：head = [1,1,2,3,3]
    输出：[1,2,3]
     * */

    fun aa(): ListNode? {
        val head: ListNode = ListNode(1)

//        val listNode1 = ListNode(1)
//        val listNode11 = ListNode(1)
//        val listNode2 = ListNode(2)

//        listNode1.next=listNode11
//        listNode11.next=listNode2


        var mHead = head
        while (mHead?.next != null) {

            if (mHead.`val` == mHead.next?.`val`) {
                if (mHead.next?.next != null) {
                    val mHead1 = mHead
                    mHead1.next = mHead1.next?.next!!

                } else {
                    mHead.next = null
                }
            } else {
                mHead = mHead.next!!
            }
        }


        return head
    }
}