package by.issoft.backend.service.impl

import by.issoft.backend.mapper.ObservationDataMapper
import by.issoft.backend.repository.CsvObservationRepository
import by.issoft.backend.service.ObservationService
import by.issoft.common.model.ObservationData
import org.springframework.stereotype.Service

@Service
class CsvObservationService(private val csvObservationRepository: CsvObservationRepository) : ObservationService {
    companion object {
        const val CSV_FILE_SEPARATOR = "tao-all2.dat"
    }

    override fun getObservations(): List<ObservationData> =
        csvObservationRepository.findAll(CSV_FILE_SEPARATOR)
            .map { ObservationDataMapper.mapDaoToDomain(it) }

}
