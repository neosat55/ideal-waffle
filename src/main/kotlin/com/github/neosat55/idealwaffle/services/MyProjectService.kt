package com.github.neosat55.idealwaffle.services

import com.intellij.openapi.project.Project
import com.github.neosat55.idealwaffle.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
