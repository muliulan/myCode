package com.muliulan.mll.utils.cha_jian_hua;

import android.annotation.SuppressLint;
import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : zhaoCS
 * date    : 2021/11/1212:16 下午
 * desc    :
 */
public class Daaa {

    /**
     * hook getService()
     */
    @SuppressLint("PrivateApi")
    public void hookGetService() {
        //获取IActivityManagerSingleton对象
        Object iActivityManagerSingleton =
                ReflexUtil.getStaticFieldValue("android.app.ActivityManager", "IActivityManagerSingleton");
        //获取单例对象中的mInstance字段
        Object mSingletonInstance =
                ReflexUtil.getFieldValue("android.util.Singleton", iActivityManagerSingleton, "mInstance");
        Class<?> classInterface = null;
        try {
            classInterface = Class.forName("android.app.IActivityManager");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //创建自己的代理对象
        Object proxyInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class[]{classInterface},
                new SingletonProxy(mSingletonInstance));
        //将单例对象中的字段替换
        ReflexUtil.setFieldValue("android.util.Singleton", iActivityManagerSingleton, "mInstance", proxyInstance);
    }

}
class SingletonProxy implements InvocationHandler {

    private Object mBase;

    public SingletonProxy(Object mBase) {
        this.mBase = mBase;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Log.e("--------:", "hook successful" + method.getName());

        if("startActivity".equals(method.getName())) {
            Log.e("--------:", "hook successful ");
        }
        return method.invoke(mBase, objects);
    }
}

