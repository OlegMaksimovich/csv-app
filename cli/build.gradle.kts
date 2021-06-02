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

    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")

//    database dependencies
    implementation("org.flywaydb:flyway-core:${flywaydbVersion}")
    implementation("com.h2database:h2:${h2DBVersion}")
    implementation("mysql:mysql-connector-java:${mysqlVersion}")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

//FIXME: export system variables not working, need to fix
flyway {
    url = System.getProperty("CSV_APP_DB_URL", "jdbc:h2:mem:DATABASE")
    user = System.getProperty("CSV_APP_DB_USER", "sa")
    password = System.getProperty("CSV_APP_DB_PASSWORD", "")

    baselineOnMigrate = true
    locations = arrayOf("filesystem:../db/migration")
    schemas = arrayOf("observation")
    encoding = "UTF-8"
}
