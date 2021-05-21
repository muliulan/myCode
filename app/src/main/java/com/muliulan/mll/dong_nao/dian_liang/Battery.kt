package com.muliulan.mll.dong_nao.dian_liang

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.BatteryManager

/**
描述: 主动获取充电状态和网络状态的工具类
zhaochenshuo
2021/5/10
 */

class Battery {


    companion object {

        //是否在充电
        fun isPlugger(context: Context): Boolean {
            //发送一个包含充电状态的广播,并且粘性广播
            val intentFilter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
            val intent = context.registerReceiver(null, intentFilter)
            //获取充电状态
            val intExtra = intent?.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1)
            val b1 = intExtra == BatteryManager.BATTERY_PLUGGED_AC  //电源充电
            val b2 = intExtra == BatteryManager.BATTERY_PLUGGED_USB   //USB充电
            val b3 = intExtra == BatteryManager.BATTERY_PLUGGED_WIRELESS    //无线充电

            return b1 || b2 || b3
        }

        //是否在使用wifi
        fun isWifi(context: Context): Boolean {
            val connectivityManager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

            val activeNetworkInfo = connectivityManager.activeNetworkInfo
            if (null != activeNetworkInfo && activeNetworkInfo.isConnected && activeNetworkInfo.type == ConnectivityManager.TYPE_WIFI) {
                return true
            }
            return false
        }

    }

}