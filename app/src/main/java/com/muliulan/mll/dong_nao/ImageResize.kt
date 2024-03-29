package com.muliulan.mll.dong_nao

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import androidx.core.graphics.PathUtils
import java.io.File
import java.io.FileOutputStream

/**
描述:     图片压缩
zhaochenshuo
2021/5/10
 */
class ImageResize {

    /***
     * 调用
     *         Bitmap bitmap2=ImageResize.resizeBitmap(getApplicationContext(),R.mipmap.wyz_p,373,459,false);
     */


    /**
     * 缩放bitmap
     * @param reusable 是否复用
     */
    fun resizeBitmap(
        context: Context,
        id: Int,
        maxW: Int,
        maxH: Int,
        hasAlpha: Boolean,
        reusable: Bitmap?
    ): Bitmap {
        val resources = context.resources
        val options = BitmapFactory.Options()
        // 只解码出 outxxx参数 比如 宽、高
        options.inJustDecodeBounds = true
        BitmapFactory.decodeResource(resources, id, options)
        //根据宽、高进行缩放
        val w = options.outWidth
        val h = options.outHeight
        //设置缩放系数
        options.inSampleSize = calcuteInSampleSize(w, h, maxW, maxH)
        if (!hasAlpha) {
            options.inPreferredConfig = Bitmap.Config.RGB_565
        }
        options.inJustDecodeBounds = false
        //设置成能复用
        if (null != reusable) {
            options.inMutable = true
            options.inBitmap = reusable
        }
        return BitmapFactory.decodeResource(resources, id, options)
    }

    /**
     * 计算缩放系数
     *
     * @param w
     * @param h
     * @param maxW
     * @param maxH
     * @return 缩放的系数
     */
    private fun calcuteInSampleSize(w: Int, h: Int, maxW: Int, maxH: Int): Int {
        var inSampleSize = 1
        if (w > maxW && h > maxH) {
            inSampleSize = 2
            //循环 使宽、高小于 最大的宽、高
            while (w / inSampleSize > maxW && h / inSampleSize > maxH) {
                inSampleSize *= 2
            }
        }
        inSampleSize /= 2
        return inSampleSize
    }


// /com.popmart.global.debug E/mll: /storage/emulated/0/Android/data/com.popmart.global.debug/files/pop_image/1639473869717464.jpeg
    //本地图片保存
    private fun saveImage(bitmap: Bitmap): String {
        var fileName = ""
        try {
//            fileName = PathUtils.getExternalAppDataPath() + "/files/pop_image" // 使用auc使用auc使用auc使用auc

            val file = File(fileName)
            if (!file.exists()) {
                file.mkdirs()
            }

            fileName = file.toString() + "/IM_${System.currentTimeMillis()}.jpg"
            val out = FileOutputStream(fileName)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out)
            out.flush()
            out.close()
        } catch (e: Exception) {
            e.printStackTrace()
            Log.e("mll 图片存储异常", e.toString())
        }

        return fileName
    }

}