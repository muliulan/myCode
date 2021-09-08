package com.muliulan.mll

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.muliulan.mll.code.`121-150`.Main138
import com.muliulan.mll.utils.TimerGlobalLiveData


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentTimeMillis = System.currentTimeMillis()
        val codeAA = Main138().aa()
        Log.e("mll_codeAA", "$codeAA   ${System.currentTimeMillis() - currentTimeMillis}")


//        val heap = PriorityQueue<Long>()
//        heap.add(3)
//        heap.add(5)
//        heap.add(1)
//        heap.add(7)
//        heap.add(10)


        val get = TimerGlobalLiveData.get()
        get.startTimer()
        get.observe(this) {

        }

    }


}