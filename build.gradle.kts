// Top-level build file where you can add configuration options common to all sub-projects/modules.
import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.setValue
import org.gradle.kotlin.dsl.repositories

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Config.BuildPlugins.android_plugin)
        classpath(Config.BuildPlugins.kotlin_plugin)

    }
}

allprojects {
    repositories {
        jcenter()
        google()
    }
}


task("clean") {
    delete(rootProject.buildDir)
}


