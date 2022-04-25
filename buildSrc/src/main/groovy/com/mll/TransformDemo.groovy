package com.mll

import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform
import com.android.build.api.transform.TransformException
import com.android.build.api.transform.TransformInvocation
import com.android.build.gradle.internal.pipeline.TransformManager
import org.gradle.internal.impldep.com.amazonaws.services.s3.transfer.TransferManager


//允许第三方 Plugin 在打包成 .dex 文件之前的编译过程中操作 .class 文件，我们需要做的就是实现 Transform 来对 .class 文件遍历以拿到所有方法，修改完成后再对原文件进行替换
class  TransformDemo extends  Transform{

    @Override
    String getName() {
        //返回对应的 Task 名称。
        return "tName"
    }

    @Override
    Set<QualifiedContent.ContentType> getInputTypes() {
        /**
         *  确定对那些类型的结果进行转换。
         *
         * 1、CONTENT_CLASS：表示需要处理 java 的 class 文件。
         2、CONTENT_JARS：表示需要处理 java 的 class 与 资源文件。
         3、CONTENT_RESOURCES：表示需要处理 java 的资源文件。
         4、CONTENT_NATIVE_LIBS：表示需要处理 native 库的代码。
         5、CONTENT_DEX：表示需要处理 DEX 文件。
         6、CONTENT_DEX_WITH_RESOURCES：表示需要处理 DEX 与 java 的资源文件。
         * */
        return TransformManager.CONTENT_CLASS
    }

    @Override
    Set<? super QualifiedContent.Scope> getScopes() {
        //指定插件的适用范围。
        /**
         * 1、PROJECT：只有项目内容。
         2、SUB_PROJECTS：只有子项目。
         3、EXTERNAL_LIBRARIES：只有外部库，
         4、TESTED_CODE：由当前变体（包括依赖项）所测试的代码。
         5、PROVIDED_ONLY：只提供本地或远程依赖项。
         * */
        return TransformManager.SCOPE_FULL_PROJECT
    }

    @Override
    boolean isIncremental() {
        //表示是否支持增量更新。
        return false
    }

    @Override
    void transform(TransformInvocation transformInvocation) throws TransformException, InterruptedException, IOException {
        super.transform(transformInvocation)
        //进行具体的转换过程。


    }
}