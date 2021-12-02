package com.muliulan.mll.code

import com.muliulan.mll.offer.TreeNode


/**
 *    @author : zhaoCS
 *    date    : 2021/11/1810:35 上午
 *    desc    :
 */

class Main151 {

    var arr = 0
    fun findTilt(root: TreeNode?): Int {
        aa(root!!)
        return arr
    }

    fun aa(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val l = aa(root.left)
        val r = aa(root.right)
        arr+=Math.abs(l-r)
        return l+r+root.`val`
    }


}

