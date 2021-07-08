package com.muliulan.mll

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Rect
import android.util.AttributeSet
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View

/**
描述:
zhaochenshuo
2021/2/26
 */

class Ddd(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) :
    View(context, attrs, defStyleAttr), GestureDetector.OnGestureListener {



    init {

        val rect = Rect()

        val options = BitmapFactory.Options()
        //手势滑动
        val gestureDetector = GestureDetector(context, this)


    }

    override fun onDown(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }

    override fun onShowPress(e: MotionEvent?) {
        TODO("Not yet implemented")
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun onLongPress(e: MotionEvent?) {
        TODO("Not yet implemented")
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        return false
    }


    enum class Answer {
        YES,
        NO {},
        MAYBE {
            override fun toString() = """¯\_(ツ)_/¯"""
        }
    }


}