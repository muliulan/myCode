package com.muliulan.mll.code.`61-90`

import com.muliulan.mll.offer.TreeNode
import com.muliulan.mll.shuju_jiegou._4HaffmanTree
import java.util.ArrayList

/**
描述:
zhaochenshuo
2021/4/27
 */

class Main65() {


    /**
     * 给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
     * */
    val arrayList = ArrayList<Int>()
    fun rangeSumBST(root: TreeNode?): Int {

        val ab = TreeNode.ab()
        val low: Int = 7
        val high: Int = 15


//        aa(ab, low)
//        aa(ab, high)


        bb(ab.left, low, high)
        bb(ab.right, low, high)
        var num = 0
        arrayList.forEach {
            if (it >= low && it <= high) {
                num += it
            }
        }

         num= if (root!!.`val` >= low && root!!.`val` <= high){
            num+root!!.`val`
        }else{
            num
        }
        return num
    }

    fun bb(root: TreeNode?, l: Int, r: Int) {
        arrayList.add(root!!.`val`)
        if (root!!.`val` > l && root.left != null) {
            bb(root.left, l, r)
        }
        if (root!!.`val` < l && root.right != null) {
            bb(root.right, l, r)
        }
    }


}