package com.teamanotador.gamesbreak

import com.teamanotador.gamesbreak.data.User
import com.teamanotador.gamesbreak.repositories.UserRepository
import java.text.SimpleDateFormat
import java.util.Date

object Utils {
    fun formatMonto(monto: Double?): String = String.format("%.2f", monto)

    fun mostrarDateComoCadena(fecha: Date): String {
        val formatoFecha = SimpleDateFormat("yyyy-MM-dd")
        return formatoFecha.format(fecha)
    }

    fun getById(userId: Long): User? {
        return UserRepository.getUsers().firstOrNull { it.id == userId }
    }

}