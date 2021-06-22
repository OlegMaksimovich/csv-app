package by.issoft.backend.repository

import by.issoft.backend.dao.ObservationDataDAO
import org.springframework.data.jpa.repository.JpaRepository

interface ObservationRepository: JpaRepository<ObservationDataDAO, Long> {
}