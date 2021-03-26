package com.muliulan.mll.set_module

import android.util.Log

/**
描述: 二叉树
zhaochenshuo
2021/3/25
 */

class TwoTree {

    /**
     *        A
     *     /    \
     *   B       C
     *  /  \    /
     * D    E  F
     * */

    var root: Node<String>

    init {
        root = Node("A", null, null)
    }

    fun createTree() {
        val nodeB = Node("B", null, null)
        val nodeC = Node("C", null, null)
        val nodeD = Node("D", null, null)
        val nodeE = Node("E", null, null)
        val nodeF = Node("F", null, null)

        root.left = nodeB
        root.right = nodeC

        nodeB.left = nodeD
        nodeB.right = nodeE

        nodeC.left = nodeF
    }

    //中序访问树的所有节点
    fun zhong(cc: Node<String>?) {
        if (cc == null) {
            return
        }
        //先访问左边的数
        zhong(cc.left)
        //打印出来
        Log.e("mll", cc.item)
        //在访问右边的数
        zhong(cc.right)
    }


    class Node<E>(it: E, pr: Node<E>?, ne: Node<E>?) {
        var item: E = it
        var left: Node<E>? = pr
        var right: Node<E>? = ne

    }
}