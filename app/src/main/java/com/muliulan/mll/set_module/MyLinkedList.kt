package com.muliulan.mll.set_module

/**
描述: 双向链表
zhaochenshuo
2021/3/23
 */

class MyLinkedList<E> {

    var size = 0
    var finst: LinkText<E>? = null
    var last: LinkText<E>? = null

    //添加新节点到最后
    fun add(e: E) {
        linkLast(e)
    }

    //添加在固定位置
    fun add(index: Int, e: E) {
        //如果正好是添加在最后 就直接添加
        if (index == size) {
            linkLast(e)
            return
        }
        val node = node(index)
        val nprev = node.prev
        val linkText = LinkText(e, nprev, node)
        nprev?.next = linkText
        node.prev = linkText
        size++
    }

    //删除指定位置的节点
    fun remove(index: Int) {
        val node = node(index)
        val prev = node.prev
        val next = node.next

        prev?.next = next
        next?.prev = prev
        node.prev = null
        node.next = null
        size--
    }

    private fun linkLast(e: E) {
        val linkText = LinkText(e, last, null)
        if (last == null) {
            finst = linkText
        } else {
            last?.next = linkText
        }

        last = linkText
        size++
    }

    //查询对应的节点
    private fun node(index: Int): LinkText<E> {
        var la = last
        if (index > size / 2) {
            //从后面向前查询
            for (a in size - 1 downTo index) {
                la = la?.prev
            }
        } else {
            //从前向后查询
            for (a in 0 until index) {
                la = la?.next
            }
        }
        return la!!
    }

    class LinkText<E>(it: E, pr: LinkText<E>?, ne: LinkText<E>?) {
        var item: E = it
        var prev: LinkText<E>? = pr
        var next: LinkText<E>? = ne
    }
}