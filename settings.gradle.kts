rootProject.name = "csv-app"
include("cli", "common", "api", "backend")

pluginManagement {
    val kotlinJvmPluginVersion: String by settings
    val kotlinPluginSpringVersion: String by settings
    val springDependencyManagementPluginVersion: String by settings
    val springBootPluginVersion: String by settings
    val flywaydbPluginVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinJvmPluginVersion
        kotlin("plugin.spring") version kotlinPluginSpringVersion

        id("io.spring.dependency-management") version springDependencyManagementPluginVersion
        id("org.springframework.boot") version springBootPluginVersion
        id("org.flywaydb.flyway") version flywaydbPluginVersion
    }
}
