package com.muliulan.mll.code_pop

import android.util.Log
import java.sql.Array

/**
 *    @author : zhaoCS
 *    date    : 2022/4/28 4:33 下午
 *    desc    :
 */
class Pop2 {


    /**
     * n件物品(物品重量和价值不同)
     * w是背包总重量
     * 每个物品只能用一次
     * 算出最多装多少价值的货
     * */

    //方法1
    fun aa() {
        val n = 6//物品总数有5件
        val w = 21//背包总重量为20
        val weight = intArrayOf(0, 2, 3, 4, 5, 9)//每个物品的重量
        val value = intArrayOf(0, 3, 4, 5, 8, 10)//每个物品的价值
        //[i][j]   背包总重量为j时   在前i个物品中取
        val sum = Array(n) {
            IntArray(w)
        }


        for (i in 1 until n) { //i是前i个物品
            for (j in 1 until w) {// j是背包总重量
                if (weight[i] > j) {//太重放不进去
                    sum[i][j] = sum[i - 1][j]
                } else {
                    val a = sum[i - 1][j]
                    val b = sum[i - 1][j - weight[i]] + value[i]
                    sum[i][j] = Math.max(a, b)

                }

            }

        }
        Log.e("mll", sum[5][20].toString())
    }

    //方法2
    fun bb() {
        val n = 6//物品总数有5件
        val w = 21//背包总重量为20
        val weight = intArrayOf(0, 2, 3, 4, 5, 9)//每个物品的重量
        val value = intArrayOf(0, 3, 4, 5, 8, 10)//每个物品的价值
        // 在前i个物品中取
        val sum = IntArray(w)

        for (i in 1 until n) {
            for (j in w - 1 downTo 1) {
                if(j >= weight[i]){
                    sum[j] = Math.max(sum[j], sum[j - weight[i]] + value[i])
                }
            }
        }

        Log.e("mll", sum[20].toString())
    }


}





