package com.muliulan.mll.aop

import android.util.Log
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.commons.AdviceAdapter
import java.io.FileInputStream

/**
 *    @author : zhaoCS
 *    date    : 2022/4/19 4:13 下午
 *    desc    :
 */
class MyAsm(
    api: Int,
    methodVisitor: MethodVisitor,
    access: Int,
    name: String,
    descriptor: String
) : AdviceAdapter(
    api,
    methodVisitor,
    access,
    name,
    descriptor
), Opcodes {

    override fun visitCode() {
        super.visitCode()
        //asm开始扫码这个方法
    }

    override fun visitEnd() {
        super.visitEnd()
        //方法扫码完毕

    }

    override fun visitInsn(opcode: Int) {
        super.visitInsn(opcode)
        //扫描 opcodes操作符
    }

    override fun onMethodEnter() {
        super.onMethodEnter()
        //进入这个方法
    }

    override fun onMethodExit(opcode: Int) {
        super.onMethodExit(opcode)
        //即将从这个方法出去
        mv
    }



    fun aa(){
        val fileInputStream = FileInputStream("")

        val classReader = ClassReader(fileInputStream)
        val classWriter = ClassWriter(ClassWriter.COMPUTE_MAXS)



    }


}
