package com.muliulan.mll.utils.photo

import CropParams
import CropPhotoContract
import SelectPhotoContract
import TakePhotoContract
import android.net.Uri
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 *    @author : zhaoCS
 *    date    : 2022/7/11 2:53 下午
 *    desc    :
 */
class DemoPhoto : AppCompatActivity() {

    private val imageView :ImageView =ImageView(this)

    // 剪裁图片
    private val cropPhoto = registerForActivityResult(CropPhotoContract()) { uri: Uri? ->
        if (uri != null) {
            imageView.setImageURI(uri)
        }
    }

    private val takePhoto = registerForActivityResult(TakePhotoContract()) { uri: Uri? ->
        if (uri != null) {
            if (true) {//是否裁剪
                cropPhoto.launch(CropParams(uri))
            } else {
                imageView.setImageURI(uri)
            }
        }
    }

    private val selectPhoto = registerForActivityResult(SelectPhotoContract()) { uri: Uri? ->
        if (uri != null) {
            // 返回的选择的图片uri
            if (true) {//是否裁剪
                // 需要剪裁图片，再调用剪裁图片的launch()方法
                cropPhoto.launch(CropParams(uri))
            } else {
                // 如果不剪裁图片，则直接显示
                imageView.setImageURI(uri)
            }
        } else {
            Log.e("mll", "您没有选择任何图片")
        }
    }

    fun aa() {

        View(this).setOnClickListener {
            //相机
            takePhoto.launch(null)
        }
        View(this).setOnClickListener {
            // 选择图片
            selectPhoto.launch(null)
        }


    }

}