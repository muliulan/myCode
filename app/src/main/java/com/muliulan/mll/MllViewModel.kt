package com.muliulan.mll

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

/**
 *    @author : zhaoCS
 *    date    : 2022/7/8 2:58 下午
 *    desc    :
 */
class MllViewModel : ViewModel() {

    private val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
        Log.e("mll 2222", throwable.toString())
    }

    fun launch(
        context: CoroutineContext = exceptionHandler,
        start: CoroutineStart = CoroutineStart.DEFAULT,
        block: suspend CoroutineScope.() -> Unit
    ): Job {
        return viewModelScope.launch(context, start, block)
    }


    fun  aa(){

        launch {
            intArrayOf().get(1)
        }

    }


}