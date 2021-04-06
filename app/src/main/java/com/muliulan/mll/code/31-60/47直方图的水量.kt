package com.muliulan.mll.code.`31-60`

import android.util.Log

/**
描述:
zhaochenshuo
2021/4/2
 */

class Main47 {
    /**
     * 定一个直方图(也称柱状图)，假设有人从上面源源不断地倒水，最后直方图能存多少水量?直方图的宽度为 1。

    上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的直方图，在这种情况下，可以接 6 个单位的水（蓝色部分表示水）。 感谢 Marcos 贡献此图。

    示例:
    输入: [0,1,0,2,1,0,1,3,2,1,2,1]
    输出: 6

     *
     * */


    fun aa(): Int {
        val height: IntArray = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
        var num = 0
        if(height.size==1 || height.size==2 ){
            return 0
        }
        for (a in 1 until height.size) {
            val my = height[a]
            var lMax = 0
            //当前坐标 左边的最大值
            for (ab in a downTo 0) {
                lMax = Math.max(lMax, height[ab])
            }

            if (lMax > my) {
                var rMax = 0
                //当前坐标 右边的最大值
                for (b in a until height.size) {
                    rMax = Math.max(rMax, height[b])
                }
                //左右最大值 中的小值 -当前左边的值
                num += Math.min(lMax, rMax) - my
            }
        }
        return num
    }
}