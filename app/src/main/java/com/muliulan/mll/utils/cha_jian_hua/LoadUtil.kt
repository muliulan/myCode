package com.muliulan.mll.utils.cha_jian_hua

import android.content.Context
import dalvik.system.DexClassLoader

/**
name: zhaochenshuo
Date: 2021/9/16
 **/
class LoadUtil {

    //插件apk的路径
    val apkPath="sdcard/aaa.apk"

    //加载插件apk里面的类
    fun loadClass(context: Context){
        val dexPahtList = Class.forName("dalvik.system.DexPathList")
        val dexElements = dexPahtList.getDeclaredField("dexElements")
        dexElements.isAccessible=true

        val classLoaderClass = Class.forName("dalvik.system.BaseDexClassLoader")
        val pathList = classLoaderClass.getDeclaredField("pathList")
        pathList.isAccessible=true

        val pathClassLoader = context.classLoader
        val hostPathList = pathList.get(pathClassLoader)
        //1 宿主的dexElement数组
        val hostDexElement = dexElements.get(hostPathList) as Array<*>


        //2 获取插件的dexElement数组需要自定义classLoader
        val pluginClassLoader = DexClassLoader(apkPath, context.cacheDir.absolutePath, null, pathClassLoader)
        val pluginPathList = pathList.get(pluginClassLoader)
        val pluginDexElements = dexElements.get(pluginPathList) as Array<*>


        //3 合并宿主的数组和插件的数组
        val newInstance = java.lang.reflect.Array.newInstance(hostDexElement.javaClass.componentType,
            hostDexElement.size + pluginDexElements.size)as Array<*>

        System.arraycopy(hostDexElement,0,newInstance,0,hostDexElement.size)
        System.arraycopy(pluginDexElements,0,newInstance,hostDexElement.size,hostDexElement.size)

        //4 将合并后的数组赋值给宿主的数组
        //hostDexElement=newInstance
        dexElements.set(hostPathList,newInstance)

        //5 就可以通过class.forname("")获取到插件里面的类了
    }
}