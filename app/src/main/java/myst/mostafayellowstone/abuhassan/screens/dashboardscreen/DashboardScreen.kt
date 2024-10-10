package myst.mostafayellowstone.abuhassan.screens.dashboardscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import myst.mostafayellowstone.abuhassan.R
import myst.mostafayellowstone.abuhassan.components.CardViewBanner
import myst.mostafayellowstone.abuhassan.components.CategoryCard
import myst.mostafayellowstone.abuhassan.components.CategoryList
import myst.mostafayellowstone.abuhassan.components.IconWithText
import myst.mostafayellowstone.abuhassan.components.PopularItem
import myst.mostafayellowstone.abuhassan.components.PopularItemList
import myst.mostafayellowstone.abuhassan.data.local.domain.model.CategoryState
import myst.mostafayellowstone.abuhassan.data.local.domain.model.PopularItemsState
import myst.mostafayellowstone.abuhassan.ui.theme.AppTheme
import myst.mostafayellowstone.abuhassan.ui.theme.onPrimaryLight
import myst.mostafayellowstone.abuhassan.ui.theme.surfaceVariantLight
import myst.mostafayellowstone.abuhassan.ui.theme.tertiaryLight

@Composable
fun DashboardScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 12.dp, vertical = 20.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .padding(vertical = 28.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(painter = painterResource(id = R.drawable.menu),
                    contentDescription = "menu-icon",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable {})
                IconWithText(text = "California,US")
                Image(painter = painterResource(id = R.drawable.search),
                    contentDescription = "search-icon",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable {})
            }
                CardViewBanner(
                    text = "Taste the Love in Every Bite.",
                    subText = "Fresh, Homemade, Delicious",
                    buttonText = "Order Now",
                    onClick = {})
        Text(text = "Categories",
            modifier = Modifier.padding(vertical = 12.dp),
            style = MaterialTheme.typography.labelLarge.copy(fontSize = 24.sp))
        Spacer(modifier = Modifier.height(5.dp))
        CategoryList(categories = listOf(
            CategoryState(R.drawable.hamburger, title = "Burger"),
            CategoryState(R.drawable.pizza , title = "Pizza"),
            CategoryState(R.drawable.drinks , title = "Drinks"),
            CategoryState(R.drawable.others , title = "Others")))
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "Popular Dishes",
            modifier = Modifier.padding(vertical = 8.dp),
            style = MaterialTheme.typography.labelLarge.copy(fontSize = 24.sp))
        Spacer(modifier = Modifier.height(20.dp))
        PopularItemList(popularList = listOf(
            PopularItemsState(ResId = R.drawable.salad_pesto_pizza, title = "Salad Pesto Pizza" , description ="pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly—usually, in a commercial setting, using a wood-fired oven heated to a very high temperature—and served hot",
               price = 75.00,
                calori = 540.0,
                rate = 3.2,
                ingradients = listOf(
                    R.drawable.ing1,
                    R.drawable.ing2,
                    R.drawable.ing3,
                    R.drawable.ing4,
                    R.drawable.ing5,
                )
            ),
            PopularItemsState(ResId = R.drawable.salad_pesto_pizza, title = "Salad Pesto Pizza" , description ="pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly—usually, in a commercial setting, using a wood-fired oven heated to a very high temperature—and served hot",
                price = 75.00,
                calori = 540.0,
                rate = 3.2,
                ingradients = listOf(
                    R.drawable.ing1,
                    R.drawable.ing2,
                    R.drawable.ing3,
                    R.drawable.ing4,
                    R.drawable.ing5,
                )
            ),
            PopularItemsState(ResId = R.drawable.salad_pesto_pizza, title = "Salad Pesto Pizza" , description ="pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly—usually, in a commercial setting, using a wood-fired oven heated to a very high temperature—and served hot",
                price = 75.00,
                calori = 540.0,
                rate = 3.2,
                ingradients = listOf(
                    R.drawable.ing1,
                    R.drawable.ing2,
                    R.drawable.ing3,
                    R.drawable.ing4,
                    R.drawable.ing5,
                )
            ),
            PopularItemsState(ResId = R.drawable.salad_pesto_pizza, title = "Salad Pesto Pizza" , description ="pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly—usually, in a commercial setting, using a wood-fired oven heated to a very high temperature—and served hot",
                price = 75.00,
                calori = 540.0,
                rate = 3.2,
                ingradients = listOf(
                    R.drawable.ing1,
                    R.drawable.ing2,
                    R.drawable.ing3,
                    R.drawable.ing4,
                    R.drawable.ing5,
                )
            ),
            PopularItemsState(ResId = R.drawable.salad_pesto_pizza, title = "Salad Pesto Pizza" , description ="pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly—usually, in a commercial setting, using a wood-fired oven heated to a very high temperature—and served hot",
                price = 75.00,
                calori = 540.0,
                rate = 3.2,
                ingradients = listOf(
                    R.drawable.ing1,
                    R.drawable.ing2,
                    R.drawable.ing3,
                    R.drawable.ing4,
                    R.drawable.ing5,
                )
            ),
            PopularItemsState(ResId = R.drawable.salad_pesto_pizza, title = "Salad Pesto Pizza" , description ="pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly—usually, in a commercial setting, using a wood-fired oven heated to a very high temperature—and served hot",
                price = 75.00,
                calori = 540.0,
                rate = 3.2,
                ingradients = listOf(
                    R.drawable.ing1,
                    R.drawable.ing2,
                    R.drawable.ing3,
                    R.drawable.ing4,
                    R.drawable.ing5,
                )
            ),
        ))
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
       DashboardScreen()
    }
}
