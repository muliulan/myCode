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

        fun getA(arr: IntArray): ListNode {
            val text = ListNode(arr[0])
            var taa=text
            for (a in 1 until arr.size) {

                taa.next=ListNode(arr[a])
                taa= taa.next!!
//                var tttt: ListNode? = null
//                while (text.next != null) {
//                    tttt = text.next
//                }
//                tttt?.next = ListNode(arr[a])
            }
            return text
        }


    }

}