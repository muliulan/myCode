package com.muliulan.mll

import android.content.Context
import android.util.Log
import androidx.multidex.MultiDexApplication

/**
描述:
zhaochenshuo
2021/5/12
 */

class MyApplication : MultiDexApplication(){


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()
    }




}