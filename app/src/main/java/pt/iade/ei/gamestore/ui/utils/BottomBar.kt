package pt.iade.ei.gamestore.ui.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pt.iade.ei.gamestore.R

@Composable
fun BottomBar(
    onHomeClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .size(56.dp)
                .clip(CircleShape)
                .border(3.dp, Color.White, CircleShape)
        )

        Surface(
            onClick = onHomeClick,
            shape = CircleShape,
            color = Color.Transparent,
            modifier = Modifier
                .size(56.dp)
                .clip(CircleShape)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.home_icon),
                    contentDescription = "Home",
                    modifier = Modifier.size(100.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun PreviewBottomBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)
            .background(Color.Black),
        contentAlignment = Alignment.BottomCenter
    ) {
        BottomBar(onHomeClick = {})
    }
}
