package com.muliulan.mll.dong_nao.dian_liang

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
描述:
zhaochenshuo
2021/5/10
 */

class PowerConnectionReceiver : BroadcastReceiver() {

    /**
     *  是否在充电的广播
     * 使用
     *         <receiver android:name=".dongnao.dian_liang.PowerConnectionReceiver">
     *              <intent-filter>
     *                  <action android:name="android.intent.action.ACTION_POWER_CONNECTED"/>
     *                  <action android:name="android.intent.action.ACTION_POWER_DISCONNECTED"/>
     *              </intent-filter>
     *          </receiver>
     * */
    override fun onReceive(context: Context?, intent: Intent?) {

        val action = intent?.action

        if (action == Intent.ACTION_POWER_CONNECTED) {
            //充电

        }

    }


}