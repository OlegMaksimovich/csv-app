# csv-app

Kotlin multi-module app with Gradle's Kotlin DSL and Spring Boot

1. [api](./api) app interfaces
2. [backend](./backend) service layer implementation
3. [cli](./cli) user's command line interface
4. [common](./common) contains models, mappers and utility classes

* [db/observation.mwb](./backend/src/main/resources/db/observation.mwb) - database schema design to store data from CSV
* [db/migration](./backend/src/main/resources/db/migration) - stores migration `.sql` files with the next pattern:

```
<Prefix><Version>__<Description>.sql
```

Example: `V1_0__create_observation_table.sql`

# Build

Run a clean build of the project with the following

```
./gradlew clean build
```

# Run migration options:

*Run from parent project folder*

## using default params (using h2DB)
```
./gradlew flywayMigrate
```

## using system variables to specify db connection params
 1. specify the next system variables
```
CSV_APP_DB_URL={your_db_connection_url} # ex. jdbc:mysql://localhost:3306
CSV_APP_DB_USER={your_db_user_name} # ex. user
CSV_APP_DB_PASSWORD={your_db_user_password} # ex. password
```
 2. then, execute
```
./gradlew flywayMigrate
```

## using cli args to specify db connection params

```
./gradlew -DCSV_APP_DB_URL={your_db_connection_url} -DCSV_APP_DB_USER={your_db_user_name} -DCSV_APP_DB_PASSWORD={your_db_user_password} flywayMigrate
```

## using flyway.conf file to specify db connection params (isn't tracked by git)

```
./gradlew -Dflyway.configFiles=../db/flyway.conf flywayMigrate
```

# Run csv-app

 1. Specify environment variables to connect to DB (you can skip and use h2DB by default)

```
CSV_APP_DB_URL={your_db_connection_url} # ex. jdbc:mysql://localhost:3306
CSV_APP_DB_USER={your_db_user_name} # ex. user
CSV_APP_DB_PASSWORD={your_db_user_password} # ex. password
```
 2. Create run configuration using by.issoft.cli.CsvCliApplication
