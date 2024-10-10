package myst.mostafayellowstone.abuhassan.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import myst.mostafayellowstone.abuhassan.R
import myst.mostafayellowstone.abuhassan.data.local.domain.model.PopularItemsState
import myst.mostafayellowstone.abuhassan.ui.theme.errorContainerDark
import myst.mostafayellowstone.abuhassan.ui.theme.surfaceContainerHighestLight
import myst.mostafayellowstone.abuhassan.ui.theme.surfaceVariantLight
import myst.mostafayellowstone.abuhassan.ui.theme.tertiaryContainerLightMediumContrast
import myst.mostafayellowstone.abuhassan.ui.theme.tertiaryLight

@Composable
fun PopularItemList(popularList: List<PopularItemsState>){
    LazyColumn(modifier = Modifier.fillMaxWidth()){
        items(popularList.size){
            index -> PopularItem(popularItemsState = popularList[index])
        }
    }
}

@Composable
fun PopularItem(popularItemsState: PopularItemsState){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(176.dp)
        .padding(bottom = 3.dp)
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(176.dp)
                .clip(RoundedCornerShape(18.dp))
                .padding(end = 13.dp)
                .background(
                    surfaceVariantLight
                ))
        Column {
            Box(
                modifier = Modifier
                    .height(40.dp)
                    .padding(start = 18.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.crown),
                        contentDescription = "crown",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(11.dp))
                    Text(
                        text = "Best Selling",
                        style = MaterialTheme.typography.bodySmall.copy(fontSize = 14.sp),
                        color = tertiaryContainerLightMediumContrast
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
            }
            Text(
                text = "Salad Pesto Pizza",
                style = MaterialTheme.typography.bodySmall.copy(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ),
                color = Color.Black,
                modifier = Modifier.padding(start = 18.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier.height(40.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {

                    Text(
                        text = "65",
                        style = MaterialTheme.typography.bodySmall.copy(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        color = Color.Black, modifier = Modifier.padding(start = 18.dp)
                    )
                    Spacer(modifier = Modifier.width(3.dp))
                    Text(
                        text = "EGP",
                        style = MaterialTheme.typography.bodySmall.copy(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        color = errorContainerDark
                    )
                }
            }
        }
            Box(
                modifier = Modifier
                    .width(60.dp)
                    .height(40.dp)
                    .clip(RoundedCornerShape(bottomStart = 18.dp, topEnd = 18.dp))
                    .background(tertiaryLight)
                    .align(Alignment.BottomStart),
                contentAlignment = Alignment.Center
            ){
              Icon(painter = painterResource(id = R.drawable.add), contentDescription = "add",
                  modifier = Modifier.size(24.dp), tint = Color.White)
            }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart),
            contentAlignment = Alignment.Center
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .width(30.dp)
                        .height(40.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.star), contentDescription = "star",
                        modifier = Modifier.size(16.dp), tint = Color.Black
                    )
                }




                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "5.0", style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold))
                }
            }
        }




        Image(painter = painterResource(id = R.drawable.salad_pesto_pizza), contentDescription = null,
            modifier = Modifier
                .size(156.dp)
                .align(Alignment.CenterEnd))
    }
}