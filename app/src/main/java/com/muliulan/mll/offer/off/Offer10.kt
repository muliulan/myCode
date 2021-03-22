package com.muliulan.mll.offer.off

import com.muliulan.mll.offer.Text

/**
描述:
zhaochenshuo
2021/2/24
 */

class Offer10 {

    /**
     *
     * 给定单向链表的一个头指针和节点指针，定义一个函数在O(1)时间删除该节点。
     * */
//    * @param head        链表表的头
//    * @param toBeDeleted 待删除的结点
//    * @return 删除后的头结点
    fun aa(): Text? {
        val head = Text(0)
        val toBeDeleted = Text(1)

        //1删除的是否是链表头
        if (head == toBeDeleted) {
            return head.t
        }

        //2是否是最后一个节点
        if (toBeDeleted.t == null) {

            var a = head
            while (a.t == toBeDeleted) {
                a = a.t!!
            }

            a.t=null

        } else {
            //3中间节点
            toBeDeleted.a= toBeDeleted.t!!.a
            toBeDeleted.t= toBeDeleted.t!!.t
        }


        return head
    }

}