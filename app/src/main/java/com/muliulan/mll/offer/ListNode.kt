package com.muliulan.mll.offer

data class ListNode(var `val`: Int) {
    var next: ListNode? = null


    companion object {

        fun get(): ListNode {

            val text = ListNode(2)
            val text1 = ListNode(3)
            val text2 = ListNode(1)

            text.next = text1
            text1.next = text2
            return text
        }

    }

}