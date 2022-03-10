package com.muliulan.mll.xie_cheng

import android.app.Activity
import android.util.Log
import kotlinx.coroutines.*
import java.lang.Exception
import java.lang.NullPointerException
import java.util.*
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine


/**
 *    @author : zhaoCS
 *    date    : 2022/2/112:27 下午
 *    desc    :
 */
class Xc1 {

    fun aa() {
        /**
         * 1 推荐的线程开启方法
         * */
        CoroutineScope(context = Dispatchers.Main).launch {

            val a = async {
                delay(1000)
               if (isActive){
                    Log.e("mll", "开始执行")
                }
            }

            a.cancelAndJoin()

        }

        /**
         * 2 GlobalScope 生命周期受整个进程限制,即除非主进程退出,否则只要该协程不结束就会占用资源,导致内存泄漏
         * */
        GlobalScope.launch(context = Dispatchers.Main, start = CoroutineStart.DEFAULT) {
        }

        /**
         * 3 启动模式
         * */
//         CoroutineStart.DEFAULT       默认立即执行
//         CoroutineStart.ATOMIC        立即执行 但在开始运行之前无法取消
//         CoroutineStart.UNDISPATCHED  立即在当前线程执行协程体 知道第一个suspend调用
//         CoroutineStart.LAZY          只有在需要的情况下运行
        CoroutineScope(context = Dispatchers.Main).launch(start = CoroutineStart.DEFAULT) { }

        /**
         * 4 线程切换
         * */
        CoroutineScope(context = Dispatchers.Main).launch {
            val task1 = withContext(Dispatchers.IO) {
                //可返回结果的协程 串行
                "withContext"
            }
            val task2 = async {
                //可返回结果的协程 并行
                "async"
            }.await()
            Log.e("mll", "${task1}  ${task2}")
        }

        /**
         * 5 超时
         * */
        CoroutineScope(context = Dispatchers.Main).launch {
            withTimeout(100L) {
                //超时抛异常
            }
            withTimeoutOrNull(100L) {
                //超时返回null
            }
        }

        /**
         * 6 只能捕获对应协程内未捕获的异常
         * */
        val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
            Log.e("mll", " ${throwable.message}")
        }
        CoroutineScope(context = exceptionHandler).launch {
//            arrayListOf<Int>()[11]//不会崩溃会走上面设置的异常捕获器
        }
        CoroutineScope(context = Dispatchers.Main).launch {
//                arrayListOf<Int>()[11]
        }

        /**
         * 7 异常传播
         * */
        CoroutineScope(context = Dispatchers.Main).launch {
            coroutineScope {
                //父子互相传播, 子异常父也异常
            }
            supervisorScope {
                //只有父向子传播, 子异常对父没影响
            }
        }

        /**
         * 8 序列生成器
         * */
        val fibonacci = sequence {
            yield(1L)

        }

    }


    /**
     * 方法转 协程回调的两种方式
     * */
    suspend fun getUserCoroutine() = suspendCoroutine<String> { continuation ->
        //3种回调方式
        continuation.resume("111")
        continuation.resumeWith(runCatching { "1111" })//推荐
        continuation.resumeWithException(NullPointerException("1111"))
    }

    //比suspendCoroutine支持取消
    suspend fun getUser() = suspendCancellableCoroutine<String> { continuation ->
        continuation.resume("111")
        continuation.cancel()
        continuation.invokeOnCancellation {
            Log.e("mll", "协程被取消的回调")
        }

        if (continuation.isCancelled) {
            //协程是否被取消了
        }

    }

}





