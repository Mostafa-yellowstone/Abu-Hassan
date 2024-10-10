package myst.mostafayellowstone.abuhassan.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import myst.mostafayellowstone.abuhassan.R
import myst.mostafayellowstone.abuhassan.ui.theme.AppTheme
import myst.mostafayellowstone.abuhassan.ui.theme.primaryContainerLight
import myst.mostafayellowstone.abuhassan.ui.theme.secondaryContainerLight
import myst.mostafayellowstone.abuhassan.ui.theme.tertiaryLight

@Composable
fun CardViewBanner(
    text: String,
    subText: String,
    buttonText: String,
    onClick: (String)-> Unit,
    modifier: Modifier = Modifier
){
   Card(modifier = Modifier
       .fillMaxWidth()
       .height(200.dp),
       shape = RoundedCornerShape(16.dp),
       colors = CardDefaults.cardColors(secondaryContainerLight),
       elevation = CardDefaults.cardElevation(8.dp)
   ){
        Box(
            modifier
                .fillMaxSize()
                .padding(16.dp)){
            Row(modifier.fillMaxSize()){
                Column(
                    modifier = modifier
                        .fillMaxSize()
                        .weight(1f),

                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = text, modifier.fillMaxWidth(), style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold) )
                    Text(text = subText , modifier.fillMaxWidth(), color =tertiaryLight )
                    Button(onClick = {}, modifier.fillMaxWidth() , shape = RoundedCornerShape(8.dp) , colors = ButtonDefaults.buttonColors(tertiaryLight)) {
                        Text(text = buttonText, color = Color.White)
                    }
                }
                Column(modifier.weight(1f)){
                    Image(painter = painterResource(id = R.drawable.man), contentDescription = null , modifier.fillMaxSize())
                }

            }
        }
   }
}

@Preview(showBackground = true)
@Composable
private fun SecondPreview() {
    AppTheme {
        CardViewBanner(text = "Taste the Love in Every Bite.", subText = "Fresh, Homemade, Delicious" , onClick = {}, buttonText = "Order Now")
    }
}