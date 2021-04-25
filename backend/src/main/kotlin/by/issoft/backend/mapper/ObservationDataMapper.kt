package by.issoft.backend.mapper

import by.issoft.backend.dao.CsvObservationDataDAO
import by.issoft.common.model.ObservationData

object ObservationDataMapper {

    fun mapDaoToDomain(dao: CsvObservationDataDAO): ObservationData =
        ObservationData(
            number = dao.obs!!,
            date = dao.date!!,
            latitude = dao.latitude!!,
            longitude = dao.longitude!!,
            zonWinds = dao.zonWinds,
            merWinds = dao.merWinds,
            humidity = dao.humidity,
            airTemp = dao.airTemp,
            sSTemp = dao.sSTemp
        )
}
