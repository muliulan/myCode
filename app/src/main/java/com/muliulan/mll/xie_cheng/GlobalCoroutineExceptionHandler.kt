package com.muliulan.mll.xie_cheng

import android.util.Log
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlin.coroutines.CoroutineContext

/**
 *    @author : zhaoCS
 *    date    : 2022/2/184:01 下午
 *    desc    :
 *      全局协程 异常捕获
 *
 *
/**
 * 然后在 classpath 中创建 META-INF/services/kotlinx.coroutines.CoroutineExceptionHandler，文件名实际上就是 CoroutineExceptionHandler 的全类名，文件内容就写我们的实现类的全类名：
 *
 * */
 *
 */
class GlobalCoroutineExceptionHandler : CoroutineExceptionHandler {

    override val key: CoroutineContext.Key<*> = CoroutineExceptionHandler

    override fun handleException(context: CoroutineContext, exception: Throwable) {
        Log.e("mll 全局异常捕获", " ${Log.getStackTraceString(exception)}")
    }


}



