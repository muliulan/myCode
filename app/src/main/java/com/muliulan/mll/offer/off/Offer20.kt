package com.muliulan.mll.offer.off

import android.util.Log
import com.muliulan.mll.offer.TreeNode
import java.util.*
import kotlin.collections.ArrayList

/**
描述:
zhaochenshuo
2021/3/1
 */

class Offer20 {

    /**
     * 从上往下打印出二叉树的每个结点，同一层的结点按照从左向右的顺序打印。
     *      8
     *    /    \
     *   6     10
     *  /  \   / \
     * 5   7  9  11
     * 则依次打印出8、6、10、5、7 、9、11.
     * */
    fun aa() {

        val one = TreeNode.ab()
        bb(one)
    }

    private fun bb(t: TreeNode) {
        val arrayList = ArrayList<TreeNode>()

        val linkedList = LinkedList<TreeNode>()
        linkedList.add(t)

        while (!linkedList.isEmpty()) {
            val poll = linkedList.poll()

            if (poll.left != null) {
                linkedList.add(poll.left!!)
            }
            if (poll.right != null) {
                linkedList.add(poll.right!!)
            }

            arrayList.add(poll)

        }
        var a=""
        arrayList.forEach {
            a+="${it.`val`} ,"
        }
        Log.e("mll zzz",a)
    }
}