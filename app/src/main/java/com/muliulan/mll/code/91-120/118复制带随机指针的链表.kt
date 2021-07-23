package com.muliulan.mll.code.`91-120`

/**
name: zhaochenshuo
Date: 2021/7/22
 **/
class Main118 {


    fun aa(): Node? {

        val node: Node = qq()

        node?.run {
            val new = Node(`val`)
            new.random=  if(random==null){
                null
            }else{
                Node(random!!.`val`)
            }


            aaa(new, this)

            var nn : Node?= this
            var my : Node?= new
            while (nn != null) {
                val random1 = nn.random
                my?.random = if (random1 == null) {
                    null
                } else {
                    bb(new, random1.`val`)
                }
                nn = nn.next
                my = my?.next
            }
            return new
        }
        return null
    }

    fun bb(new: Node, int: Int): Node? {
        var aa: Node? = new
        var index = 0
        while (aa != null) {
            if (index == int) {
                return aa
            }
            aa = aa.next
            index++
        }
        return null
    }

    private fun aaa(new: Node, node: Node) {
        var aa = new
        var nn = node
        while (nn.next != null) {
            val i = nn.next!!.`val`
            aa.next = Node(i)

            aa = aa.next!!
            nn = nn.next!!
        }
    }

    private fun qq(): Node {
        val node7 = Node(7)
        val node13 = Node(13)
        val node11 = Node(11)
        val node10 = Node(10)
        val node1 = Node(1)

        node7.next = node13
        node7.random = null

        node13.next = node11
        node13.random = Node(0)

        node11.next = node10
        node11.random = Node(4)

        node10.next = node1
        node10.random = Node(2)

        node1.next = null
        node1.random = Node(0)
        return node7
    }
}

class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
