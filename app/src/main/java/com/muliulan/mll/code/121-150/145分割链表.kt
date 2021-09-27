package com.muliulan.mll.code.`121-150`

import com.muliulan.mll.offer.ListNode

/**
name: zhaochenshuo
Date: 2021/9/22
 **/
class Main145 {

    fun splitListToParts(head: ListNode?, k: Int): Array<ListNode?> {

        val array = Array<ListNode?>(k) {
            null
        }

        var size = 0
        var mHead = head

        while (mHead?.next != null) {
            size++
            mHead = mHead.next
        }

        mHead = head
        if (size <= k) {
            var index=0
            while (mHead != null) {
                val mh = mHead
                mHead=mHead.next
                mh.next = null
                array[index]=mh
                index++
            }
        }else{
            val i = size / k
            val i1 = size - i * k


            val intArray = IntArray(k)
            for(a in 0 until k){
                intArray[a]=i
            }
            for(a in 0 until i1){
                intArray[a]=intArray[a]+1
            }

            var index=0
            while (mHead?.next != null){
                var mh=mHead
                array[index]=mh
                var inn=0
                while (mh?.next!=null){
                    mh=mh.next
                    inn++
                    if(inn==intArray[index]){
                        mHead=mh?.next
                        mh?.next=null
                        index++
                    }
                }
            }
        }
        return array
    }

}
