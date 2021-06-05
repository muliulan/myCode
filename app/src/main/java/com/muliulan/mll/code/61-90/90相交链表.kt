package com.muliulan.mll.code.`61-90`

import com.muliulan.mll.offer.ListNode

class Main90 {

    fun aa(headA: ListNode?, headB:ListNode?):ListNode? {

//        var hA: ListNode?=headA
//        var hb: ListNode?=headB
//
//        while (hA!=hb){
//            hA=hA?.next
//            hb=hb?.next
//            if(hA==null && hb==null){
//                return null
//            }
//            if(hA==null){
//                hA=headB
//            }
//            if(hb==null){
//                hb=headA
//            }
//        }




        val hashMap = HashSet<ListNode>()
        var hA: ListNode? =headA
        while (hA?.next!=null){
            hashMap.add(hA)
            hA=hA.next
        }

        hA=headB
        while (hA?.next!=null){
            if(hashMap.contains(hA)){
                return hA
            }
        }
        return null
    }

}