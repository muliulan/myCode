      
package com.muliulan.mll.test

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.text.style.ReplacementSpan

/**
 *
 * @author mengxn
 * @date 2022/2/16
 */
class AtSpan(at: CharSequence) : ReplacementSpan() {

    private val displayText: String

    init {
        val atStart = at.indexOfFirst { it == '[' }
        val atEnd = at.indexOfFirst { it == ']' }
        displayText = at.substring(atStart+1, atEnd)
    }

    override fun getSize(paint: Paint, text: CharSequence?, start: Int, end: Int, fm: Paint.FontMetricsInt?): Int {

        return paint.measureText(displayText).toInt()
    }

    override fun draw(canvas: Canvas, text: CharSequence?, start: Int, end: Int, x: Float, top: Int, y: Int, bottom: Int, paint: Paint) {
        paint.color = Color.RED
        canvas.drawText(displayText, x, y.toFloat(), paint)
    }

}

    