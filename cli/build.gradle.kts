plugins {
    id("org.springframework.boot")
    id("org.flywaydb.flyway")

    kotlin("jvm")
    kotlin("plugin.spring")
}

val picocliVersion: String by project
val flywaydbVersion: String by project
val h2DBVersion: String by project
val mysqlVersion: String by project

dependencies {
    implementation(project(":backend"))

    implementation(kotlin("stdlib-jdk8"))

//    cli interface
    implementation("info.picocli:picocli:${picocliVersion}")

    implementation("org.springframework.boot:spring-boot-starter")
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

//    database dependencies
    implementation("org.flywaydb:flyway-core:${flywaydbVersion}")
    implementation("com.h2database:h2:${h2DBVersion}")
//    implementation("mysql:mysql-connector-java:${mysqlVersion}")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
