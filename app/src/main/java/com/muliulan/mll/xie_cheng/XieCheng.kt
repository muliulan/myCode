package com.muliulan.mll

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine
import kotlin.system.measureTimeMillis

/**
name: zhaochenshuo
Date: 2021/7/9
 **/
class XieCheng {
    suspend fun makeLoginRequest() {

        //线程切换
        withContext(Dispatchers.IO) {
            ""
        }

        coroutineScope {
        }

        measureTimeMillis {

        }
    }

    suspend fun doSomethingUsefulTwo(): Int {
        delay(1000L) // 假设我们在这里也做了一些有用的事
        return 29
    }

    fun aa() {
        val completableDeferred = CompletableDeferred<Boolean>()
        completableDeferred.complete(true)
//        val a = completableDeferred.isCancelled
//        val b = completableDeferred.isActive
//        val c = completableDeferred.isCompleted

//        Log.e("mll", "${a} ${b} ${c}")

    }
}


class LoginViewModel : ViewModel() {
    fun aa() {
        viewModelScope.launch {
            XieCheng().makeLoginRequest()
        }

        viewModelScope.async {

        }
        //开启多个携程
        repeat(10) {


        }

    }

    fun bb() {
        val job = viewModelScope.launch {
            //单独运行 不会别终止
            GlobalScope.launch {

            }
            //会被终止
            launch {
            }
        }
        job.isActive
        job.cancel()
//        job.cancelAndJoin() //取消一个作业并且等待完成

    }

    fun cc() {
        viewModelScope.launch {
            // 默认true  调用cancel关闭的时候会变为false
            while (isActive) {

            }

        }

    }


    fun dd() {
        viewModelScope.launch(Dispatchers.Main) {
            print("1:" + Thread.currentThread().name)   //main
            //线程切换
            withContext(Dispatchers.IO) {
                delay(1000)
                print("2:" + Thread.currentThread().name)   //DefaultDispatcher-worker-1
            }
            print("3:" + Thread.currentThread().name)   //main
        }
    }

}

class Mactivity : AppCompatActivity() {
    fun aa() {
        lifecycleScope.launch {

        }


    }

    suspend fun bb() = suspendCoroutine<String> {
        it.resume("")
    }

    suspend fun cc(): Int = coroutineScope {
        val async1 = async<Int> {
            XieCheng().doSomethingUsefulTwo()
        }
        val async2 = async<Int> {
            XieCheng().doSomethingUsefulTwo()
        }
        async1.await() + async2.await()
    }

}

