package com.muliulan.mll.code.`91-120`

import com.muliulan.mll.offer.TreeNode
import java.util.*

/**
name: zhaochenshuo
Date: 2021/7/27
 **/

class Main120 {
    val arrayList = ArrayList<Int>()

    fun aa(): Int {

        val root: TreeNode? = TreeNode.ab()
        bb(root)
        arrayList.sort()

        var min=arrayList[0]
        arrayList.forEach {
            if(min<it){
                return it
            }
        }
        return 1
    }

    fun bb(root: TreeNode?) {
        if (root == null) {
            return
        }
        bb(root.left)
        arrayList.add(root.`val`)
        bb(root.right)

    }


}
