package com.muliulan.mll

import android.content.Intent
import android.content.res.Resources
import android.os.Build
import android.os.Bundle
import android.os.MessageQueue
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.beans.PropertyChangeSupport
import java.util.*


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
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

        val heap = PriorityQueue<Long>()
        heap.add(3)
        heap.add(5)
        heap.add(1)
        heap.add(7)
        heap.add(10)
                Log.e("mll_codeAA", heap.peek().toString() )




        val  aaa =   MessageQueue.IdleHandler {


            true
        }

    }




    override fun getResources(): Resources {

        return super.getResources()
    }
}

