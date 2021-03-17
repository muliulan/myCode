package com.muliulan.mll.offer

/**
描述: 二叉树
zhaochenshuo
2021/2/25
 */

data class TextTwo(var a: Int ) {

    var l: TextTwo ?=null
    var r: TextTwo ? =null


    companion object{

        /**
         *  *    8
         *    /    \
         *   6     10
         *  /  \   / \
         * 5   7  9  11
         *
         * */
        fun ab():TextTwo{
            val one = TextTwo(8)

            val two1 = TextTwo(6)
            val two2 = TextTwo(10)

            val three1 = TextTwo(5)
            val three2 = TextTwo(7)
            val three3 = TextTwo(9)
            val three4 = TextTwo(11)

            one.l = two1
            one.r = two2

            two1.l = three1
            two1.r = three2
            two2.l = three3
            two2.r = three4
            return one
        }

    }
}