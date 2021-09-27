package com.muliulan.mll.utils.cha_jian_hua

import android.content.Context
import android.content.Intent
import android.content.res.AssetManager
import android.content.res.Resources
import android.os.Build
import java.lang.reflect.Proxy
import java.util.logging.Handler

/**
name: zhaochenshuo
Date: 2021/9/16
https://www.bilibili.com/video/BV1x64y1x7JF?p=90&spm_id_from=pageDriver
 **/
class HookUtil {
    //已经在清单文件中注册的activity包名
    val packageName = "com.muliulan.mll"
    val className = "com.muliulan.mll.Bbbb"
    val apkPath = "sdcard/aaa.apk"

    val TARGET_INTENT = "target_intent"

    //1 吧插件中没有在清单文件注册的activity,替换成本地已经被注册的activity,进入ams去验证
    fun hookAMS() {
        //获取Singleton

        //不同版本的适配
        val iActivityManagerSingletonField = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val activitymanager = Class.forName("android.app.ActivityManager")
            activitymanager.getDeclaredField("IActivityManagerSingleton")
        } else {
            val activitymanager = Class.forName("android.app.ActivityManagerNative")
            activitymanager.getDeclaredField("gDefault")
        }
        iActivityManagerSingletonField.isAccessible = true
        val iActivityManagerSingleton = iActivityManagerSingletonField.get(null)//静态获取方式

        //通过Singleton 获取IActivityManager对象
        val singleton = Class.forName("android.util.Singleton")
        val mInstanceField = singleton.getDeclaredField("mInstance")
        mInstanceField.isAccessible = true
        val mInstance = mInstanceField.get(iActivityManagerSingleton)

        //通过动态代理替换系统的IActivityManager
        val iActivityManager = Class.forName("android.app.IActivityManager")
        Proxy.newProxyInstance(
            Thread.currentThread().contextClassLoader, arrayOf(iActivityManager)
        ) { proxy, method, args -> //执行 IActivityManager 的任何方法都会回调invoke
            if ("startActivity" == method.name) {
                //如果是调用startActivity方法 ,来修改intent参数
                args?.run {
                    var index = -1
                    for (a in 0 until size) {
                        if (this[a] is Intent) {
                            index = a
                        }
                    }
                    //插件没有注册的intent
                    val intent = args[index] as Intent

                    if (index != -1) {
                        val intentProxy = Intent()
                        intentProxy.setClassName(packageName, className)
                        intentProxy.putExtra(TARGET_INTENT, intent)
                        //替换成宿主已经注册的intent
                        args[index] = intentProxy
                    }
                }
            }
            method.invoke(mInstance, args)
        }

        //代理对象 替换系统对象   singleton=mInstance
        mInstanceField.set(singleton, mInstance)

    }

    //2 ams验证完成吧假的intent换成真的
    fun hookHandler() {
        //通过替换 activityThread中handler发出的msg,msg中存了intent对象
        //替换 handler->dispatchMessage()中的mCallback


        //先获取activityThread
        val claszz = Class.forName("android.app.ActivityThread")
        val sCurrentActivityThreadField = claszz.getDeclaredField("sCurrentActivityThread")
        sCurrentActivityThreadField.isAccessible = true
        val activityThread = sCurrentActivityThreadField.get(null)

        //通过activityThread获取mh对象
        val mHField = claszz.getDeclaredField("mH")
        mHField.isAccessible = true
        val mH = mHField.get(activityThread) as Handler

        val handlerClass = Class.forName("android.os.Handler")
        val mCallbackField = handlerClass.getDeclaredField("mCallback")
        mCallbackField.isAccessible = true


        val callback = android.os.Handler.Callback { msg ->
            when (msg.what) {
                //多个版本适配
                100 -> {
                    val intentField = msg.obj.javaClass.getDeclaredField("intent")
                    intentField.isAccessible = true
                    //获取的假的intent
                    val intent = intentField.get(msg.obj) as Intent
                    //拿到真的intent
                    val parcelableExtra = intent.getParcelableExtra<Intent>("TARGET_INTENT")
                    if (parcelableExtra != null) {
                        intentField.set(msg.obj, parcelableExtra)
                    }
                }
                159 -> {
                    val mActivityCallbacksField = msg.obj.javaClass.getDeclaredField("mActivityCallbacks")
                    mActivityCallbacksField.isAccessible = true
                    val list = mActivityCallbacksField.get(msg.obj) as MutableList<*>

                    list.forEach {
                        if (it != null) {
                            if (it.javaClass.name.equals("android.app.servertransaction.LaunchActivityItem")) {
                                val launchActivity = it
                                val mIntentField = launchActivity.javaClass.getDeclaredField("mIntent")
                                mIntentField.isAccessible = true
                                //假的intent
                                val intent = mIntentField.get(launchActivity) as Intent
                                //拿到真的intent
                                val parcelableExtra = intent.getParcelableExtra<Intent>("TARGET_INTENT")
                                if (parcelableExtra != null) {
                                    mIntentField.set(launchActivity, parcelableExtra)
                                }
                            }
                        }
                    }
                }
            }
            false
        }
        mCallbackField.set(mH, callback)
    }

    //加载插件的资源文件 单独创建一个 Resources
    //这个方法放到插件里面
    fun loadResources(context: Context): Resources {
        //创建assetManager
        val assetManager = AssetManager::class.java.newInstance()
        //添加插件的资源
        val addAssetPath = assetManager.javaClass.getMethod("addAssetPath", String::class.java)
        addAssetPath.invoke(assetManager, apkPath)
        //创建Resources 传入assetManager
        val resources = context.resources

        return Resources(assetManager, resources.displayMetrics, resources.configuration)
    }

}