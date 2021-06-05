package com.muliulan.mll.code.`91-120`

import com.muliulan.mll.offer.ListNode

class Main91 {

    fun aa( ): ListNode? {
        val `val`: Int=2
        val head : ListNode?= ListNode.getA(intArrayOf(1))

        val listNode = ListNode(-1)

        var a = head
        var b = head

        while (a != null && listNode.next == null) {
            if (a.`val` != `val`) {
                listNode.next = a
                b = a
            }
            a=a.next
        }
        if (listNode.next == null) {
            return null
        }

        while (b?.next != null) {
            if (b.next!!.`val` == `val`) {
                b.next = b.next!!.next
            } else {
                b = b.next
            }
        }
        return listNode.next

//        if(head==null){
//            return head
//        }
//        head.next=removeElements(head,`val`)
//        return if(head.next!!.`val`==`val` )  head.next else head

//        var a = head
//
//        val arrayList = ArrayList<Int>()
//        while (a?.next != null) {
//            val i = a.`val`
//            if (i != `val`) {
//                arrayList.add(i)
//            }
//        }
//        if (arrayList.size == 0) {
//            return null
//        } else {
//
//            var listNode = ListNode(arrayList[0])
//            var b: ListNode = listNode
//
//            for (a in 1 until arrayList.size) {
//                b.next = ListNode(arrayList[a])
//            }
//
//            return listNode
//        }


    }


}