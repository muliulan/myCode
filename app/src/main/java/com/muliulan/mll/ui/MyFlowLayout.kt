package com.muliulan.mll.ui

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import java.util.*

/**
 *
 * 流式布局 FlowLayout
 *
 * */
class MyFlowLayout @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ViewGroup(context, attrs, defStyleAttr) {


    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        val childCount = childCount
        val paddingLeft = paddingLeft
        val paddingTop = paddingTop

        for (a in 0 until childCount) {
            val childAt = getChildAt(a)
            childAt.layout(paddingLeft, paddingTop, paddingLeft + childAt.measuredWidth, paddingTop + childAt.measuredHeight)
        }

    }


    @SuppressLint("DrawAllocation")
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)


        val paddingLeft = paddingLeft
        val paddingRight = paddingRight
        val paddingTop = paddingTop
        val paddingBottom = paddingBottom


        val childCount = childCount
        for (a in 0 until childCount) {
            val childAt = getChildAt(a)
            //测量子view的宽高设置给子view
            val childWidth = getChildMeasureSpec(widthMeasureSpec, paddingLeft + paddingRight, childAt.width)
            val childHeight = getChildMeasureSpec(heightMeasureSpec, paddingTop + paddingBottom, childAt.height)
            childAt.measure(childWidth, childHeight)
        }


        val arrayList = ArrayList<ArrayList<Int>>()
        val list = ArrayList<Int>() //通过子view的 宽计算出每一行放几个
        arrayList.add(list)//一共 arrayList.size行

    }

}