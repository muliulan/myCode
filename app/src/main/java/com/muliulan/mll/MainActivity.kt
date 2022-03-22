package com.muliulan.mll

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.ArraySet
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.muliulan.mll.xie_cheng.Xc1
import kotlinx.android.synthetic.main.activity_main.*
import java.beans.PropertyChangeSupport
import java.util.*


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val currentTimeMillis = System.currentTimeMillis()
//        val codeAA = Main138().aa()
//        Log.e("mll_codeAA", "$codeAA   ${System.currentTimeMillis() - currentTimeMillis}")


        text1.setOnClickListener {
            startActivity(Intent(this, BbbbActivity::class.java))

        }
        val changes = PropertyChangeSupport("")

        val heap = PriorityQueue<Long>()
        heap.add(3)
        heap.add(5)
        heap.add(1)
        heap.add(7)
        heap.add(10)


        val a = ""
        val b: String? = null
        a.isNotEmpty().apply {

        }

        val arrayListOf = arrayListOf<String>()


//        arrayListOf.firstNotNullOf {
//            Log.e("mll", "111")
//        }
        arrayListOf.firstNotNullOfOrNull {

            Log.e("mll", "222")
        }
         arrayListOf.firstOrNull()?.run {
             Log.e("mll", "333")
         }

//        Log.e("mll", "$firstOrNull")

    }


    fun aa() {


        btn1.setOnClickListener {
            edittext.appendMark("[@1111](www.baidu,com)")
        }

        btn2.setOnClickListener {
            text1.text = edittext.text.toString()
            Log.e("mll", edittext.text.toString())
        }
        btn3.setOnClickListener {
            edittext.dd()
        }

    }

}

