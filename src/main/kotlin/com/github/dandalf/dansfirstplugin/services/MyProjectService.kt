package com.github.dandalf.dansfirstplugin.services

import com.github.dandalf.dansfirstplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
