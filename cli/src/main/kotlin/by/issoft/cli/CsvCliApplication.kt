package by.issoft.cli

import by.issoft.backend.service.ObservationService
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["by.issoft"])
class CsvCliApplication(val observationService: ObservationService) : CommandLineRunner {

    private val log = LoggerFactory.getLogger(CsvCliApplication::class.java)

    override fun run(vararg args: String?) {
        val load = observationService.getObservations()
        log.info(load.take(1).toString())
    }
}

fun main(args: Array<String>) {
    runApplication<CsvCliApplication>(*args)
}
