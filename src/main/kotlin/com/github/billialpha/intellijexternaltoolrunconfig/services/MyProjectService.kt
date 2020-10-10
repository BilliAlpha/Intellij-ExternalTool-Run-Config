package com.github.billialpha.intellijexternaltoolrunconfig.services

import com.intellij.openapi.project.Project
import com.github.billialpha.intellijexternaltoolrunconfig.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
