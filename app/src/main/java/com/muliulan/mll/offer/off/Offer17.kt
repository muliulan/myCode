package com.muliulan.mll.offer.off

import android.util.Log

/**
描述:
zhaochenshuo
2021/3/1
 */

class Offer17 {
    /**
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次扫印出每一个数字。
     *  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     *
     *  1   2   3   4
     *  5   6   7   8
     *  9   10  11  12
     *  13  14  15  16
     *
     * */


    fun aa() {
        val arrayOf = arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(9, 10, 11, 12),
            arrayOf(13, 14, 15, 16)
        )

        var num = ""

        var top = 0
        var bottom = arrayOf.size - 1
        var left = 0
        var right = arrayOf[0].size - 1


        while (left <= right && top <= bottom) {
            //打印第一排
            for (a in left..right) {
                num += "${arrayOf[top][a]} ,"
            }
            Log.e("mll++++++++", num)
            //打印最后一列
            for (a in top + 1..bottom) {
                num += "${arrayOf[a][right]} ,"
            }
            Log.e("mll++++++++", num)

            //打印最后一行
            if (top != bottom) {
                for (a in right - 1 downTo left) {
                    num += "${arrayOf[bottom][a]} ,"

                }
                Log.e("mll++++++++", num)
            }

            //打印最左侧一行
            if (left != right) {
                for (a in bottom - 1 downTo top + 1) {
                    num += "${arrayOf[a][left]} ,"
                }
                Log.e("mll++++++++", num)
            }

            top++
            bottom--
            left++
            right--
        }

        Log.e("mll+----", num)
    }
}