package com.muliulan.mll.set_module

import java.util.*
import kotlin.collections.ArrayList

/**
描述: 哈夫曼树
zhaochenshuo
2021/4/7
 */

class HaffmanTree<T> {

    var root: TreeNode<String>? = null


    /**初始化一个树
     *  比如输入  a=[2,4,6,8,3]  带括号是自己输入的数
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
            val parentNode = TreeNode<String>("parent", left.weight + right.weight)

            parentNode.left = left
            parentNode.right = right

            list.remove(left)
            list.remove(right)
            list.add(parentNode)
        }
        root = list[0]
        return root

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