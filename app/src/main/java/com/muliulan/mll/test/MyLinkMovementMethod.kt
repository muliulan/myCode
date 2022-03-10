package com.muliulan.mll.test

import android.graphics.Color
import android.text.Spannable
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.BackgroundColorSpan
import android.text.style.ClickableSpan
import android.view.MotionEvent
import android.widget.TextView


/**
 *    @author : zhaoCS
 *    date    : 2022/3/24:09 下午
 *    desc    :
 */
class MyLinkMovementMethod : LinkMovementMethod(){

    override fun onTouchEvent(widget: TextView?, buffer: Spannable?, event: MotionEvent?): Boolean {
        var x = event!!.x.toInt()
        var y = event.y.toInt()

        x -= widget!!.totalPaddingLeft
        y -= widget.totalPaddingTop

        x += widget.scrollX
        y += widget.scrollY
        val layout = widget!!.layout
        val line: Int = layout.getLineForVertical(y)
        val off: Int = layout.getOffsetForHorizontal(line, x.toFloat())
        val link = buffer!!.getSpans(
            off, off,
            ClickableSpan::class.java
        )
        buffer.setSpan(  BackgroundColorSpan(Color.TRANSPARENT),
            buffer.getSpanStart(link[0]), buffer.getSpanEnd(link[0]),
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return super.onTouchEvent(widget, buffer, event)
    }
}