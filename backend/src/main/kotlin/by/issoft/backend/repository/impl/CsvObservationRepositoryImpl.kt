package by.issoft.backend.repository.impl

import by.issoft.backend.dao.CsvObservationDataDAO
import by.issoft.backend.repository.CsvObservationRepository
import com.opencsv.bean.CsvToBeanBuilder
import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Repository
import java.io.BufferedReader
import java.io.FileReader

@Repository
class CsvObservationRepositoryImpl : CsvObservationRepository {
    companion object {
        const val CSV_FILE_SEPARATOR = ' '
    }

    override fun findAll(fileName: String): List<CsvObservationDataDAO> {
        return BufferedReader(FileReader(ClassPathResource(fileName).file)).use {
            CsvToBeanBuilder<CsvObservationDataDAO>(it)
                .withType(CsvObservationDataDAO::class.java)
                .withSeparator(CSV_FILE_SEPARATOR)
                .build()
                .parse()
        }
    }
}
