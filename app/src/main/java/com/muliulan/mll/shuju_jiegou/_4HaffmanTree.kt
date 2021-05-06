package com.muliulan.mll.shuju_jiegou

import android.util.Log
import java.util.*
import kotlin.collections.ArrayList

/**
描述: 哈夫曼树
zhaochenshuo
2021/4/7
 */

class _4HaffmanTree<T> {

    var root: TreeNode<String>? = null

    /**
     * 存数据
     * 初始化一个树
     *  比如输入  a=[2,4,8,3]  带括号是自己输入的数
     *  小的在左边
     *          17
     *        /  \
     *       (3) 14
     *          /  \
     *         6   (8)
     *       /   \
     *      (2)  (4)
     * */
    fun create(list: ArrayList<TreeNode<String>>): TreeNode<String>? {
        while (list.size > 1) {

            list.sort()
            val left = list[list.size - 1]
            val right = list[list.size - 2]
            val parentNode = TreeNode<String>("pp", left.weight + right.weight)

            parentNode.left = left
            parentNode.right = right

            list.remove(left)
            list.remove(right)
            list.add(parentNode)
        }
        root = list[0]
        return root

    }

    //打印一下树的信息
    fun show(node: TreeNode<String>) {
        val linkedList = LinkedList<TreeNode<String>>()
        linkedList.offer(node)
        while (!linkedList.isEmpty()) {
            val pop = linkedList.pop()
            val data = pop.data
            Log.e("mll 打印出来", data)

            if (pop.left != null) {
                linkedList.offer(pop.left)
            }
            if (pop.right != null) {
                linkedList.offer(pop.right)
            }
        }
    }

    //哈夫曼树编码  左边0  右边1
    fun num(node: TreeNode<String>) {
        var n = node
        val stack = Stack<String>()
        while (n.parent != null) {
            if (n.parent!!.left != null) {
                stack.push("0")
            } else if (n.parent!!.right != null) {
                stack.push("1")
            }
            n = n.parent!!
        }

        while (!stack.isEmpty()) {
            Log.e("mll 打印出来", stack.pop())
        }
    }

    class TreeNode<T>(d: T, w: Int) : Comparable<TreeNode<T>> {
        var data: T = d
        var weight: Int = w
        var left: TreeNode<T>? = null
        var right: TreeNode<T>? = null
        var parent: TreeNode<T>? = null

        override fun compareTo(other: TreeNode<T>): Int {
            if (this.weight > other.weight) {
                return -1
            } else if (this.weight < other.weight) {
                return 1
            }
            return 0
        }

    }
}