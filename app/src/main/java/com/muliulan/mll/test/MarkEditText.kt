package com.muliulan.mll.test

import android.content.Context
import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.text.buildSpannedString
import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 *
 * @author mengxn
 * @date 2022/2/16
 */
class MarkEditText(context: Context, attributeSet: AttributeSet? = null) :
    AppCompatEditText(context, attributeSet) {

    fun appendMark(text: CharSequence?) {
        var mSelection = 0
        setText(buildSpannedString {
            append(this@MarkEditText.text)
            if (text?.matches("\\[.+\\]\\(.+\\)".toRegex()) == true) {
                insert(selectionStart, newAt(text))
                mSelection = selectionStart + newAt(text).length
                insert(mSelection, " ")
            } else {
                append(text)
            }
        })
        setSelection(mSelection + 1)
        highlightColor = Color.TRANSPARENT
    }

    fun dd() {
        val a =
            "1111[@1111](www.baidu,com) 11 22  22[@222](www.baidu,com) 222 [@22233](www.baidu,com) "
        val regex1 = ".+\\[.+\\]\\(.+\\)"
        val regex2 = "\\[.+\\]\\(.+\\)"
        setText(buildSpannedString {
            val split = a.split(" ")
            for(index in split.indices){
                val it=split[index]
                if (it.matches(regex1.toRegex()) || it.matches(regex2.toRegex())) {
                    val pt = Pattern.compile(regex2)
                    val mt = pt.matcher(it)
                    if (mt.find()) {
                        val start = mt.start()
                        append(it.substring(0, start))
                        append(newAt(it.substring(start)))
                    }
                } else if (it.isNotEmpty()) {
                    append(it)
                    if(index==split.size-1){
                        return@buildSpannedString
                    }
                }
                append(" ")
            }
        })
        movementMethod = LinkMovementMethod.getInstance();

    }

    private fun newAt(at: CharSequence): SpannableString {
        Log.e("mll 1111",at.toString())
        return SpannableString(at).apply {
            setSpan(AtSpan(at), 0, length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            setSpan(object : WordSpan(){
                override fun onClick(widget: View) {
                    Log.e("mll",at.toString())
                }
            },0, length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
    }
}

    