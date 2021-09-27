package com.muliulan.mll.utils

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.lifecycle.MutableLiveData

/**
name: zhaochenshuo
Date: 2021/9/7
通过自定义liveData 获取网络状态变化

 **/
class NetworkLiveData private constructor(cotext: Context) : MutableLiveData<NetworkInfo>() {

    private val mContext: Context by lazy {
        cotext.applicationContext
    }

    private val mNetworkReceiver by lazy {
        NetworkReceiver()
    }
    private val mIntentFilter by lazy {
        IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
    }

    companion object {
        private var instance: NetworkLiveData? = null
        fun getInstance(context: Context): NetworkLiveData {
            if (instance == null) {
                synchronized(NetworkLiveData::class) {
                    if (instance == null) {
                        instance = NetworkLiveData(context)
                    }
                }
            }
            return instance!!
        }

    }

    override fun onActive() {
        super.onActive()
        mContext.registerReceiver(mNetworkReceiver, mIntentFilter);
    }

    override fun onInactive() {
        super.onInactive()
        mContext.unregisterReceiver(mNetworkReceiver);
    }

}

class NetworkReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val manager = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
         NetworkLiveData.getInstance(context).value = manager.activeNetworkInfo
    }

}