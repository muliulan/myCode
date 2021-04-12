package com.muliulan.mll.shuju_jiegou

import android.util.Log

/**
描述: 搜索二叉树
zhaochenshuo
2021/3/31
 */


class _3SearchTree<E> {

    var root: Node<Int>? = null

    //添加节点
    fun put(n: Int): Node<Int>? {
        val node = Node<Int>(n)
        if (root == null) {
            root = node
            return node
        }

        var mR = root
        var parent = mR
        while (mR != null) {
            parent = mR
            if (n > mR.item) {
                mR = mR.right
            } else if (n < mR.item) {
                mR = mR.left
            } else {
                return mR
            }
        }

        if (n > parent?.item!!) {
            parent.right = node
        } else {
            parent.left = node
        }
        node.parent = parent

        return node
    }

    //查找
    fun get(n: Int): Node<Int>? {
        if (root == null) {
            return null
        }
        var mr = root
        while (mr != null) {
            if (mr.item == n) {
                return mr
            } else if (mr.item < n) {
                mr = mr.right
            } else if (mr.item > n) {
                mr = mr.left
            }
        }
        return null
    }

    //删除节点
    fun remove(n: Node<Int>) {
        val parent = n.parent
        val left = n.left
        val right = n.right

        if (left == null && right == null) {
            //左右都没有节点
            if (parent == null) {
                root = null
            } else {
                if (parent.left == n) {
                    parent.left = null
                } else if (parent.right == n) {
                    parent.right = null
                }
                n.parent = null
            }
        } else if (left != null && right == null) {
            if (parent == null) {
                n.parent = null
                n.left?.parent = null
                root = n.left
            } else {
                if (parent.left == n) {
                    //是父亲的左节点
                    parent.left = n.left
                } else {
                    //是父亲的右节点
                    parent.right = n.left
                }
                n.left?.parent = parent
                n.parent = null
            }
        } else if (left == null && right != null) {

            if (parent == null) {
                n.parent = null
                n.right?.parent = null
                root = n.right
            } else {
                if (parent.left == n) {
                    //是父亲的左节点
                    parent.left = n.right
                } else {
                    //是父亲的右节点
                    parent.right = n.right
                }
                n.right?.parent = parent
                n.parent = null
            }
        } else {
            //左右 都有节点
            if (n.right?.left == null) {
                //当删除节点的右元素的左元素为空 就直接补上
                n.right?.left = n.left
                if (parent == null) {
                    root = n.right
                } else {
                    if (parent.left == n) {
                        parent.left = n.right
                    } else {
                        parent.right = n.right
                    }

                }
                n.parent = null
            } else {
                //删除根节点
                //补上右子树的左子树上最小的一个
                val leftNode = dd(n.right)
                //1
                leftNode?.left = n.left
                //2
                val leftNodeP = leftNode?.parent
                leftNodeP?.left = leftNode?.right
                //3
                leftNode?.right = n.right
                //4
                if (parent == null) {
                    root = leftNode
                } else {
                    if (parent.left == n) {
                        parent.left = leftNode
                    } else {
                        parent.right = leftNode
                    }
                }
            }
        }

    }

    fun dd(n: Node<Int>?): Node<Int>? {

        var a = n
        if (a == null) {
            return null
        }

        while (a != null) {
            a = a.left
        }
        return a
    }


    //中序遍历
    fun mid(n: Node<Int>?) {
        if (n == null) {
            return
        }
        mid(n.left)
        Log.e("mll 打印", n.item.toString())
        mid(n.right)
    }


    class Node<E>(it: E) {
        var item: E = it
        var left: Node<E>? = null
        var right: Node<E>? = null
        var parent: Node<E>? = null //当前的父节点
    }

}
