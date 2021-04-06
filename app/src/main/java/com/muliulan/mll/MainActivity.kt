package com.muliulan.mll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.muliulan.mll.code.`31-60`.*
import com.muliulan.mll.code.code_offer.Off12
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentTimeMillis = System.currentTimeMillis()

        val codeAA = Main48().aa()
        Log.e("mll_codeAA", "$codeAA   ${System.currentTimeMillis() - currentTimeMillis}")

//        val offerAA = Offer6().aa()
//        Log.e("mll_offerAA", "$offerAA   ${System.currentTimeMillis() - currentTimeMillis}")
//        Log.e("mll_codeaaaaaa","${System.nanoTime()}      ${  System.currentTimeMillis()}")


//        val fd = contentResolver.openFileDescriptor(uri, "r")
//        if (fd != null) {
//            val bitmap = BitmapFactory.decodeFileDescriptor(fd.fileDescriptor)
//            fd.close()
//            imageView.setImageBitmap(bitmap)
//        }

    }

    fun aa(arr: IntArray, le: Int = 0, ri: Int = arr.size - 1) {
        var left: Int = le
        var right: Int = ri
        val x = arr[left]
        var type = true

        L1@//标签
        while (left < right) {
            if (type) {
                //从右向左
                for (a in right downTo left) {
                    if (arr[a] <= x) {
                        arr[left++] = arr[a]
                        right = a
                        type = !type
                        continue@L1 //回到L1的位置
                    }
                }
                //如果上面的if没有进入 就让两个指针重合
                left = right
            } else {
                //从左到右
                for (a in left until right) {
                    if (arr[a] >= x) {
                        arr[right--] = arr[a]
                        left = a
                        type = !type
                        continue@L1 //回到L1的位置
                    }
                }
                //如果上面的if没有进入 就让两个指针重合
                left = right
            }
        }
        //把最后找到的值 放入中间位置
        arr[left] = x
        aa(arr, le, left - 1)
        aa(arr, left + 1, ri)
    }

}