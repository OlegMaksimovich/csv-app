package by.issoft.backend.repository

import by.issoft.backend.dao.CsvObservationDataDAO

interface CsvObservationRepository {
    fun findAll(fileName: String): List<CsvObservationDataDAO>
}
