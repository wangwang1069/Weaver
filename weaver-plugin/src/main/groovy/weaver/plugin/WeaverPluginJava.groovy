package weaver.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.SourceSet
import weaver.plugin.task.TaskManager

import static weaver.plugin.task.TaskManager.createJavaTransformerTask

/**
 * @author Saeed Masoumi (saeed@6thsolution.com)
 */
class WeaverPluginJava implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.afterEvaluate {
            project.sourceSets.all { SourceSet set ->
                createJavaTransformerTask(project, set)
            }
        }
    }
}
