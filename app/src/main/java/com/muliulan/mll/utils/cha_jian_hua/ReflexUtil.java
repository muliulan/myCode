package com.muliulan.mll.utils.cha_jian_hua;

import android.util.Log;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * author: liumengqiang
 * Date : 2019/6/20
 * Description : 反射工具类
 */
public class ReflexUtil {
    /**
     * 获取类对象
     * @param className
     * @return
     */
    public static Object createObject(String className) {
        return createObject(className, new Class[]{}, new Object[]{});
    }

    /**
     * 获取类对象（1个参数）
     * @param className
     * @param paramType 参数类型
     * @param paramValue 参数值
     * @return
     */
    public static Object createObject(String className, Class paramType, Object paramValue) {
        Class[] paramsType = new Class[]{paramType};
        Object[] paramsValue = new Object[]{paramValue};
        return createObject(className, paramsType, paramsValue);
    }

    /**
     * 获取类对象（2个参数）
     * @param className
     * @param paramsType 参数类型
     * @param paramsValue 参数值
     * @return
     */
    public static Object createObject(String className, Class[] paramsType, Object[] paramsValue) {
        try {
            Class<?> aClass = Class.forName(className);
            Constructor<?> constructor = aClass.getDeclaredConstructor(paramsType);
            constructor.setAccessible(true);
            return constructor.newInstance(paramsValue);
        } catch(ClassNotFoundException e) {
            Log.e("createObject: ", "ClassNotFoundException");
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            Log.e("createObject: ", "NoSuchMethodException");
            e.printStackTrace();
        } catch (InstantiationException e) {
            Log.e("createObject: ", "InstantiationException");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            Log.e("createObject: ", "IllegalAccessException");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            Log.e("createObject: ", "InvocationTargetException");
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取静态方法
     * @param className
     * @param methodName
     * @return
     */
    public static Object invokeStaticMethod(String className, String methodName) {
        return invokeStaticMethod(className, methodName, new Class[]{}, new Object[]{});
    }

    /**
     *获取静态方法（1个参数）
     * @param className
     * @param methodName
     * @param paramType
     * @param paramValue
     * @return
     */
    public static Object invokeStaticMethod(String className, String methodName, Class paramType, Object paramValue) {
        return invokeStaticMethod(className, methodName, new Class[]{paramType}, new Object[]{paramValue});
    }

    /**
     * 获取静态方法（2个参数）
     * @param className
     * @param methodName 方法名
     * @param paramsType 方法参数类型
     * @param paramsValue 方法参数值
     * @return
     */
    public static Object invokeStaticMethod(String className, String methodName, Class[] paramsType, Object[] paramsValue ) {
        try {

            // 第一步：获取 IActivityManagerSingleton
            Class<?> aClass = Class.forName(className);
            Method method = aClass.getDeclaredMethod(methodName);
            method.setAccessible(true);
            return method.invoke(null);
        } catch (ClassNotFoundException e) {
            Log.e("----:", "" + e);
            e.printStackTrace();
        }  catch (IllegalAccessException e) {
            Log.e("----:", "" + e);
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取非静态实例方法
     * @param objectInstance
     * @param methodName
     * @return
     */
    public static Object invokeInstanceMethod(Object objectInstance, String methodName) {
        return invokeInstanceMethod(objectInstance, methodName, new Class[]{}, new Object[]{});
    }

    /**
     * 获取非静态实例方法（1个参数）
     * @param objectInstance
     * @param methodName
     * @param paramType
     * @param paramValue
     * @return
     */
    public static Object invokeInstanceMethod(Object objectInstance, String methodName, Class paramType, Object paramValue) {
        return invokeInstanceMethod(objectInstance, methodName, new Class[]{paramType}, new Object[]{paramValue});
    }

    /**
     * 获取非静态实例方法（2个方法）
     * @param objectInstance
     * @param methodName
     * @param paramsType
     * @param paramsValue
     * @return
     */
    public static Object invokeInstanceMethod(Object objectInstance, String methodName, Class[] paramsType, Object[] paramsValue) {
        try {
            Method method = objectInstance.getClass().getDeclaredMethod(methodName, paramsType);
            method.setAccessible(true);
            return method.invoke(objectInstance, paramsValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取非静态字段
     * @param className
     * @param fieldName
     * @return
     */
    public static Object getFieldValue(String className, Object objInstance, String fieldName) {
        try {
            Class<?> aClass = Class.forName(className);
            Field field = aClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(objInstance);
        } catch (NoSuchFieldException e) {
            Log.e("getFieldValue:", "NoSuchFieldException");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            Log.e("getFieldValue:", "IllegalAccessException");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            Log.e("getFieldValue:", "ClassNotFoundException");
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 设置非静态字段
     * @param className
     * @param fieldName
     * @param fieldValue
     */
    public static void setFieldValue(String className, Object objInstance, String fieldName, Object fieldValue) {
        try {
            Class<?> aClass = Class.forName(className);
            Field field = aClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(objInstance, fieldValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取静态字段
     * @param className
     * @param fieldName
     * @return
     */
    public static Object getStaticFieldValue(String className, String fieldName) {
        try {
            Class<?> aClass = Class.forName(className);
            Field declaredField = aClass.getDeclaredField(fieldName);
            declaredField.setAccessible(true);
            return declaredField.get(fieldName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 设置静态字段
     * @param className
     * @param fieldName
     * @param fieldValue
     */
    public static void setStaticFieldValue(String className, String fieldName, Object fieldValue ) {
        try {
            Class<?> aClass = Class.forName(className);
            Field field = aClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(null, fieldValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

