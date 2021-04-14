package com.muliulan.mll.code.`31-60`

import com.muliulan.mll.shuju_jiegou._4HaffmanTree

/**
描述:
zhaochenshuo
2021/4/13
 */

class Main54 {


    /**
     * 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
     *
     *
     * [4,2,6,1,3]
     *
     *
     *      4
     *     2  6
     *    1 3
     *
     *    [90,69,null,49,89,null,52]
     *
     *      90
     *    69
     *  49  89
     *   52
     *
     * */
    var num = 9999
    var ro: TreeNode? = null
    fun minDiffInBST(root: TreeNode?): Int {
        root?.run {
            minDiffInBST(left)
            if (ro != null) {
                num = Math.min(Math.abs(`val` - ro!!.`val`), num)
            }
            ro = root
            minDiffInBST(right)
        }



        return num
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}