package com.github.qdriven.qmetaplugins.listeners

import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener
import com.github.qdriven.qmetaplugins.services.MyProjectService

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.getService(MyProjectService::class.java)
    }
}
