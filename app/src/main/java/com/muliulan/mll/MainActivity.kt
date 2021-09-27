package com.muliulan.mll

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.beans.PropertyChangeSupport


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val currentTimeMillis = System.currentTimeMillis()
//        val codeAA = Main138().aa()
//        Log.e("mll_codeAA", "$codeAA   ${System.currentTimeMillis() - currentTimeMillis}")


        text1.setOnClickListener {
            startActivity(Intent(this, Bbbb::class.java))

        }
        val changes = PropertyChangeSupport("")

//        val heap = PriorityQueue<Long>()
//        heap.add(3)
//        heap.add(5)
//        heap.add(1)
//        heap.add(7)
//        heap.add(10)
    }


    override fun getResources(): Resources {

        return super.getResources()
    }
}