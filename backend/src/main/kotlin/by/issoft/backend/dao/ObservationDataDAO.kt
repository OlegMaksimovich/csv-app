package by.issoft.backend.dao

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "observation")
@Entity
data class ObservationDataDAO(
    @Id
    var obs: Long? = null,//the number of an observation
    var year: Long? = null,
    var month: Long? = null,
    var day: Long? = null,
    var date: String? = null, // concatenated year+month+day
    var latitude: Float? = null,
    var longitude: Float? = null,
    var zonWinds: Float? = null,
    var merWinds: Float? = null,
    var humidity: Float? = null,
    var airTemp: Float? = null,
    var sSTemp: Float? = null
)
