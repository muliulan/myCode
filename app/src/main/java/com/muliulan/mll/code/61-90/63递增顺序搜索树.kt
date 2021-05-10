package com.muliulan.mll.code.`61-90`

import com.muliulan.mll.code.`31-60`.Main54
import com.muliulan.mll.offer.TreeNode
import com.muliulan.mll.shuju_jiegou._4HaffmanTree
import java.util.*

/**
描述:
zhaochenshuo
2021/4/25
 */

class Main63 {

    /**
     * 给你一棵二叉搜索树，请你 按中序遍历 将其重新排列为一棵递增顺序搜索树，使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。
     

    示例 1：
    输入：root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
    输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

    示例 2：
    输入：root = [5,1,7]
    输出：[1,null,5,null,7]

    提示：
    树中节点数的取值范围是 [1, 100]
    0 <= Node.val <= 1000
     *
     * */
    val arrayList = ArrayList<Int>()

    fun increasingBST(root: TreeNode?): TreeNode? {
        val ab = TreeNode.ab()
        aa(ab)
        arrayList.sort()
        val treeNode = TreeNode(arrayList[0])
        var aa=treeNode
        for(a in 1 until arrayList.size){
            val treeNode1 = TreeNode(arrayList[a])
            aa.right=treeNode1
            aa = treeNode1
        }
        return root
    }


    fun aa(root: TreeNode?) {
        if (root == null) {
            return
        }
        aa(root.left)
        arrayList.add(root.`val`)
        aa(root.right)
    }


}