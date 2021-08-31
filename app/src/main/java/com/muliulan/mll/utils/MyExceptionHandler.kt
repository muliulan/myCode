package com.muliulan.mll.utils

import android.content.Context

/**
name: zhaochenshuo
Date: 2021/8/20
 **/
class MyExceptionHandler(context: Context) : Thread.UncaughtExceptionHandler {

    val mContext = context

    //系统默认的ExceptionHandler
    val defaultUncaughtExceptionHandler by lazy {
        Thread.getDefaultUncaughtExceptionHandler()
    }

    /**
     * 捕获崩溃信息并上报
     *
     * */

    init {

        //吧自定义的ExceptionHandler设置给系统
        Thread.setDefaultUncaughtExceptionHandler(this)
    }


    override fun uncaughtException(t: Thread, e: Throwable) {

//        if (handdefaultUncaughtExceptionHandler != null) {
//            //处理不了交给系统
//            defaultUncaughtExceptionHandler.uncaughtException(t, e)
//        } else {
//            //自己处理
//
//        }
    }


}