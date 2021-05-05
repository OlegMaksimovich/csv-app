package by.issoft.command

import org.flywaydb.core.Flyway
import org.flywaydb.core.api.FlywayException
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import picocli.CommandLine

@CommandLine.Command(
    name = "migration", mixinStandardHelpOptions = true, version = ["migration 0.1"],
    description = ["Run db migration."]
)
@Service(value = "migration")
class MigrationCLICommand(
    private val flyway: Flyway
) : CLICommand {

    private val log = LoggerFactory.getLogger(MigrationCLICommand::class.java)

    override fun call(): Int {
//TODO: probably, need to add logging
        return try {
            flyway.migrate()
            0
        } catch (exception: FlywayException) {
            log.error(exception.message, exception)
            1
        }
    }
}