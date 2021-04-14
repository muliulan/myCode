package com.muliulan.mll

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import com.muliulan.mll.code.`31-60`.*
import com.muliulan.mll.code.code_offer.Off12
import java.util.*
//  ↖↑↗←↙↓↘→
class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentTimeMillis = System.currentTimeMillis()

        val codeAA = Main53().aa()
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


        val hashMap = HashMap<String, Int>()
        hashMap.put("q",2)
        hashMap.put("a",3)
        hashMap.put("c",1)

        hashMap.forEach { t, u ->
            Log.e("mll",t+"    "+u)
        }


        val treeNode1 = Main54.TreeNode(4)
        val treeNode2 = Main54.TreeNode(2)
        val treeNode3 = Main54.TreeNode(6)

        treeNode1.left=treeNode2
        treeNode1.right=treeNode3


        val treeNode4 = Main54.TreeNode(1)
        val treeNode5 = Main54.TreeNode(3)

        treeNode2.left=treeNode4
        treeNode2.right=treeNode5



        val minDiffInBST = Main54().minDiffInBST(treeNode1)
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