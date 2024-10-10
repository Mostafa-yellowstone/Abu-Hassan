package myst.mostafayellowstone.abuhassan.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import myst.mostafayellowstone.abuhassan.R
import myst.mostafayellowstone.abuhassan.screens.dashboardscreen.DashboardScreen
import myst.mostafayellowstone.abuhassan.ui.theme.AppTheme
import myst.mostafayellowstone.abuhassan.ui.theme.surfaceVariantLight

@Composable
fun CategoryCard(
    text: String,
    painter: Painter,
    onClick: @Composable (String) -> Unit
){
    Card(modifier = Modifier.size(height = 100.dp , width = 65.dp),
        shape = RoundedCornerShape(10.dp),
        onClick = {onClick},
        colors = CardDefaults.cardColors(surfaceVariantLight)
    ){
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment =Alignment.CenterHorizontally){
            Image(painter = painter, contentDescription ="food", modifier= Modifier
                .size(60.dp)
                .padding(top = 8.dp)
                .weight(2f))
            Text(
                text = text,

                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.weight(1f).align(alignment = Alignment.CenterHorizontally)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun THirdGreetingPreview() {
    AppTheme {
        CategoryCard(text = "Burger" , painter = painterResource(id = R.drawable.hamburger), onClick = {})
    }
}