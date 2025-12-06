package pt.iade.ei.gamestore

import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.model.GameItem

object GameData {

    val games: List<Game> = listOf(

        //  HAY DAY
        Game(
            id = 1,
            title = "Hay Day",
            description = "Hay Day é um jogo de simulação de quinta onde crias animais, produzes bens e constróis a tua fazenda. Expande a produção, vende produtos e desbloqueia novas áreas enquanto evoluis a quinta.",
            imageRes = R.drawable.hayday,
            iconRes = R.drawable.hayday_ic,
            logoRes = R.drawable.hayday_icon,
            items = listOf(


                GameItem(
                    id = 1,
                    name = "550 Diamantes",
                    price = 11.99,
                    imageRes = R.drawable.hayday_diamonds,
                    description = "Pacote médio de diamantes premium.",
                    longDescription = "Os diamantes são a moeda premium do Hay Day. Permitem acelerar produções, comprar itens raros, adquirir máquinas imediatamente e obter vantagens no Vale. Este pacote contém 550 diamantes, ideal para evoluir a fazenda rapidamente."
                ),


                GameItem(
                    id = 2,
                    name = "Pacote de Vouchers Raros",
                    price = 7.49,
                    imageRes = R.drawable.hayday_vouchers,
                    description = "Inclui vouchers verdes, azuis e roxos.",
                    longDescription = "Os vouchers são usados para desbloquear animais de estimação, decorações exclusivas e personalizações da fazenda. Este pack inclui vouchers verdes, azuis e roxos, essenciais para obter itens premium do Vale."
                ),


                GameItem(
                    id = 3,
                    name = "Farm Pass (Passe da Temporada)",
                    price = 12.99,
                    imageRes = R.drawable.hayday_farm_pass,
                    description = "Passe de temporada com recompensas premium.",
                    longDescription = "O Farm Pass desbloqueia recompensas premium durante toda a temporada, incluindo boosters de produção, decorações exclusivas, atalhos no Vale, diamantes adicionais e itens raros. É a forma mais eficiente de progredir rapidamente na temporada."
                )
            )
        ),

        //  SUBWAY SURFERS
        Game(
            id = 2,
            title = "Subway Surfers",
            description = "Subway Surfers é um endless runner onde escapas ao inspetor, recolhes moedas e desbloqueias pranchas e personagens especiais.",
            imageRes = R.drawable.subwaysurfers,
            iconRes = R.drawable.subwaysurfers_ic,
            logoRes = R.drawable.ss_icon,
            items = listOf(

                GameItem(
                    id = 4,
                    name = "750 000 Moedas",
                    price = 9.99,
                    imageRes = R.drawable.ss_coins,
                    description = "Grande pacote de moedas douradas.",
                    longDescription = "Com 750 000 moedas podes desbloquear personagens, comprar pranchas e evoluir power-ups. É o pacote ideal para acelerar o progresso e melhorar rapidamente o desempenho nas corridas."
                ),

                GameItem(
                    id = 5,
                    name = "150 Chaves",
                    price = 7.49,
                    imageRes = R.drawable.ss_keys,
                    description = "Chaves usadas para continuar corridas.",
                    longDescription = "As chaves são essenciais para continuar a corrida após seres apanhado e são usadas também para desbloquear estilos exclusivos de hoverboards e personagens. Este pack garante muitas chances extras durante as tuas melhores runs."
                ),

                GameItem(
                    id = 6,
                    name = "Season Hunt Pass",
                    price = 13.99,
                    imageRes = R.drawable.ss_season_pass,
                    description = "Passe premium da temporada.",
                    longDescription = "O Season Hunt Pass desbloqueia a trilha premium atual, oferecendo um personagem exclusivo, uma hoverboard temática, grandes quantidades de moedas e chaves, além de recompensas multiplicadas durante toda a temporada."
                )
            )
        )
    )
}
