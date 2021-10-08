package com.muliulan.mll.code.`121-150`

import com.muliulan.mll.offer.TreeNode

/**
name: zhaochenshuo
Date: 2021/9/29
 **/
class Main(){


    fun maxDepth(root: TreeNode?): Int {

        if(root==null){
            return 0
        }
       val l= maxDepth(root.left)
       val r= maxDepth(root.right)
        return Math.max(l,r)+1
    }

}