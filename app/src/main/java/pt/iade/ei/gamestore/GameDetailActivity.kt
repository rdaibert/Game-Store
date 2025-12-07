package pt.iade.ei.gamestore

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.model.Item
import pt.iade.ei.gamestore.ui.screens.GameDetailScreen
import pt.iade.ei.gamestore.ui.theme.GameStoreTheme

class GameDetailActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val game = intent.getSerializableExtra(MainActivity.EXTRA_GAME) as? Game

        setContent {
            GameStoreTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    if (game != null) {
                        GameDetailScreen(
                            game = game,
                            onBack = { finish() },
                            onHomeClick = { finish() },
                            onBuyItem = { item: Item ->
                                Toast.makeText(
                                    this,
                                    "Comprou: \"${item.name}\" Valor: ${"%.2f".format(item.price)}€",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        )
                    } else {
                        Toast.makeText(this, "Erro a gerar jogo", Toast.LENGTH_SHORT).show()
                        finish()
                    }
                }
            }
        }
    }
}
