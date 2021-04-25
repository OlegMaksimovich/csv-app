package by.issoft.backend.dao

import by.issoft.backend.converter.FloatConverter
import com.opencsv.bean.CsvBindByPosition
import com.opencsv.bean.CsvCustomBindByPosition

//an observation data
data class CsvObservationDataDAO(
    @CsvBindByPosition(position = 0)
    var obs: Long? = null,//the number of an observation
    @CsvBindByPosition(position = 1)
    var year: Long? = null,
    @CsvBindByPosition(position = 2)
    var month: Long? = null,
    @CsvBindByPosition(position = 3)
    var day: Long? = null,
    @CsvBindByPosition(position = 4)
    var date: String? = null, // concatenated year+month+day
    @CsvCustomBindByPosition(position = 5, converter = FloatConverter::class)
    var latitude: Float? = null,
    @CsvCustomBindByPosition(position = 6, converter = FloatConverter::class)
    var longitude: Float? = null,
    @CsvCustomBindByPosition(position = 7, converter = FloatConverter::class)
    var zonWinds: Float? = null,
    @CsvCustomBindByPosition(position = 8, converter = FloatConverter::class)
    var merWinds: Float? = null,
    @CsvCustomBindByPosition(position = 9, converter = FloatConverter::class)
    var humidity: Float? = null,
    @CsvCustomBindByPosition(position = 10, converter = FloatConverter::class)
    var airTemp: Float? = null,
    @CsvCustomBindByPosition(position = 11, converter = FloatConverter::class)
    var sSTemp: Float? = null
)
