package by.issoft.api

data class ObservationDataDto(
    val number: Long,
    val date: String,
    val latitude: Float,
    val longitude: Float,
    val zonWinds: Float?,
    val merWinds: Float?,
    val humidity: Float?,
    val airTemp: Float?,
    val sSTemp: Float?
)
