package com.muliulan.mll.offer

/**
描述: 二叉树
zhaochenshuo
2021/2/25
 */

data class TextTwo(var `val`: Int ) {

    var left: TextTwo ?=null
    var right: TextTwo ? =null


    companion object{

        /**
         *  *    10
         *    /    \
         *   5     15
         *  /  \   / \
         * 3   7  9  18
         *
         * */
        fun ab():TextTwo{
            val one = TextTwo(10)

            val two1 = TextTwo(5)
            val two2 = TextTwo(15)

            val three1 = TextTwo(3)
            val three2 = TextTwo(7)
            val three3 = TextTwo(9)
            val three4 = TextTwo(18)

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