package com.muliulan.mll.code.`91-120`

import com.muliulan.mll.offer.ListNode


/**
name: zhaochenshuo
Date: 2021/7/21
 **/

class Main117 {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {

        if (headA == null || headB == null) {
            return null
        }
        var aa = headA
        var bb = headB
        while (aa !== bb) {
            aa = if (aa == null) headB else aa.next
            bb = if (bb == null) headA else bb.next
        }

        return aa
    }


}
