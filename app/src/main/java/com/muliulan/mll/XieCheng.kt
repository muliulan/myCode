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

}


class LoginViewModel() : ViewModel() {
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
        job.cancel()
//        job.cancelAndJoin() //取消一个作业并且等待完成


    }

    fun cc() {
        viewModelScope.launch {
            // 默认true  调用cancel的时候会变为false
            while (isActive) {

            }

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

    suspend fun cc() = coroutineScope {

    }

}

