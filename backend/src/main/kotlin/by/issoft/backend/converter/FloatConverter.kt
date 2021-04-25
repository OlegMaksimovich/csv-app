package by.issoft.backend.converter

import com.opencsv.bean.AbstractBeanField

class FloatConverter<Float, I> : AbstractBeanField<Float, I>() {

    companion object {
        const val MALFORMED_VALUE = "."
    }

    override fun convert(value: String?): kotlin.Float? =
        when (value) {
            MALFORMED_VALUE -> null
            else -> value?.toFloat()
        }
}
