package data

import java.text.NumberFormat
import java.util.*

data class Game(
    val id: Long,
    val name: String,
    val releaseDate: String,
    val genre: String,
    val price: Double,
    val permalink: String
) {
    override fun toString(): String {
        return "$id - $name - $${String.format("%.2f", price)} - $genre - $releaseDate"
    }

     fun getPriceFormateado(): String {
        val numberFormat = NumberFormat.getCurrencyInstance(Locale("es", "AR"))
        numberFormat.minimumFractionDigits = 2
        numberFormat.maximumFractionDigits = 2

        return numberFormat.format(this.price)
    }
}