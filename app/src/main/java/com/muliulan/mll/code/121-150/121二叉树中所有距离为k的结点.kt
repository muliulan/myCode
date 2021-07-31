package com.muliulan.mll.code.`121-150`

import com.muliulan.mll.offer.TreeNode
import java.util.*

/**
name: zhaochenshuo
Date: 2021/7/28
 **/
class Main121 {
    val hashMap = HashMap<Int, TreeNode>()
    val arrayList = ArrayList<Int>()


    fun distanceK(root: TreeNode?, target: TreeNode?, k: Int): List<Int> {
        aa(root)
        bb(target, null, 0, k)
        return arrayList
    }

    fun aa(root: TreeNode?) {
        if (root == null) {
            return
        }
        if (root.left != null) {
            hashMap.put(root.left!!.`val`, root)
            aa(root.left)
        }
        if (root.right != null) {
            hashMap.put(root.right!!.`val`, root)
            aa(root.right)
        }
    }

    fun bb(node: TreeNode?, f: TreeNode?, i: Int, k: Int) {
        if (node == null) {
            return
        }
        if (i == k) {
            arrayList.add(node.`val`)
        }
        if (node.left != f) {
            bb(node.left, node, i + 1, k)
        }
        if (node.right != f) {
            bb(node.right, node, i + 1, k)
        }
        /**
         * node.`val`->5
         * hashMap.get(node.`val`) ->10
         * f->10
         *
         *       10
         *    /    \
         *   5     15
         *  /  \   / \
         * 3   7  9  18
         *
         * */
        if (hashMap.get(node.`val`) != f) {
            bb(hashMap.get(node.`val`), node, i + 1, k)
        }
    }

}