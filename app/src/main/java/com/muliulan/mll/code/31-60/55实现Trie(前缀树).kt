package com.muliulan.mll.code.`31-60`

import java.util.ArrayList

/**
描述:
zhaochenshuo
2021/4/14
 */

class Main55() {

    /**
     * （发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补完和拼写检查。
    请你实现 Trie 类：
    Trie() 初始化前缀树对象。
    void insert(String word) 向前缀树中插入字符串 word 。
    boolean search(String word) 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false 。
    boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否则，返回 false 。
     

    示例：
    输入
    ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
    [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
    输出
    [null, null, true, false, true, null, true]

    解释
    Trie trie = new Trie();
    trie.insert("apple");
    trie.search("apple");   // 返回 True
    trie.search("app");     // 返回 False
    trie.startsWith("app"); // 返回 True
    trie.insert("app");
    trie.search("app");     // 返回 True

     * */
    /** Initialize your data structure here. */


    /** 插入 */
    var mTree: Tree? = null
    fun insert(word: String) {
        val tree = Tree(word)
        if (mTree == null) {
            mTree = tree
        } else {
            var a = mTree
            var b = a
            while (a != null) {
                b = a
                if (a.left != null) {
                    a = a.left
                } else if (a.right != null) {
                    a = a.right
                } else {
                    a = null
                }
            }
            if (b?.left == null) {
                b?.left = tree
            } else {
                b.right = tree
            }
        }
    }

    var mWord: String = ""

    /** 查询 */
    fun search(word: String): Boolean {
        this.mWord = word
        return see(mTree, 0)
    }

    var ro: Tree? = null
    private fun see(mTree: Tree?, int: Int): Boolean {

        mTree?.run {
            see(mTree?.left, int)

            val v = mTree?.v
            if (int == 0) {
                if (v == mWord) {
                    return true
                }
            } else {
                if (mPrefix.length <= v!!.length && mPrefix == v?.substring(0, mPrefix.length)) {
                    return true
                }
            }

            ro = mTree
            see(mTree?.right, int)
        }

        return false
    }

    var mPrefix: String = ""

    /** 前缀相同 */
    fun startsWith(prefix: String): Boolean {
        this.mPrefix = prefix
        return see(mTree, 1)
    }

    class Tree(mv: String) {
        var left: Tree? = null
        var right: Tree? = null
        val v = mv
    }

    /**   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   ***   */
    // 用  ArrayList存 简单
    val arrayList = ArrayList<String>()
    fun insert1(word: String) {
        arrayList.add(word)
    }

    fun search1(word: String): Boolean {
        arrayList.forEach {
            if (word == it) {
                return true
            }
        }
        return false
    }

    fun startsWith1(prefix: String): Boolean {
        arrayList.forEach {
            if (it.length >= prefix.length && prefix == it.substring(0, prefix.length)) {
                return true
            }
        }
        return false
    }


}