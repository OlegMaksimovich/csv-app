package by.issoft.command

import by.issoft.backend.service.ObservationService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import picocli.CommandLine

@CommandLine.Command(
    name = "upload", mixinStandardHelpOptions = true, version = ["upload 0.1"],
    description = ["Upload data from csv file into database."]
)
@Service(value = "upload")
class UploadCsvCLICommand(
    private var observationService: ObservationService
) : CLICommand {

    private val log = LoggerFactory.getLogger(UploadCsvCLICommand::class.java)

    override fun call(): Int {
        val load = observationService.getObservations()
        log.info(load.take(1).toString())
        return 0
    }
}