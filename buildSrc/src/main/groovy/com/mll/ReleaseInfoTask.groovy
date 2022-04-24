package com.mll

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ReleaseInfoTask extends DefaultTask {

    ReleaseInfoTask() {
        group = "ggg"
        description = "ddd"
    }

    @TaskAction
    void doAction() {

        up()
    }

    private void up() {

        println("mll->    zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz")
    }

}