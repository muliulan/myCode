//package com.muliulan.mll.ddddddddd
//
//import android.provider.SyncStateContract
//import android.text.TextUtils
//import android.widget.Switch
//
///**
//描述:
//zhaochenshuo
//2021/5/15
// */
//
//class A :BaseUrl(){ }
//class B :BaseUrl(){ }
//abstract class BaseUrl {
//    fun baseurl(): String {
//        return if (TextUtils.isEmpty(getType())) {
//            getUrl()
//        } else {
//            "http" + getType()
//        }
//    }
//
//    fun aurl(): String {
//        return if (TextUtils.isEmpty(url1())) {
//            url1()
//        } else {
//            "aaaaa"
//        }
//    }
//
//    fun burl(): String {
//        return if (!TextUtils.isEmpty(burl2())) {
//            burl2()
//        } else {
//            "bbb"
//        }
//    }
//
//    abstract fun getUrl(): String
//    abstract fun getType(): String
//
//
//    abstract fun url1(): String
//    abstract fun burl2(): String
//
//}
//fun dd(){
//    var base:BaseUrl=null
//    Switch(aa){ a->{
//        base=a
//    }
//        b->{
//            base=b
//        }
//
//    }
//
//    RetrofitUrlManager.getInstance().putDomain("extension_hz", base.baseurl())
//    RetrofitUrlManager.getInstance().putDomain("credits",base.aurl())
//}
//
