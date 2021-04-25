package by.issoft.common.model

data class ObservationData(
    val number: Long,//the number of an observation
    val date: String, // concatenated year+month+day
    val latitude: Float,
    val longitude: Float,
    val zonWinds: Float?,
    val merWinds: Float?,
    val humidity: Float?,
    val airTemp: Float?,
    val sSTemp: Float?
)
