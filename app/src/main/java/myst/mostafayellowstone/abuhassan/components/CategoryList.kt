package myst.mostafayellowstone.abuhassan.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import myst.mostafayellowstone.abuhassan.data.local.domain.model.CategoryState
import myst.mostafayellowstone.abuhassan.ui.theme.surfaceVariantLight
import myst.mostafayellowstone.abuhassan.ui.theme.tertiaryLight
@Composable
fun CategoryList(categories: List<CategoryState>){
    val selectedIndex = remember {
        mutableStateOf(0)
    }
    LazyRow(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween){
        items(categories.size){
                index -> CategoryItem(catergoryState = categories[index], index = index, selectedIndex = selectedIndex)
        }
    }
}
@Composable()
fun CategoryItem(catergoryState: CategoryState, index: Int, selectedIndex: MutableState<Int>){
    Box(modifier = Modifier
        .size(width = 106.dp, height = 146.dp).padding(3.dp)
        .clickable {
            selectedIndex.value = index
        }
        .clip(RoundedCornerShape(16.dp))
        .background(
            if (selectedIndex.value == index) tertiaryLight else surfaceVariantLight
        ),
        contentAlignment = Alignment.Center)
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Icon(painter = painterResource(id = catergoryState.resId), contentDescription = null,
                modifier = Modifier.size(48.dp),
                tint = if (selectedIndex.value == index) Color.White else Color.Black)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = catergoryState.title , color = if (selectedIndex.value == index) Color.White else Color.Black)
        }
    }
}