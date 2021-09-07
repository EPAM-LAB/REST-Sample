pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        id("com.bmuschko.tomcat") version "2.7.0"
    }
}

rootProject.name = "rest-sample"
