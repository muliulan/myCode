package com.muliulan.mll.utils

import android.os.Handler
import android.os.Looper
import androidx.annotation.MainThread
import androidx.lifecycle.LiveData

/**
 * name: zhaochenshuo
 * Date: 2021/9/8
 * 通过自定义liveData 计时器

 *
 */
class TimerGlobalLiveData : LiveData<Int>() {

    private val handler by lazy {
        Handler(Looper.getMainLooper())
    }

    private val timerRunnable by lazy {
        object : Runnable {
            override fun run() {
                postValue(count++)
                handler.postDelayed(this, 1000)
            }
        }
    }

    private var count = 0

    companion object {

        private lateinit var sInstance: TimerGlobalLiveData

        @MainThread
        fun get(): TimerGlobalLiveData {
            sInstance = if (::sInstance.isInitialized) sInstance else TimerGlobalLiveData()
            return sInstance
        }
    }


    fun startTimer() {
        count = 0
        handler.postDelayed(timerRunnable, 1000)
    }

    fun cancelTimer() {
        handler.removeCallbacks(timerRunnable)
    }

}