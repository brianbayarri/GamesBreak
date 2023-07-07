package com.teamanotador.gamesbreak.repositories

import com.teamanotador.gamesbreak.enumerador.Genero
import data.Game
import exceptions.JuegoInexistenteException

object GameRepository {

    private val games = mutableListOf<Game>()

    init {
        games.add(
            Game(
                1L,
                "Resident Evil 4",
                "2005",
                Genero.SURVIVAL_HORROR,
                350.50,
                "https://media.vandal.net/m/67022/resident-evil-4-20193420315720_1.jpg"
            )
        )
        games.add(
            Game(
                2L,
                "Minecraft",
                "2011",
                Genero.SANDBOX,
                150.75,
                "https://www.proandroid.com/wp-content/uploads/2016/12/minecraft.jpg"
            )
        )
        games.add(
            Game(
                3L,
                "FIFA 23",
                "2022",
                Genero.DEPORTE,
                1800.00,
                "https://sm.ign.com/ign_es/screenshot/default/image002-1_3te9.jpg"
            )
        )
        games.add(
            Game(
                4L,
                "Silent Hill 3",
                "2003",
                Genero.SURVIVAL_HORROR,
                70.00,
                "https://m.media-amazon.com/images/I/91AQS6et4QL._AC_UF894,1000_QL80_.jpg"
            )
        )
        games.add(
            Game(
                5L,
                "Call of Duty: Black Ops 2",
                "2012",
                Genero.SHOOTER,
                600.00,
                "https://cdn.game.tv/game-tv-content/images_3/41666c262d8f858a9ebe021ac4dbadb5/41666c262d8f858a9ebe021ac4dbadb5/GameTile.jpg"
            )
        )
        games.add(
            Game(
                6L,
                "Mortal Kombat 11",
                "2019",
                Genero.PELEA,
                315.50,
                "https://as01.epimg.net/meristation/imagenes/2019/01/10/noticias/1547149102_234157_1547149165_noticia_normal.jpg"
            )
        )
        games.add(
            Game(
                7L,
                "The Last of Us 2",
                "2020",
                Genero.SURVIVAL_HORROR,
                8500.00,
                "https://image.api.playstation.com/vulcan/img/rnd/202010/2618/w48z6bzefZPrRcJHc7L8SO66.png"
            )
        )
        games.add(
            Game(
                8L,
                "Gran Turismo 7",
                "2022",
                Genero.CARRERAS,
                800.00,
                "https://edicion.parentesis.com:8082/imagesPosts/gt00.jpg"
            )
        )
        games.add(
            Game(
                9L,
                "Pokemon: Let's Go Pikachu!",
                "2018",
                Genero.AVENTURA,
                210.20,
                "https://juegosdigitalesargentina.com/files/images/productos/1639183282-pokemon-lets-go-pikachu-nintendo-switch.jpg"
            )
        )
        games.add(
            Game(
                10L,
                "GTA San Andreas",
                "2004",
                Genero.ACCION,
                1800.00,
                "https://media.vandal.net/m/3903/2005610224436_1.jpg"
            )
        )
        games.add(
            Game(
                11L,
                "Mario Kart 8",
                "2014",
                Genero.CARRERAS,
                6500.00,
                "https://media.vandal.net/m/45256/mario-kart-8-deluxe-201742811181_45.jpg"
            )
        )
        games.add(
            Game(
                12L,
                "Dark Souls 3",
                "2016",
                Genero.ACCION,
                50.75,
                "https://as.com/meristation/imagenes/2020/04/07/game_cover/136602131586253551.jpg"
            )
        )
        games.add(
            Game(
                13L,
                "God of War: Ragnarok",
                "2022",
                Genero.AVENTURA,
                5350.00,
                "https://assets-prd.ignimgs.com/2022/07/25/9781506733494-1658716557072.jpg"
            )
        )
        games.add(
            Game(
                14L,
                "Kingdom Hearts 2",
                "2005",
                Genero.RPG,
                150.00,
                "https://cdn.mobygames.com/covers/6198391-kingdom-hearts-ii-playstation-2-front-cover.jpg"
            )
        )
        games.add(
            Game(
                15L,
                "Bloodborne",
                "2015",
                Genero.ACCION,
                10.00,
                "https://cdn.mobygames.com/covers/3620172-bloodborne-playstation-4-other.jpg"
            )
        )
        games.add(
            Game(
                16L,
                "Sekiro: Shadows Die Twice",
                "2019",
                Genero.ACCION,
                20.00,
                "https://cdn.mobygames.com/covers/8507229-sekiro-shadows-die-twice-xbox-one-front-cover.jpg"
            )
        )
        games.add(
            Game(
                17L,
                "Elden Ring",
                "2022",
                Genero.ACCION,
                30.00,
                "https://cdn.mobygames.com/covers/10371758-elden-ring-xbox-one-front-cover.jpg"
            )
        )
        games.add(
            Game(
                18L,
                "Shadow of the Colossus",
                "2005",
                Genero.AVENTURA,
                40.00,
                "https://cdn.mobygames.com/covers/4317156-shadow-of-the-colossus-playstation-2-front-cover.jpg"
            )
        )
        games.add(
            Game(
                19L,
                "Persona 5 Royal",
                "2020",
                Genero.JRPG,
                50.00,
                "https://cdn.mobygames.com/covers/8842019-persona-5-royal-playstation-4-front-cover.jpg"
            )
        )
        games.add(
            Game(
                20L,
                "Portal 2",
                "2011",
                Genero.PUZZLE,
                60.00,
                "https://cdn.mobygames.com/covers/6296552-portal-2-windows-front-cover.jpg"
            )
        )
    }

    fun get(): List<Game> {
        return games
    }

    fun getById(id: Long): Game {
        try {
            return games.first { it.id == id }
        } catch (e: NoSuchElementException) {
            throw JuegoInexistenteException("El juego con id $id no existe")
        }
    }
}