package com.muliulan.mll.dong_nao.dian_liang

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
描述:
zhaochenshuo
2021/5/10
 */

class WifiReceiver : BroadcastReceiver() {

    /**
     * 是否链接 wifi的广播
     * 使用
     *        <receiver android:name=".dongnao.dian_liang.WifiReceiver" >
     *              <intent-filter>
     *                  <action android:name="android.net.conn.CONNECTIVITY_CHANGE" />
     *              </intent-filter>
     *          </receiver>
     *
     * */

    override fun onReceive(context: Context?, intent: Intent?) {
        if (Battery.isWifi(context!!)) {
            //在使用wifi

        }

    }
}