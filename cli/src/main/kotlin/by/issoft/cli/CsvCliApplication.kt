package by.issoft.cli

import by.issoft.command.CLICommand
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import picocli.CommandLine
import kotlin.system.exitProcess

@SpringBootApplication(scanBasePackages = ["by.issoft"])
class CsvCliApplication(
    private val argumentToCommand: Map<String, CLICommand>
) : CommandLineRunner {

    override fun run(vararg args: String?) {
        val argument = if (args.isNotEmpty()) args[0] else "default";

        val command = argumentToCommand.getOrDefault(argument, argumentToCommand["default"])

        command?.call()
//        exitProcess(CommandLine(command).execute(*args))
    }
}

fun main(args: Array<String>) {
    runApplication<CsvCliApplication>(*args)
}
