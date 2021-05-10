package com.muliulan.mll.offer

/**
描述: 二叉树
zhaochenshuo
2021/2/25
 */

data class TreeNode(var `val`: Int ) {

    var left: TreeNode ?=null
    var right: TreeNode ? =null


    companion object{

        /**
         *  *    10
         *    /    \
         *   5     15
         *  /  \   / \
         * 3   7  9  18
         *
         * */
        fun ab():TreeNode{
            val one = TreeNode(10)

            val two1 = TreeNode(5)
            val two2 = TreeNode(15)

            val three1 = TreeNode(3)
            val three2 = TreeNode(7)
            val three3 = TreeNode(9)
            val three4 = TreeNode(18)

            one.left = two1
            one.right = two2

            two1.left = three1
            two1.right = three2
            two2.left = three3
            two2.right = three4
            return one
        }

    }
}