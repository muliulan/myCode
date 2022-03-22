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