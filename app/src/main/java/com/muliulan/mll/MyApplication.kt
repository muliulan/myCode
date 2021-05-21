package com.muliulan.mll

import android.app.Application
import android.content.Context

/**
描述:
zhaochenshuo
2021/5/12
 */

class MyApplication : Application() {


    // activityThread 创建Application之后调用的第一个方法
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)


    }

}