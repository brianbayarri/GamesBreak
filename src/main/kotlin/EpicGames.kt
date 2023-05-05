import data.Game
import data.Purchase
import data.User
import java.time.LocalTime
import java.util.Date
import java.util.Random

class EpicGames : Intermediario() {
    override fun comprar(game: Game, user: User): Purchase? {
        val hora1 = LocalTime.of(20, 0)
        val hora2 = LocalTime.of(23, 59)
        val ahora = LocalTime.now()
        var comision = 1.03
        if (ahora.isAfter(hora1) && ahora.isBefore(hora2)) {
            comision = 1.01
        }
        val random = Random()
        val idRandom = random.nextLong()
        val importe: Double = game.price * comision

        if (user.money < importe) {
            println("No tenés dinero suficiente para comprar el juego")
            return null
        }
        user.efectuarTransaccion(importe)
        return Purchase(idRandom, user.id, game.id, importe, mostrarDateComoCadena(Date()))
    }

}