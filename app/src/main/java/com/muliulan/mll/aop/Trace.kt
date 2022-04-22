//package com.muliulan.mll.aop
//
//import android.app.Activity
//import android.content.Context
//import android.content.pm.ActivityInfo
//import android.text.TextUtils
//import org.aspectj.lang.ProceedingJoinPoint
//import org.aspectj.lang.annotation.*
//
///**
// *    @author : zhaoCS
// *    date    : 2022/4/18 4:25 下午
// *    desc    :
// */
//
//@Aspect
//class Trace {
//
//
//    // 1、定义一个切入点方法 baseCondition，用于排除 argusapm 中相应的类。
//    @Pointcut("!within(com.argusapm.android.aop.*) && !within(com.argusapm.android.core.job.activity.*)")
//    fun baseCondition() {
//
//    }
//
//    // 2、定义一个切入点 applicationOnCreate，用于执行 Application 的 onCreate方法。
//    @Pointcut("execution(* android.app.Application.onCreate(android.content.Context)) && args(context)")
//    fun applicationOnCreate(context: Context) {
//
//    }
//
//    // 3、定义一个后置通知 applicationOnCreateAdvice，用于在 application 的 onCreate 方法执行完之后插入 AH.applicationOnCreate(context) 这行代码。
//    @After("applicationOnCreate(context)")
//    fun applicationOnCreateAdvice(context: Context) {
//        AH.applicationOnCreate(context)
//    }
//
//    // 4、定义一个切入点，用于执行 Application 的 attachBaseContext 方法。
//    @Pointcut("execution(* android.app.Application.attachBaseContext(android.content.Context)) && args(context)")
//    fun applicationAttachBaseContext(context: Context) {
//    }
//
//    // 5、定义一个前置通知，用于在 application 的 onAttachBaseContext 方法之前插入 AH.applicationAttachBaseContext(context) 这行代码。
//    @Before("applicationAttachBaseContext(context)")
//    fun applicationAttachBaseContextAdvice(context: Context) {
//        AH.applicationAttachBaseContext(context)
//    }
//
//    // 6、定义一个切入点，用于执行所有 Activity 中以 on 开头的方法，后面的 ”&& baseCondition()“ 是为了排除 ArgusAPM 中的类。
//    @Pointcut("execution(* android.app.Activity.on**(..)) && baseCondition()")
//    fun activityOnXXX() {
//    }
//
//    // 7、定义一个环绕通知，用于在所有 Activity 的 on 开头的方法中的开始和结束处插入相应的代码。（排除了 ArgusAPM 中的类）
//    @Around("activityOnXXX()")
//    fun activityOnXXXAdvice(proceedingJoinPoint: ProceedingJoinPoint): Any? {
//        try {
//            val activity = proceedingJoinPoint.getTarget() as Activity
//            //        Log.d("AJAOP", "Aop Info" + activity.getClass().getCanonicalName() +
//            //                "\r\nkind : " + thisJoinPoint.getKind() +
//            //                "\r\nargs : " + thisJoinPoint.getArgs() +
//            //                "\r\nClass : " + thisJoinPoint.getClass() +
//            //                "\r\nsign : " + thisJoinPoint.getSignature() +
//            //                "\r\nsource : " + thisJoinPoint.getSourceLocation() +
//            //                "\r\nthis : " + thisJoinPoint.getThis()
//            //        );
//            val startTime = System.currentTimeMillis();
//            val result = proceedingJoinPoint.proceed();
//            val activityName = activity.javaClass.canonicalName
//
//            val signature = proceedingJoinPoint.signature
//            var sign = ""
//            var methodName = ""
//            if (signature != null) {
//                sign = signature.toString()
//                methodName = signature.name
//            }
//
//            if (!TextUtils.isEmpty(activityName) && !TextUtils.isEmpty(sign) && sign.contains(
//                    activityName
//                )
//            ) {
//                AH.invoke(activity, startTime, methodName, sign)
//            }
//            return result
//        } catch (e: Exception) {
//            e.printStackTrace();
//        } catch (throwable: Throwable) {
//            throwable.printStackTrace();
//        }
//        return null
//    }
//
//
//}
//
//class AH {
//    companion object {
//        fun applicationOnCreate(context: Context) {
//
//        }
//
//        fun applicationAttachBaseContext(context: Context) {
//            val currentTimeMillis = System.currentTimeMillis()
//        }
//
//        fun invoke(activity: Activity, startTime: Long, methodName: String, sign: String) {
//
//            //1是否开启检测 并且是debug模式
//            val isRunning=true
//            if(!isRunning){
//                return
//            }
//            //2
//            if(methodName=="onCreate"){
//                //如果是onCreate 通过变量判断是不是第1次执行->认为是冷启动
//                //在加载第一帧的时候会post一个Runnable
//
//
//            }else{
//                //3
//
//            }
//
//
//
//        }
//
//    }
//}