package by.issoft.command

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import picocli.CommandLine

//TODO: need to think about the purpose of this command
@CommandLine.Command(
    name = "default", mixinStandardHelpOptions = true, version = ["default 0.1"],
    description = ["Default command."]
)
@Service("default")
class DefaultCommand : CLICommand {

    private val log = LoggerFactory.getLogger(DefaultCommand::class.java)

    override fun call(): Int {
        log.warn("DefaultCommand was executed")
        return 1
    }
}