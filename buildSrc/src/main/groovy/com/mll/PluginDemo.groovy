package com.mll

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginDemo implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println("mll-> ${project.name}  hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh")

        project.extensions.create("releaseInfo", ReleaseInfoExtension.class)
        project.tasks.create("releaseInfoTask", ReleaseInfoTask.class)

        def versionNameMsg = project.extensions.releaseInfo.versionName

        println("mll-> ${versionNameMsg}  hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh")




    }
}

class ReleaseInfoExtension {
    String versionName
    String versionCode
    String versionInfo
    String fileName
}