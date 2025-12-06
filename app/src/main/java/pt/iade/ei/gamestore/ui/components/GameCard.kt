package pt.iade.ei.gamestore.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import pt.iade.ei.gamestore.GameData
import pt.iade.ei.gamestore.model.Game
import pt.iade.ei.gamestore.ui.theme.GameStoreTheme

@Composable
fun GameCard(
    game: Game,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp)
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .border(2.dp, Color.White, RoundedCornerShape(16.dp))
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = game.imageRes),
                contentDescription = game.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color.Black.copy(alpha = 0.25f)
            ) {}

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = game.logoRes),
                    contentDescription = game.title,
                    modifier = Modifier
                        .height(60.dp)
                        .padding(bottom = 0.dp),
                    contentScale = ContentScale.Fit
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGameCard() {
    val game = GameData.games.first()
    GameStoreTheme {
        GameCard(game = game, onClick = {})
    }
}
