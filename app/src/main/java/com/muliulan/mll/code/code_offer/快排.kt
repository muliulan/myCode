package com.muliulan.mll.code.code_offer

import android.os.Build.VERSION_CODES.P
import android.util.Log

/**
 *    @author : zhaoCS
 *    date    : 2022/6/16 5:33 下午
 *    desc    :
 */
class Off {


    fun aa() {
        val array = arrayOf(3, 1, 5, 7, 3)
        sort(array, 0, array.size - 1)
        Log.e("mll Off", array.toString())
    }

    fun sort(array: Array<Int>, low: Int, high: Int) {
        if (low < high) {
            val part = partition(array, low, high)
            sort(array, low, part - 1)//对前面的子区间排序
            sort(array, part + 1, high)//对后面的子区间排序
        }
    }

    //返回基准元素最终的索引
    private fun partition(array: Array<Int>, low: Int, high: Int): Int {
        var mHigh = high
        var mLow = low
        val benchmark = array[low]//基数
        while (mLow < mHigh) {
            //从high指针 开始向中心寻找比基数小的元素
            while ((mLow < mHigh) && array[mHigh] >= benchmark) {
                mHigh--
            }
            //比基数小的 mHigh指针的元素 赋值到 mLow指针位置
            if (mLow < mHigh) {
                array[mLow] = array[mHigh]
            }


            //mLow指针 向中间寻找比基数大的元素
            while ((mLow < mHigh) && array[mLow] <= benchmark) {
                mLow++
            }
            //比基数大的 mLow指针的元素 赋值到 mHigh指针位置

        }
        //两个指针相遇的位置 就是基数的新位置
        array[mLow] = benchmark
        return low
    }

}
