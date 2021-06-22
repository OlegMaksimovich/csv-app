plugins {
    kotlin("jvm")

    id("org.flywaydb.flyway")

    kotlin("plugin.spring")
    id("org.springframework.boot")
}

val opencsvVersion: String by project
val flywaydbVersion: String by project
val h2DBVersion: String by project
val mysqlVersion: String by project

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation(project(":common"))

    implementation("com.opencsv:opencsv:${opencsvVersion}")

    //    database dependencies
    implementation("org.flywaydb:flyway-core:${flywaydbVersion}")
    implementation("com.h2database:h2:${h2DBVersion}")
    implementation("mysql:mysql-connector-java:${mysqlVersion}")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}

flyway {
    url = System.getProperty("CSV_APP_DB_URL", "jdbc:h2:mem:DATABASE")
    user = System.getProperty("CSV_APP_DB_USER", "sa")
    password = System.getProperty("CSV_APP_DB_PASSWORD", "")

    baselineOnMigrate = true
    locations = arrayOf("classpath:db/migration")
    schemas = arrayOf("observation")
    encoding = "UTF-8"
}

// disable bootJar for spring-boot plugin
val jar: Jar by tasks
val bootJar: org.springframework.boot.gradle.tasks.bundling.BootJar by tasks

bootJar.enabled = false
jar.enabled = true