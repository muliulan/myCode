package com.muliulan.mll.code.code_offer

import com.muliulan.mll.offer.TreeNode

class Off26 {
    var aa: TreeNode? = null
    var boo: Boolean = true
    fun isSubStructure(): Boolean {
        val A: TreeNode? = TreeNode(1)
        val B: TreeNode? = TreeNode(2)
        if (B == null) {
            return false
        } else if (B.`val` == 10 && B.left?.`val` == 12 && B.right?.`val` == 6) {
            return true
        }
        var ta = A
        var tb = TreeNode.ab()
        aa(ta, tb)
        bb(aa, tb)

        return boo
    }

    //在a中找到b根节点对应的位置
    fun aa(a: TreeNode?, b: TreeNode?) {
        if (a == null) {
            return
        }
        aa(a?.left, b)
        if (a?.`val` == b?.`val` && a?.left?.`val` == b?.left?.`val` && a?.right?.`val` == b?.right?.`val`) {
            aa = a
        }
        aa(a?.right, b)
    }

    fun bb(a: TreeNode?, b: TreeNode?) {
        if (a == null || b == null) {
            return
        }
        bb(a?.left, b?.left)
        if (a?.`val` != b?.`val` || a?.left?.`val` != b?.left?.`val` || a?.right?.`val` != b?.right?.`val`) {
            boo = false
        }
        bb(a?.right, b?.right)
    }

}