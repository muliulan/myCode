package com.muliulan.mll.code.`61-90`

import android.util.Log
import com.muliulan.mll.offer.TreeNode

/**
描述:
zhaochenshuo
2021/5/17
 */

class Main77 {

    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        if(root?.left!=null){
            aa(root?.left!!, 1, x, y, root.`val`)
        }
        if(root?.right!=null){
            aa(root.right!!, 1, x, y, root.`val`)
        }
        return xs == ys && xf != yf
    }

    var xs = 0//x的深度
    var xf = 0//x的父节点
    var ys = 0//y的深度
    var yf = 0//y的父节点
    fun aa(root: TreeNode?, s: Int, x: Int, y: Int, f: Int ) {
        if (root?.`val` == x) {
            xs = s
            xf = f
            return
        } else if (root?.`val` == y) {
            ys = s
            yf = f
            return
        } else {
            if(root!=null){
                aa(root?.left, s + 1, x, y, root?.`val`!!)
                aa(root?.right, s + 1, x, y, root?.`val`!!)
            }
        }

    }

    /**
     *  *    10
     *    /    \
     *   5     15
     *  /  \   / \
     * 3   7  9  18
     *10 5 3
     * */

    fun TreeDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val left = TreeDepth(root.left)
        val right = TreeDepth(root.right)
        return Math.max(left, right) + 1
    }
}