package com.muliulan.mll.code.`31-60`

import com.muliulan.mll.code.`1-30`.Main8
import com.muliulan.mll.offer.ListNode

/**
描述:
zhaochenshuo
2021/3/18
 */

class Main33() {

    /**
     * 给你单链表的头节点 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。

    示例 1：
    输入：head = [1,2,3,4,5], left = 2, right = 4
    输出：[1,4,3,2,5]

    示例 2：
    输入：head = [5], left = 1, right = 1
    输出：[5]
     * */

    fun aa() {
        val head: ListNode = ListNode(1)
        val left: Int=1
        val right: Int=3


        val new = ListNode(-1)
        new.next=head

        //左上一个节点
        var pre = new
        for(a in 0 until left-1){
            pre= pre.next!!
        }
        //右节点
        var r=pre
        for(a in 0 until right-left+1){
            r= r.next!!
        }

        var l = pre.next
        var c = r.next

        pre.next=null
        r.next=null

        Main8().aa(l!!)

        pre.next=r
        l.next=c


//        return new.next
    }





}