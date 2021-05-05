plugins {
    kotlin("jvm")
}

val opencsvVersion: String by project
val springVersion: String by project

dependencies {
    implementation(project(":common"))
    implementation("com.opencsv:opencsv:${opencsvVersion}")
    implementation("org.springframework:spring-context:${springVersion}")

    implementation(kotlin("stdlib-jdk8"))
}
