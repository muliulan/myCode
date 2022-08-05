package com.muliulan.mll.utils

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Context.NOTIFICATION_SERVICE
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import androidx.core.app.NotificationCompat
import com.muliulan.mll.R


/**
 *    @author : zhaoCS
 *    date    : 2022/7/11 2:19 下午
 *    desc    : 通知栏 通知
 */
class MllNotification {

//   震动权限   <uses-permission android:name="android.permission.VIBRATE"/>
    companion object {


        //普通通知
        fun aaa(
            context: Context,
            intent: Intent,
            mNormalChannelId: String,
            mNormalChannelName: String,
            mNormalNotificationId: Int

        ) {
            (context.getSystemService(NOTIFICATION_SERVICE) as? NotificationManager)?.run {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    createNotificationChannel(NotificationChannel(
                        mNormalChannelId,
                        mNormalChannelName,
                        NotificationManager.IMPORTANCE_LOW
                    ).apply {
                        description = "描述"// 用户在系统设置中看到的说明
                        setShowBadge(false) // 是否在桌面显示角标
                        enableVibration(true)
                    })
                }
                val mBuilder = NotificationCompat.Builder(context, mNormalChannelId)
                    .setContentTitle("普通通知") // 标题
                    .setContentText("普通通知内容") // 文本
                    .setSmallIcon( R.mipmap.ic_launcher) // 小图标
                    .setLargeIcon(
                        BitmapFactory.decodeResource(
                            context.resources,
                             R.mipmap.qqqq
                        )
                    ) // 大图标
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT) // 7.0 设置优先级
                    .setContentIntent(
                        PendingIntent.getActivity(
                            context,
                            0,
                            intent,
                            PendingIntent.FLAG_IMMUTABLE
                        )
                    ) // 跳转配置 setDeleteIntent 移除意图
                    .setAutoCancel(true) // 是否自动消失（点击）
                // 发起通知
                notify(mNormalNotificationId, mBuilder.build())
            }
        }

        //重要通知
        fun bbb(
            context: Context,
            intent: Intent,
            mHighChannelId: String,
            mHighChannelName: String,
            mHighNotificationId: Int
        ) {
            (context.getSystemService(NOTIFICATION_SERVICE) as? NotificationManager)?.run {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    createNotificationChannel(NotificationChannel(
                        mHighChannelId,
                        mHighChannelName,
                        NotificationManager.IMPORTANCE_HIGH
                    ).apply {
                        description = "描述"
                        setShowBadge(false) // 是否在桌面显示角标
                        enableVibration(true)//声音和震动
                    })
                }
                val mBuilder = NotificationCompat.Builder(context, mHighChannelId)
                    .setContentTitle("重要通知重要通知重要通知重要通知重要通知重要通知重要通知重要通知重要通知重要通知重要通知重要通知重要通知重要通知重要通知")
                    .setContentText("重要通知内容重要通知内容重要通知内容重要通知内容重要通知内容重要通知内容重要通知内容重要通知内容重要通知内容重要通知内容重要通知内容重要通知内容重要通知内容")
                    .setSmallIcon( R.mipmap.ic_launcher)
                    .setLargeIcon(
                        BitmapFactory.decodeResource(
                            context.resources,
                             R.mipmap.qqqq
                        )
                    )
                    .setAutoCancel(true)
                    .setContentIntent(
                        PendingIntent.getActivity(
                            context,
                            0,
                            intent,
                            PendingIntent.FLAG_IMMUTABLE
                        )
                    ) // 跳转配置 setDeleteIntent 移除意图
                    .setCategory(NotificationCompat.CATEGORY_MESSAGE) // 通知类别，"勿扰模式"时系统会决定要不要显示你的通知
                    .setVisibility(NotificationCompat.VISIBILITY_PRIVATE) // 屏幕可见性，锁屏时，显示icon和标题，内容隐藏
                notify(mHighNotificationId, mBuilder.build())
            }
        }

        //大图片通知
        fun ccc(
            context: Context,
            intent: Intent,
            mBigImageChannelId: String,
            mBigImageChannelName: String,
            mBigImageNotificationId: Int
        ) {
            (context.getSystemService(NOTIFICATION_SERVICE) as? NotificationManager)?.run {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    createNotificationChannel(
                        NotificationChannel(
                            mBigImageChannelId,
                            mBigImageChannelName,
                            NotificationManager.IMPORTANCE_DEFAULT
                        ).apply {
                            description = "描述"// 用户在系统设置中看到的说明
                            setShowBadge(true) // 是否在桌面显示角标
                        }
                    )
                }

                val mBuilder =
                    NotificationCompat.Builder(context, mBigImageChannelId)
                        .setContentTitle("大图片通知")
                        .setContentText("展开看看")
                        .setStyle(
                            NotificationCompat.BigPictureStyle()
                                .setBigContentTitle("11111")
                                .setSummaryText("22222222222")
                                .bigPicture(
                                    BitmapFactory.decodeResource(
                                        context.resources,
                                        R.drawable.node_unreached
                                    )
                                )
                        )
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setLargeIcon(
                            BitmapFactory.decodeResource(
                                context.resources,
                                R.mipmap.qqqq
                            )
                        )
                        .setAutoCancel(true)
                notify(mBigImageNotificationId, mBuilder.build())
            }

        }


    }

}