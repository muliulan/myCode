package com.muliulan.mll

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentTimeMillis = System.currentTimeMillis()
        val codeAA =  aa()
        Log.e("mll_codeAA", "$codeAA   ${System.currentTimeMillis() - currentTimeMillis}")

        Dsssss.dd()


        val heap = PriorityQueue<Long>()

        heap.add(3)
        heap.add(5)
        heap.add(1)
        heap.add(7)
        heap.add(10)

        text1.setOnClickListener {
            startActivity(Intent(this,Bbbb::class.java))
        }


    }

    fun aa(): Int {
        val aaaa = "rfewrefefesffafawxzvcs"
        val bbbb = "wrefefesf"
        var index = 0
        for (a in 0 until aaaa.length) {
            if (aaaa[a] == bbbb[index]) {
                index++
            } else {
                index = 0
            }

            if (index == bbbb.length ) {
                return a - bbbb.length+1
            }
        }
        return -1
    }


}