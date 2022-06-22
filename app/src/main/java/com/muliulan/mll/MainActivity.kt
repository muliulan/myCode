package com.muliulan.mll

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.muliulan.mll.code.code_offer.Off
import com.muliulan.mll.code_pop.Cy
import com.muliulan.mll.code_pop.Pop2
import com.muliulan.mll.code_pop.Pop3
import com.muliulan.mll.xie_cheng.MllFlow
import com.muliulan.mll.xie_cheng.Xc1
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import java.util.*


//  ↖↑↗←↙↓↘→    AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener { }

        btn2.setOnClickListener {


        }
        val mainViewModel = MainViewModel()

        MllFlow().aa(lifecycleScope)


        Off().aa()


        val a: Boolean? = null

        if(a==true){
            Log.e("mll", "111")
        }else{
            Log.e("mll", "222")
        }

    }


    fun aa() {
        CoroutineScope(context = Dispatchers.Main).launch {
            flow {
                for (a in 1..5) {
                    Log.e("mll", "b")
                    emit(a)
                    Log.e("mll", "bb")
                }
            }
//                .debounce(2000)
//                .sample(1000)
//                .collect {
//                    Log.e("mll", it.toString())
//                }
                .onEach {
                    it + 1
                    Log.e("mll", "aa")
                }
//                .map {
//                    it + 1
//                }.filter {
//                    it % 2 == 0
//                }
                .collect {
//                    delay(1)
                    Log.e("mll", it.toString())
                }
            Log.e("mll", "---------------------------")
        }
//        .debounce和sample

    }
}