package myst.mostafayellowstone.abuhassan.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import myst.mostafayellowstone.abuhassan.R
import myst.mostafayellowstone.abuhassan.screens.dashboardscreen.DashboardScreen
import myst.mostafayellowstone.abuhassan.ui.theme.AppTheme
import myst.mostafayellowstone.abuhassan.ui.theme.primaryLight

@Composable
fun IconWithText(
    text: String,
    modifier: Modifier = Modifier
){
    Row(modifier = modifier) {
        Icon(painter = painterResource(id = R.drawable.location), contentDescription = "location-icon" , modifier.size(24.dp) , tint = primaryLight )
        Spacer(modifier = Modifier.width(2.dp))
        Text(text = text , style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold))
        Spacer(modifier = Modifier.width(2.dp))
        Icon(painter = painterResource(id = R.drawable.arrow_down), contentDescription = "arrow-down-icon", modifier.size(24.dp).clickable { } , tint = primaryLight)

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        DashboardScreen()
    }
}