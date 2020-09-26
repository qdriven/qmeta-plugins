package com.github.qdriven.qmetaplugins.services

import com.intellij.openapi.project.Project
import com.github.qdriven.qmetaplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
