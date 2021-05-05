package by.issoft.configuration

import org.flywaydb.core.Flyway
import org.flywaydb.core.api.configuration.FluentConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FlywayConfiguration {

    @Bean
    fun flyWay() : Flyway {
        return FluentConfiguration().load()
    }
}