package com.muliulan.mll.xie_cheng

import android.util.Log
import androidx.lifecycle.LifecycleCoroutineScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.*

/**
 *    @author : zhaoCS
 *    date    : 2022/6/8 7:33 下午
 *    desc    :
 */
class MllFlow {

    val mutableSharedFlow = MutableSharedFlow<Int>()//热流
    val mutableStateFlow = MutableStateFlow(1)//和livedata差不多 可以主动获取数据


    fun aa(lifecycleScope: LifecycleCoroutineScope) {


        lifecycleScope.launchWhenCreated {
            //一般使用
            mutableSharedFlow.emit(11)//发射数据
            mutableSharedFlow.collect{
                //接收数据
            }
            mutableSharedFlow.debounce(1000).collectLatest {
                //接收数据 1秒之内只接收最后一次
            }
            mutableSharedFlow.first{
                true
            }

            mutableStateFlow.value//这个可以主动获取数据



            arrayListOf(1, 2, 3, 4).asFlow().map {
                it + 1
            }.collect {
                Log.e("mll", it.toString())
            }

            (1..3).asFlow().transform {
                emit("aaa")
            }.collect {
                Log.e("mll", it.toString())
            }

            flow<Int> {
                for (a in 11..13) {
                    emit(a)
                }
            }.collect {
                Log.e("mll", it.toString())
            }

            val sum = (1..4).asFlow().reduce { accumulator, value ->
                accumulator - value
            }
            Log.e("mll", sum.toString())

            val a = (1..3).asFlow()
            val b = arrayOf("a", "b").asFlow()
            a.combine(b){a,b->
                "$a -- $b"
            }.collect {
                Log.e("mll", it.toString())
            }

            try {
                (1..3).asFlow().collect {
                    check(it<=1){
                        Log.e("mll", "异常了")
                        "返回的错误信息"
                    }
                }
            }catch (e:Throwable){
                Log.e("mll", e.toString())
            }

            (1..3).asFlow().catch {
                Log.e("mll", this.toString())
            }.collect {
                    check(it<=1){
                        Log.e("mll", "异常了")
                        "返回的错误信息"
                    }
                }


            (1..3).asFlow().collect {
                if (it == 2) cancel()
                Log.e("mll", it.toString())
            }


        }
    }


}