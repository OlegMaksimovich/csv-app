package by.issoft.backend.service

import by.issoft.common.model.ObservationData

interface ObservationService {
    fun getObservations(): List<ObservationData>
}
