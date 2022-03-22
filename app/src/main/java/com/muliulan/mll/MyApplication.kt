package com.muliulan.mll

import android.content.Context
import androidx.multidex.MultiDexApplication

/**
描述:
zhaochenshuo
2021/5/12
 */

class MyApplication : MultiDexApplication(){


    // activityThread 创建Application之后调用的第一个方法
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

}