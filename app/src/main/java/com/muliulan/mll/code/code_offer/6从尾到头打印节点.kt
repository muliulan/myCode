package com.muliulan.mll.code.code_offer

import com.muliulan.mll.offer.ListNode
import com.muliulan.mll.offer.Text

/**
描述:
zhaochenshuo
2021/3/19
 */

class Off6 {

    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。\

     * 示例 1：
    输入：head = [1,3,2]
    输出：[2,3,1]
     *
     * */


    fun aa(): IntArray {
        val head: ListNode? =  ListNode.get()


        var p = head
        var c = head?.next
        var r: ListNode? = null

        while (c != null) {
            r = c.next
            c.next = p

            p = c
            c = r
        }
        head?.next = null

        var aa = p
        var num=1
        while (aa?.next != null) {
            num++
            aa = aa.next
        }
        val intArray = IntArray(num)

        aa = p
        num=0
        while (aa != null) {
            intArray[num]=aa.`val`
            num++
            aa = aa.next
        }
        return  intArray
    }

}