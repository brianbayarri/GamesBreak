package com.teamanotador.gamesbreak

import com.teamanotador.gamesbreak.data.Game
import com.teamanotador.gamesbreak.data.Purchase
import com.teamanotador.gamesbreak.data.User
import com.teamanotador.gamesbreak.exceptions.SaldoInsuficienteException
import com.teamanotador.gamesbreak.repositories.PurchaseRepository
import java.util.Date

const val COMISION = 1.02

class Steam : Intermediario {
    override fun comprar(game: Game, user: User): Purchase {
        val totalAPagar: Double = game.price.times(COMISION)

        if (user.money < totalAPagar) {
            throw SaldoInsuficienteException("Saldo de ${user.money} insuficiente para pagar $totalAPagar")
        }
        val idCompra = PurchaseRepository.obtenerUltimoId().plus(1)
        user.efectuarTransaccion(totalAPagar)
        return Purchase(
            idCompra, user.id, game.id, totalAPagar,
            Utils.mostrarDateComoCadena(Date())
        )
    }

}