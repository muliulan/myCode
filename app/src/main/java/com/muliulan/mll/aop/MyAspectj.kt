package com.muliulan.mll.aop

import android.app.Activity
import android.util.Log
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.aspectj.lang.reflect.MethodSignature
import org.json.JSONObject
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

//package com.muliulan.mll.aop
//
//import org.aspectj.lang.annotation.Aspect
//import org.aspectj.lang.annotation.Pointcut
//
///**
// * @author : zhaoCS
// * date    : 2022/3/144:05 下午
// * desc    : Aspectj 例子
// */
////防止多点击
//@Target(AnnotationTarget.FUNCTION)
//@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
//annotation class MyClick(val time: Long = 2000)
//
//
//
//@Pointcut("execution(@com.muliulan.mll.aop.MyClick * *(..))")
//@Aspect
//class ClickAspect{
//
//
//}
@Aspect
class MyAspectj {
//
//    /**
//    1）、Before：PointCut 之前执行。
//    2）、After：PointCut 之后执行。
//    3）、Around：PointCut 之前、之后分别执行。
//     *
//     * */
//
//    /**
//    @Pointcut("execution(" +//执行语句
//    "@com.kotlinstrong.utils.aspect.MyAnnotationOnclick" +//注解筛选
//    "*" + //类路径,*为任意路径
//    "*" + //方法名,*为任意方法名
//    "(..)" +//方法参数,'..'为任意个任意类型参数
//    ")" +
//    " && " +//并集
//    )
//
//    @Aspect：声明切面，标记类
//    @Pointcut(切点表达式)：定义切点，标记方法
//    @Before(切点表达式)：前置通知，切点之前执行
//    @Around(切点表达式)：环绕通知，切点前后执行
//    @After(切点表达式)：后置通知，切点之后执行
//    @AfterReturning(切点表达式)：返回通知，切点方法返回结果之后执行
//    @AfterThrowing(切点表达式)：异常通知，切点抛出异常时执行
//     * */
//
//    @Pointcut("execution(* com.muliulan.mll.MainActivity.on*(..))")
//    fun aa() {
//        //定义一个切点
//    }
//
//    //查询类中每个方法执行的时间
//    @Around("aa()")
//    fun onResumeMethod(joinPoint: ProceedingJoinPoint) {
//        val currentTimeMillis = System.currentTimeMillis()
//        val name = joinPoint.signature.name
//        joinPoint.proceed()
//
//
//        val activity = joinPoint.getTarget() as Activity
//        val simpleName = activity.javaClass.simpleName//类名
//        val name1 = activity.javaClass.name//全包名
//
//        Log.e("helloAOP", "$name    ${System.currentTimeMillis() - currentTimeMillis}")
//    }
//
//    //防止重复点击
//    private var lastTime = 0L
//    private val INTERVAL = 300L
//
//    @Around("execution(* android.view.View.OnClickListener.onClick(..))")
//    fun clickIntercept(joinPoint: ProceedingJoinPoint) {
//        if (System.currentTimeMillis() - lastTime >= INTERVAL) {
//            Log.e("helloAOP", "点击了")
//            lastTime = System.currentTimeMillis()
////            joinPoint.proceed()
//        } else {
//            Log.e("helloAOP", "重复点击了")
//        }
//    }
//
//    //注解 埋点
////    @Around("execution(* com.muliulan.mll.aop.TrackEvent.**(..))")
//    fun ddd(joinPoint: ProceedingJoinPoint) {
//        //获取方法上面的注解
//        val signature = joinPoint.signature as MethodSignature
//        val trackEvent = signature.method.getAnnotation(TrackEvent::class.java)
//        val jsonObject = JSONObject()
//        val eventName = trackEvent.eventName
//        val eventId = trackEvent.eventId
//        jsonObject.put("eventName", eventName)
//        jsonObject.put("eventId", eventId)
//        Log.e("helloAOP", "eventName->${eventName}  eventId->${eventId}")
//
//        //获取方法参数的注解
//        val parameterAnnotations = signature.method.parameterAnnotations
//        if (parameterAnnotations.isNotEmpty()) {
//            var i = 0
//            parameterAnnotations.forEach { it ->
//                it.forEach {
//                    if (it is TrackParameter) {
//                        jsonObject.put(it.value, joinPoint.args[i++])
//                    }
//                }
//
//            }
//
//        }
//        Log.e("helloAOP", "jsonObject->${jsonObject}")
//
//    }


}

//注解 埋点
@Retention(RetentionPolicy.RUNTIME)
annotation class TrackEvent(val eventName: String = "", val eventId: String = "")

@Target(AnnotationTarget.VALUE_PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
annotation class TrackParameter(val value: String = "")



