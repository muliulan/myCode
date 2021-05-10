package com.muliulan.mll.code.`61-90`

import com.muliulan.mll.offer.TreeNode
import java.util.*

/**
描述:
zhaochenshuo
2021/5/10
 */

class Main71 {
    /**
     * 请考虑一棵二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
    举个例子，如上图所示，给定一棵叶值序列为 (6, 7, 4, 9, 8) 的树。
    如果有两棵二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
    如果给定的两个根结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。
     
    示例 1：
    输入：root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
    输出：true

    示例 2：
    输入：root1 = [1], root2 = [1]
    输出：true

    示例 3：
    输入：root1 = [1], root2 = [2]
    输出：false
    示例 4：
    输入：root1 = [1,2], root2 = [2,2]
    输出：true

    示例 5：
    输入：root1 = [1,2,3], root2 = [1,3,2]
    输出：false
     * */

    val arrayList1 = ArrayList<Int>()
    val arrayList2 = ArrayList<Int>()
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {

        aa(TreeNode.ab(), 1)
        aa(TreeNode.ab(), 2)

        if (arrayList1.size == arrayList2.size) {
            for (a in 0 until arrayList1.size) {
                if (arrayList1[a] != arrayList2[a]) {
                    return false
                }
            }
        } else {
            return false
        }
        return true
    }

    fun aa(root1: TreeNode?, a: Int) {
        if (root1 != null) {
            aa(root1.left, a)
            if (root1.left == null && root1.right == null) {
                val i = root1.`val`
                if (a == 1) {
                    arrayList1.add(i)
                } else {
                    arrayList2.add(i)
                }
            }
            aa(root1.right, a)
        }
    }

}